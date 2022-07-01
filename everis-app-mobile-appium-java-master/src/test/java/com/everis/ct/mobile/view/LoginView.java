package com.everis.ct.mobile.view;

import com.everis.ct.mobile.base.MobileBase;
import com.everis.ct.mobile.service.util.ReadProperties;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

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


    public void sendEmail() {
        ReadProperties properties = new ReadProperties();
        waitUntilElementIsVisible(campoEmail, 20);
        campoEmail.sendKeys(properties.pasarEmail());
    }

    public void sendPass() {
        ReadProperties properties = new ReadProperties();
        waitUntilElementIsVisible(campoPass, 15);
        campoPass.sendKeys(properties.pasarPass());
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