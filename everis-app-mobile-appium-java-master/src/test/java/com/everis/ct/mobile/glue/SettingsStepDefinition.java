package com.everis.ct.mobile.glue;

import com.everis.ct.mobile.MobileAutomationApplication;
import com.everis.ct.mobile.lib.MobileDriverManager;
import com.everis.ct.mobile.step.AccesoStep;
import com.everis.ct.mobile.step.SettingStep;
import com.everis.ct.mobile.step.LoginStep;
import io.cucumber.java.PendingException;
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
    private MobileDriverManager manager;

    @Autowired
    private AccesoStep accesoStep;

    @Y("cambio la pass antigua {string} por la pass nueva {string}")
    public void cambioLaPass(String pass, String passNueva) {
        settingStep.tapMenuHamburguesa();
        settingStep.tapConfiguracion();
        settingStep.verificarMenuConfig();
        settingStep.accesoCambioPass();
        settingStep.introducirPassActual(pass);
        settingStep.introducirPassNueva(passNueva);
        settingStep.repetirPassNueva(passNueva);
        settingStep.guardarPassNueva();
    }

    @Entonces("hago logout y login con el email {string} y la pass nueva {string}")
    public void hagoLogoutYLoginConElEmailYLaPassNueva(String email, String pass) {
        settingStep.pulsarCerrarSesion();
        manager.quitDriver();
        manager.setUpDriver();
        manager.clearCacheApp("com.android.chrome");
        accesoStep.accederConCuenta();
        loginStep.aceptarTerminosGoogle();
        loginStep.aceptarSync();
        loginStep.introducirEmail(email);
        loginStep.introducirPass(pass);
        loginStep.accederHome();
        loginStep.verificarHome();
    }
}


