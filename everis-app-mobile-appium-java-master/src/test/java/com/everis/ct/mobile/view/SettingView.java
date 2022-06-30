package com.everis.ct.mobile.view;

import com.everis.ct.mobile.base.MobileBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Assert;

public class SettingView extends MobileBase{

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(xpath = "//*[contains(@text,'USUARIO')]")
    protected MobileElement tituloUsuario;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(xpath = "//*[contains(@text,'Cambiar contraseña')]")
    protected MobileElement cambiarPass;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(xpath = "//*[contains(@text,'Contraseña actual')]")
    protected MobileElement passActual;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(xpath = "//*[contains(@text,'Introduce')]")
    protected MobileElement passNueva;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(xpath = "//*[contains(@text,'Repite')]")
    protected MobileElement repitePass;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(id = "com.damm.dammbars.pre:id/save_button_view")
    protected MobileElement botonGuardarPass;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(xpath = "//*[contains(@text,'Cerrar')]")
    protected MobileElement botonCerrarSesion;

    public void verificarTituloUsuario(){
        waitUntilElementIsVisible(tituloUsuario, 15);
    }

    public void cambiarPass(){
        waitUntilElementIsVisible(cambiarPass, 15);
        tap(cambiarPass);
    }

    public void passActual(String pass){
        waitUntilElementIsVisible(passActual, 15);
        type(passActual,pass,10);
    }

    public void passNueva(String pass2){
        waitUntilElementIsVisible(passNueva, 15);
        type(passNueva,pass2,10);
    }

    public void repitePass(String pass2){
        waitUntilElementIsVisible(repitePass, 15);
        type(repitePass,pass2,10);
    }

    public void guardarPass(){
        waitUntilElementIsVisible(botonGuardarPass, 15);
        tap(botonGuardarPass);
    }

    public void cerrarSesion(){
        ScrollToElement(botonCerrarSesion);
        waitUntilElementIsVisible(botonCerrarSesion, 5);
        tap(botonCerrarSesion);
    }
}
