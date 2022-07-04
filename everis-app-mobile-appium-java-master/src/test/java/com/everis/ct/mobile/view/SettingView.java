package com.everis.ct.mobile.view;

import com.everis.ct.mobile.base.MobileBase;
import com.everis.ct.mobile.service.util.ReadProperties;
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
    @AndroidFindBy(xpath = "//*[contains(@text,'Mis establecimientos')]")
    protected MobileElement botonCerrarSesion;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(xpath = "//*[contains(@text,'Bar')]")
    protected MobileElement misEstablecimientos;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(xpath = "//*[contains(@text,'Cerrar')]")
    protected MobileElement barMiguelito;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(xpath = "(//*[contains(@resource-id,'com.damm.dammbars.pre:id/image_right_view')])[1]")
    protected MobileElement checkBoxMiguelito;

    public void verificarTituloUsuario(){
        waitUntilElementIsVisible(tituloUsuario, 15);
    }

    public void cambiarPass(){
        waitUntilElementIsVisible(cambiarPass, 15);
        tap(cambiarPass);
    }

    public void passActual(){
        ReadProperties properties = new ReadProperties();
        waitUntilElementIsVisible(passActual, 15);
        passActual.sendKeys(properties.pasarPass());
    }

    public void passNueva(){
        ReadProperties properties = new ReadProperties();
        waitUntilElementIsVisible(passNueva, 15);
        passNueva.sendKeys(properties.pasarPassNueva());
        properties.escribirArchivoProperties();
        properties.cambiarPassNXPassA();
        properties.escribirArchivoProperties();
    }

    public void repitePass(){
        ReadProperties properties = new ReadProperties();
        waitUntilElementIsVisible(repitePass, 15);
        repitePass.sendKeys(properties.pasarPass());
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

    public void accesoMisEstablecimientos(){
        ScrollToElement(misEstablecimientos);
        waitUntilElementIsVisible(misEstablecimientos, 5);
        tap(misEstablecimientos);
    }

    public void verificarBarDefecto(){
        waitUntilElementIsVisible(barMiguelito,15);
        checkBoxMiguelito.isSelected();
    }
}
