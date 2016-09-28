package com.company.ceum.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Lob;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "CEUM_MESSAGE_TEXT")
@Entity(name = "ceum$MessageText")
public class MessageText extends StandardEntity {
    private static final long serialVersionUID = 1666619900788692522L;

    @Lob
    @Column(name = "TEXT", nullable = false)
    protected String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }


}