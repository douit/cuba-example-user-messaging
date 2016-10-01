package com.company.ceum.listener;

import com.company.ceum.service.MessageService;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.security.entity.User;
import org.springframework.stereotype.Component;
import com.haulmont.cuba.core.listener.AfterInsertEntityListener;
import java.sql.Connection;
import com.company.ceum.entity.Customer;

import javax.inject.Inject;

@Component("ceum_CustomerCreationEntityListener")
public class CustomerCreationEntityListener implements AfterInsertEntityListener<Customer> {

    @Inject
    MessageService messageService;

    @Inject
    DataManager dataManager;

    @Override
    public void onAfterInsert(Customer entity, Connection connection) {
        //messageService.sendMessage("klaus","Customer created", "Customer " + entity.getFirstName() + " was created",entity);
    }


}