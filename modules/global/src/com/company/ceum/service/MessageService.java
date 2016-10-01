package com.company.ceum.service;


import com.haulmont.cuba.core.entity.Entity;
import com.haulmont.cuba.security.entity.User;

public interface MessageService {
    String NAME = "ceum_MessageService";

    //void sendMessage(User receiver, String subject, String messageText, Entity entityReference);
    void sendMessage(String receiver, String subject, String messageText, Entity entityReference);



}