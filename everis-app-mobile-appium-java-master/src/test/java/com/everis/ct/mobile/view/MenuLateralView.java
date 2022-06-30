package com.everis.ct.mobile.view;

import com.everis.ct.mobile.base.MobileBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Assert;

public class MenuLateralView extends MobileBase {

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(id = "com.damm.dammbars.pre:id/settings_icon")
    protected MobileElement botonEngranaje;

    public void tapBotonConfig(){
        waitUntilElementIsVisible(botonEngranaje, 15);
        tap(botonEngranaje);
    }
}
