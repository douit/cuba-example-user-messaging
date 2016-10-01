package com.company.ceum.web.customer

import com.company.ceum.service.MessageService
import com.haulmont.cuba.gui.components.AbstractEditor
import com.company.ceum.entity.Customer

import javax.inject.Inject

public class CustomerEdit extends AbstractEditor<Customer> {


    @Inject
    MessageService messageService;

    @Override
    protected boolean postCommit(boolean committed, boolean close) {
        if (committed && close) {
            messageService.sendMessage("admin", "customer created", "customer ${item.firstName} was created", item)
        }
        super.postCommit(committed, close)
    }
}