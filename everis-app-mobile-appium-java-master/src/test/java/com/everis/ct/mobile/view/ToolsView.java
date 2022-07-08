package com.everis.ct.mobile.view;

import com.everis.ct.mobile.base.MobileBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class ToolsView extends MobileBase {

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(xpath = "//*[contains(@text,'Producto')]")
    protected MobileElement campoProducto;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(xpath = "//*[contains(@text,'marcas')]")
    protected MobileElement campoMarcas;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(xpath = "//*[contains(@text,'TODAS')]")
    protected MobileElement campoTodas;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(xpath = "//*[contains(@text,'ME INTERESA')]")
    protected MobileElement campoMeInteresa;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(xpath = "//*[contains(@text,'Logo HorecaTec')]")
    protected MobileElement logoWebCartaDigital;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(xpath = "//*[contains(@text,'Visualizar carta')]")
    protected MobileElement botonVerCarta;


    public void textoProducto(){
        waitUntilElementIsVisible(campoProducto,15);
    }

    public void textoMarcas(){
        waitUntilElementIsVisible(campoMarcas,15);
    }

    public void textoTodas(){
        waitUntilElementIsVisible(campoTodas,15);
    }

    public void textoMeInteresa(){
        waitUntilElementIsVisible(campoMeInteresa,15);
    }

    public void logoHoreca(){
        waitUntilElementIsVisible(logoWebCartaDigital,15);
    }

    public void botonVerCarta(){
        waitUntilElementIsVisible(botonVerCarta,15);
    }
}
