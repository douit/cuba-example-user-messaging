package com.company.ceum.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.security.entity.User;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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

    @Column(name = "MESSAGE_BOX", nullable = false)
    protected Integer messageBox;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MESSAGE_TEXT_ID")
    protected MessageText messageText;

    public void setMessageText(MessageText messageText) {
        this.messageText = messageText;
    }

    public MessageText getMessageText() {
        return messageText;
    }


    public void setMessageBox(MessageBox messageBox) {
        this.messageBox = messageBox == null ? null : messageBox.getId();
    }

    public MessageBox getMessageBox() {
        return messageBox == null ? null : MessageBox.fromId(messageBox);
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