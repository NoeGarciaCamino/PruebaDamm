package com.everis.ct.mobile.view;

import com.everis.ct.mobile.base.MobileBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class LoginView extends MobileBase {

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(id = "com.android.chrome:id/terms_accept")
    protected MobileElement botonGoogle;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(id = "com.android.chrome:id/positive_button")
    protected MobileElement botonSync;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(xpath = "(//*[contains(@class,'android.widget.EditText')])[1]")
    protected MobileElement campoEmail;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(xpath = "(//*[contains(@class,'android.widget.EditText')])[2]")
    protected MobileElement campoPass;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(xpath = "//*[contains(@text,'Acceder')]")
    protected MobileElement botonAcceder;


    public void sendEmail(String user) {
        waitUntilElementIsVisible(campoEmail, 20);
        campoEmail.sendKeys(user);
    }

    public void sendPass(String pass) {
        waitUntilElementIsVisible(campoPass, 15);
        campoPass.sendKeys(pass);
    }

    public void tapAcceder() {
        waitUntilElementIsVisible(botonAcceder, 15);
        tap(botonAcceder);
    }

    public void tapTerminosGoogle(){
        waitUntilElementIsVisible(botonGoogle, 15);
        tap(botonGoogle);
    }

    public void tapSync(){
        waitUntilElementIsVisible(botonSync, 15);
        tap(botonSync);
    }
}