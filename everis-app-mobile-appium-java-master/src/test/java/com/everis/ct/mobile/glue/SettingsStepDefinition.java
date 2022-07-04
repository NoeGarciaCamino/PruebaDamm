package com.everis.ct.mobile.glue;

import com.everis.ct.mobile.MobileAutomationApplication;
import com.everis.ct.mobile.lib.MobileDriverManager;
import com.everis.ct.mobile.step.*;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = MobileAutomationApplication.class)
public class SettingsStepDefinition {
    @Autowired
    private SettingStep settingStep;
    @Autowired
    private LoginStep loginStep;

    @Autowired
    private HomeStep homeStep;

    @Autowired
    private MenuLateralStep menuLateralStep;

    @Autowired
    private MobileDriverManager manager;

    @Autowired
    private AccesoStep accesoStep;

    @Y("cambio la pass antigua por la pass nueva")
    public void cambioLaPass() {
        homeStep.tapMenuHamburguesa();
        menuLateralStep.tapConfiguracion();
        settingStep.verificarMenuConfig();
        settingStep.accesoCambioPass();
        settingStep.introducirPassActual();
        settingStep.introducirPassNueva();
        settingStep.repetirPassNueva();
        settingStep.tapGuardar();
    }

    @Entonces("hago logout y login con el email y la pass nueva")
    public void hagoLogoutYLoginConElEmailYLaPassNueva() {
        settingStep.pulsarCerrarSesion();
        manager.quitDriver();
        manager.setUpDriver();
        manager.clearCacheApp("com.android.chrome");
        accesoStep.accederConCuenta();
        loginStep.aceptarTerminosGoogle();
        loginStep.aceptarSync();
        loginStep.introducirEmail();
        loginStep.introducirPass();
        loginStep.accederHome();
        loginStep.verificarHome();
    }

    @Dado("que accedo al menu de configuración")
    public void queAccedoAlMenuDeConfiguración() {
        homeStep.tapMenuHamburguesa();
        menuLateralStep.tapConfiguracion();
        settingStep.verificarMenuConfig();
    }

    @Cuando("accedo a mis establecimientos")
    public void accedoAMisEstablecimientos() {
        settingStep.pulsarMisEstablecimientos();
    }

    @Y("verifico el establecimiento por defecto")
    public void verificoElEstablecimientoPorDefecto() {
        settingStep.verificacionBarDefecto();
    }

    @Y("cambio el establecimiento predeterminado")
    public void cambioElEstablecimientoPredeterminado() {
        settingStep.tapOtroNegocio();
        settingStep.tapGuardar();
    }

    @Y("se reestablece el establecimiento por defecto")
    public void seReestableceElEstablecimientoPorDefecto() {
        homeStep.tapMenuHamburguesa();
        menuLateralStep.tapConfiguracion();
        settingStep.verificarMenuConfig();
        settingStep.pulsarMisEstablecimientos();
        settingStep.tapBarMiguelito();
        settingStep.tapGuardar();
        homeStep.verificarEstDefecto("BAR MIGUELITO");
    }
}


