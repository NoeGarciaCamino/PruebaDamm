package com.everis.ct.mobile.view;

import com.everis.ct.mobile.base.MobileBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Assert;

public class HomeView extends MobileBase {

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(xpath = "//*[contains(@text,'ÚLTIMAS NOVEDADES')]")
    protected MobileElement campoUltNov;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(accessibility = "Open navigation drawer")
    protected MobileElement menuLateral;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(id = "com.damm.dammbars.pre:id/toolbar_title")
    protected MobileElement selectorEstablecimiento;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(xpath = "//*[contains(@text,'BAR MIGUELITO')]")
    protected MobileElement barMiguelito;

    public void verificarAcceso(){
        waitUntilElementIsVisible(campoUltNov, 15);
    }

    public void tapMenuLateral(){
        waitUntilElementIsVisible(menuLateral, 15);
        tap(menuLateral);
    }

    public void desplegarSelectorEstab(){
        waitUntilElementIsVisible(selectorEstablecimiento, 10);
        tap(selectorEstablecimiento);
    }

    //public void verificarTituloBar(){
        //String tituloBar = getText(XXX,3);
        //boolean condicionTituloBar = tituloBar.contains("BAR MIGUELITO");
        //Assert.assertTrue("BAR MIGUELITO",condicionTituloBar);
    //}
}
