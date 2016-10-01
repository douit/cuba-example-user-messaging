package com.company.ceum.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Listeners;

@Listeners("ceum_CustomerCreationEntityListener")
@Table(name = "CEUM_CUSTOMER")
@Entity(name = "ceum$Customer")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = -6378652244667877689L;

    @Column(name = "NAME", nullable = false)
    protected String name;

    @Column(name = "FIRST_NAME")
    protected String firstName;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }


}