package com.company.ceum.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum MessageBox implements EnumClass<Integer> {

    INBOX(1),
    OUTBOX(2);

    private Integer id;

    MessageBox(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static MessageBox fromId(Integer id) {
        for (MessageBox at : MessageBox.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}