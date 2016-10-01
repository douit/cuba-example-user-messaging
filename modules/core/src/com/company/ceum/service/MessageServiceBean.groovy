package com.company.ceum.service

import com.company.ceum.entity.Message
import com.haulmont.cuba.core.entity.Entity;
import com.haulmont.cuba.core.global.DataManager
import com.haulmont.cuba.core.global.LoadContext
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.security.entity.User
import org.springframework.stereotype.Service;


import javax.inject.Inject;

@Service(MessageService.NAME)
public class MessageServiceBean implements MessageService {

    @Inject
    DataManager dataManager

    @Inject
    Metadata metadata


    @Override
    void sendMessage(String receiver, String subject, String messageText, Entity entityReference) {

        LoadContext loadContext = LoadContext.create(User.class)
        .setQuery(LoadContext.createQuery('select p from sec$User p where p.login = :username')
        .setParameter("username", receiver));

        User receiverUser = dataManager.load(loadContext)

        Message message = metadata.create(Message.class)
        message.entityReference = "entityReference"
        message.sender = receiverUser
        message.receiver = receiverUser
        message.subject = subject
        message.messageText.text = messageText

        dataManager.commit(message)
    }




}