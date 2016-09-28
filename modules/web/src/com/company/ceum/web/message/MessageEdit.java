package com.company.ceum.web.message;

import com.company.ceum.entity.MessageBox;
import com.company.ceum.entity.MessageText;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.core.global.PersistenceHelper;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.company.ceum.entity.Message;
import com.haulmont.cuba.gui.components.Field;
import com.haulmont.cuba.gui.components.FieldGroup;
import com.haulmont.cuba.gui.components.RichTextArea;
import com.haulmont.cuba.security.global.UserSession;

import javax.inject.Inject;

public class MessageEdit extends AbstractEditor<Message> {

    @Inject
    Metadata metadata;

    @Inject
    UserSession userSession;

    @Inject
    FieldGroup fieldGroup;

    @Inject
    RichTextArea messageTextTextArea;

    @Override
    protected void initNewItem(Message item) {
        item.setMessageText(metadata.create(MessageText.class));
        item.setSender(userSession.getCurrentOrSubstitutedUser());
        item.setMessageBox(MessageBox.INBOX);

        fieldGroup.setEditable(true);
        messageTextTextArea.setEditable(true);

    }

    @Override
    protected void postInit() {
        if (PersistenceHelper.isNew(getItem())) {

        }
    }
}