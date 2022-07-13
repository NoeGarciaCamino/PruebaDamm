package com.everis.ct.mobile.view;

import com.everis.ct.mobile.base.MobileBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MenuLateralView extends MobileBase {

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton")
    @AndroidFindBy(id = "com.damm.dammbars.pre:id/settings_icon")
    protected MobileElement botonEngranaje;

    public void tapBotonConfig(){
        waitUntilElementIsVisible(botonEngranaje, 15);
        tap(botonEngranaje);
    }

    public void pulsarMiNegocio(){
        tapByCoordinates(808);
    }

    public void pulsarConsumo(){
        tapByCoordinates(971);
    }

    public void pulsarPromociones(){
        tapByCoordinates(1236);
    }
}