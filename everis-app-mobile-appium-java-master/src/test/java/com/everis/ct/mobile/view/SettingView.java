package com.everis.ct.mobile.view;

import com.everis.ct.mobile.base.MobileBase;
import com.everis.ct.mobile.service.util.ReadProperties;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Assert;

public class SettingView extends MobileBase{

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(xpath = "//*[contains(@text,'USUARI')]")
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
    protected MobileElement botonGuardar;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(xpath = "//*[contains(@text,'Cerrar')]")
    protected MobileElement botonCerrarSesion;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(xpath = "//*[contains(@text,'Mis establecimientos')]")
    protected MobileElement misEstablecimientos;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(xpath = "//*[contains(@text,'BAR')]")
    protected MobileElement barMiguelito;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(xpath = "//*[contains(@text,'RESID')]")
    protected MobileElement otroNegocio;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(xpath = "(//*[contains(@resource-id,'com.damm.dammbars.pre:id/image_right_view')])[1]")
    protected MobileElement checkBoxMiguelito;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(accessibility = "Desplazarse hacia arriba")
    protected MobileElement botonAtras;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(accessibility = "Navega cap a dalt")
    protected MobileElement botonAtrasCat;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(xpath = "//*[contains(@text,'Idioma')]")
    protected MobileElement botonIdioma;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(xpath = "(//*[contains(@resource-id,'com.damm.dammbars.pre:id/title_text_view')])[2]")
    protected MobileElement idiomaCat;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(xpath = "(//*[contains(@resource-id,'com.damm.dammbars.pre:id/title_text_view')])[1]")
    protected MobileElement idiomaEsp;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(id = "com.damm.dammbars.pre:id/accept_text_view")
    protected MobileElement aceptarPopUp;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(xpath = "(//*[contains(@resource-id,'com.damm.dammbars.pre:id/switch_view')])[3]")
    protected MobileElement flagConsumos;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(xpath = "//*[contains(@text,'SÍ')]")
    protected MobileElement popUpSi;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(xpath = "//*[contains(@text,'Autorización')]")
    protected MobileElement autorizacionDatos;

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

    public void botonGuardar(){
        waitUntilElementIsVisible(botonGuardar, 15);
        tap(botonGuardar);
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

    public void pulsarAtras(){
        waitUntilElementIsVisible(botonAtras,15);
        tap(botonAtras);
    }

    public void pulsarAtrasCat(){
        waitUntilElementIsVisible(botonAtrasCat,15);
        tap(botonAtrasCat);
    }

    public void pulsarOtroNegocio(){
        waitUntilElementIsVisible(otroNegocio,15);
        tap(otroNegocio);
    }

    public void pulsarBarMiguelito(){
        waitUntilElementIsVisible(barMiguelito,15);
        tap(barMiguelito);
    }

    public void accesoIdiomas(){
        ScrollToElement(botonIdioma);
        waitUntilElementIsVisible(botonIdioma, 5);
        tap(botonIdioma);
    }

    public void pulsarCat(){
        waitUntilElementIsVisible(idiomaCat,15);
        tap(idiomaCat);
    }

    public void pulsarEsp(){
        waitUntilElementIsVisible(idiomaEsp,15);
        tap(idiomaEsp);
    }

    public void pulsarAceptar(){
        waitUntilElementIsVisible(aceptarPopUp,15);
        tap(aceptarPopUp);
    }

    public void flagConsumo(){
        ScrollToElement(autorizacionDatos);
        tap(flagConsumos);
        sleep(8000);
    }

    public void aceptarPopUpConsumo(){
        waitUntilElementIsVisible(popUpSi,15);
        tap(popUpSi);
        sleep(8000);
    }
}
