package com.everis.ct.mobile.view;

import com.everis.ct.mobile.base.MobileBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import java.util.List;

public class ToolsView extends MobileBase {

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(xpath = "//*[contains(@text,'PROMOCIONES')]")
    protected MobileElement campoPromociones;

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
}
