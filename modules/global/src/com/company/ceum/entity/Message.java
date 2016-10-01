package com.company.ceum.entity;

import javax.annotation.PostConstruct;
import javax.persistence.*;

import com.haulmont.cuba.core.global.AppBeans;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.security.entity.User;
import java.util.Set;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s: |sender,subject")
@Table(name = "CEUM_MESSAGE")
@Entity(name = "ceum$Message")
public class Message extends StandardEntity {
    private static final long serialVersionUID = -5528392717123259585L;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "SENDER_ID")
    protected User sender;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RECEIVER_ID")
    protected User receiver;

    @Column(name = "SUBJECT")
    protected String subject;

    @Column(name = "ENTITY_REFERENCE")
    protected String entityReference;

    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "MESSAGE_TEXT_ID")
    protected MessageText messageText;


    @Column(name = "READ_", nullable = false)
    protected Boolean read = false;

    public void setRead(Boolean read) {
        this.read = read;
    }

    public Boolean getRead() {
        return read;
    }


    @PostConstruct
    public void init() {
        Metadata metadata = AppBeans.get(Metadata.class);
        this.messageText = metadata.create(MessageText.class);
    }

    public void setMessageText(MessageText messageText) {
        this.messageText = messageText;
    }

    public MessageText getMessageText() {
        return messageText;
    }



    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public User getReceiver() {
        return receiver;
    }


    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getSender() {
        return sender;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setEntityReference(String entityReference) {
        this.entityReference = entityReference;
    }

    public String getEntityReference() {
        return entityReference;
    }


}