package com.everis.ct.mobile.view;

import com.everis.ct.mobile.base.MobileBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class HomeView extends MobileBase {

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(xpath = "//*[contains(@text,'ÚLTIMAS NOVEDADES')]")
    protected MobileElement campoUltNov;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(xpath = "//*[contains(@text,'ÚLTIMES NOVETATS')]")
    protected MobileElement campoUltNovCat;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(xpath = "//*[contains(@text,'CARTA DIGITAL')]")
    protected MobileElement campoCartaDigital;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(accessibility = "Open navigation drawer")
    protected MobileElement menuLateral;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(id = "com.damm.dammbars.pre:id/toolbar_title")
    protected MobileElement encabezado;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(id = "com.damm.dammbars.pre:id/business_title_view")
    protected MobileElement consumoTotalHome;

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(className = "android.widget.TextView")
    protected List <MobileElement> bloquesDom;


    public void verificarAcceso(){
        waitUntilElementIsVisible(campoUltNov, 15);
    }

    public void tapMenuLateral(){
        waitUntilElementIsVisible(menuLateral, 15);
        tap(menuLateral);
    }

    public void desplegarSelectorEstab(){
        waitUntilElementIsVisible(encabezado, 10);
        tap(encabezado);
    }

    public void verificarTituloEncabezado(String Titulo){
        String tituloBar = getText(encabezado,5);
        boolean condicionTituloBar = tituloBar.contains(Titulo);
        Assert.assertTrue(condicionTituloBar, Titulo);
    }

    public void pulsarOtroNegocio(){
        tapByCoordinates(1572);
    }

    public void pulsarMigueltio(){
        tapByCoordinates(1361);
    }

    public void textoCartaDigital(){
        waitUntilElementIsVisible(campoCartaDigital,15);
    }

    public void verificarCat(String Consumo){
        waitUntilElementIsVisible(campoUltNovCat,15);
        String consumoTotal = getText(consumoTotalHome,5);
        boolean condicionTituloConsumo = consumoTotal.contains(Consumo);
        Assert.assertTrue(condicionTituloConsumo, Consumo);
    }

    public void verificarEsp(String Consumo){
        waitUntilElementIsVisible(campoUltNov,15);
        String consumoTotal = getText(consumoTotalHome,5);
        boolean condicionTituloConsumo = consumoTotal.contains(Consumo);
        Assert.assertTrue(condicionTituloConsumo, Consumo);
    }

    public void verificarNoAparece(String texto){
        waitUntilElementIsVisible(campoUltNov,15);
        boolean elemento =  verifyElementInAList(bloquesDom,texto, 15 );
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertFalse(elemento);
    }

    public void verificarAparece(String texto){
        waitUntilElementIsVisible(campoUltNov,15);
        boolean elemento =  verifyElementInAList(bloquesDom,texto, 15 );
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(elemento);
    }
}
