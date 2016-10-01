package com.company.ceum.web.message;

import com.company.ceum.entity.MessageText;
import com.company.ceum.service.MessageService;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.core.global.PersistenceHelper;
import com.haulmont.cuba.gui.components.*;
import com.company.ceum.entity.Message;
import com.haulmont.cuba.security.global.UserSession;

import javax.inject.Inject;
import javax.inject.Named;

public class MessageEdit extends AbstractEditor<Message> {

    @Inject
    Metadata metadata;

    @Inject
    UserSession userSession;

    @Inject
    FieldGroup fieldGroup;

    @Inject
    RichTextArea messageTextTextArea;

    @Named("fieldGroup.receiver")
    PickerField receiverPickerField;

    @Override
    protected void initNewItem(Message item) {
        item.setMessageText(metadata.create(MessageText.class));
        item.setSender(userSession.getCurrentOrSubstitutedUser());

        fieldGroup.setEditable(true);
        messageTextTextArea.setEditable(true);

        receiverPickerField.addLookupAction();

    }

}