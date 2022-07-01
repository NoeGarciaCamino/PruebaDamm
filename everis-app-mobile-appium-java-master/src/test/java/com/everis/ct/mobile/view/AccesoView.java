package com.everis.ct.mobile.view;

import com.everis.ct.mobile.base.MobileBase;
import com.everis.ct.mobile.service.util.ReadProperties;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class AccesoView extends MobileBase {

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(id = "com.damm.dammbars.pre:id/appCompatTextView3")
    protected MobileElement tituloBienvenida;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(id = "com.damm.dammbars.pre:id/next_button_view")
    protected MobileElement botonSiguiente;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(id = "com.damm.dammbars.pre:id/bottom_button_view")
    protected MobileElement enlaceYaTengoCuenta;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(id = "com.damm.dammbars.pre:id/next_button_view")
    protected MobileElement botonRegistrarEstablecimiento;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(id = "com.damm.dammbars.pre:id/appCompatTextView")
    protected MobileElement tituloIntroduceTuCodigo;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(id = "com.damm.dammbars.pre:id/input_text")
    protected MobileElement campoCodigoAcceso;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(id = "com.damm.dammbars.pre:id/title_text_view")
    protected MobileElement tituloErrorCodigo;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(id = "com.damm.dammbars.pre:id/accept_text_view")
    protected MobileElement botonAceptar;

    public void verificarAperturaAplicacion() throws InterruptedException {
        waitUntilElementIsVisible(tituloBienvenida, 30);
    }

    public void tapSiguiente() {
        waitUntilElementIsVisible(botonSiguiente, 30);
        tap(botonSiguiente);
    }

    public void tapRegistrarEstablecimiento() {
        waitUntilElementIsVisible(botonRegistrarEstablecimiento, 15);
        tap(botonRegistrarEstablecimiento);
    }

    public void verificarPantallaIntroduccionCodigo() {
        waitUntilElementIsVisible(tituloIntroduceTuCodigo, 15);
    }

    public void sendCodigoAcceso() {
        ReadProperties properties = new ReadProperties();
        waitUntilElementIsVisible(campoCodigoAcceso, 15);
        campoCodigoAcceso.sendKeys(properties.pinCode());
    }

    public void verificarErrorCodigo() {
        waitUntilElementIsVisible(tituloErrorCodigo, 10);
    }

    public void tapAceptar() {
        waitUntilElementIsVisible(botonAceptar, 10);
        tap(botonAceptar);
    }

    public void tapYaTengoCuenta() {
        waitUntilElementIsVisible(enlaceYaTengoCuenta, 10);
        tap(enlaceYaTengoCuenta);
    }

//    public void writeAndSearch(String data) {
//        waitUntilElementIsVisible(inputSearch, 15);
//        type(inputSearch, data);
//        if (isAndroid())
//            android().pressKey(AndroidKey.ENTER);
//        else
//            ios().iosDriver().getKeyboard().pressKey("\n");
//    }
}
