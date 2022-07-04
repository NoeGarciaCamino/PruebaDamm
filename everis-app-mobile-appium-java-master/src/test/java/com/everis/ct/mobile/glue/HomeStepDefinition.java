package com.everis.ct.mobile.glue;

import com.everis.ct.mobile.MobileAutomationApplication;
import com.everis.ct.mobile.lib.MobileDriverManager;
import com.everis.ct.mobile.step.*;
import io.cucumber.java.es.Entonces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = MobileAutomationApplication.class)
public class HomeStepDefinition {

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

    @Entonces("retrocedo a la home y confirmo los datos del bar")
    public void retrocedoALaHomeYConfirmoLosDatosDelBar() {

    }
}
