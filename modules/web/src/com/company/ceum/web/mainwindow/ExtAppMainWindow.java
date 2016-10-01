package com.company.ceum.web.mainwindow;

import com.haulmont.cuba.gui.WindowManager;
import com.haulmont.cuba.web.app.mainwindow.AppMainWindow;

public class ExtAppMainWindow extends AppMainWindow {

    public void openMessages() {
        openWindow("ceum$Message.browse", WindowManager.OpenType.DIALOG);
    }
}
