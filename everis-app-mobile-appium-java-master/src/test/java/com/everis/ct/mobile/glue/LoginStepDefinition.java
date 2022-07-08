package com.everis.ct.mobile.glue;

import com.everis.ct.mobile.MobileAutomationApplication;
import com.everis.ct.mobile.lib.MobileDriverManager;
import com.everis.ct.mobile.step.AccesoStep;
import com.everis.ct.mobile.step.HomeStep;
import com.everis.ct.mobile.step.LoginStep;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.everis.ct.mobile.service.util.UtilMobile.getValueFromDataTable;


@SpringBootTest(classes = MobileAutomationApplication.class)
public class LoginStepDefinition {

    @Autowired
    private AccesoStep accesoStep;

    @Autowired
    private LoginStep loginStep;

    @Autowired
    private HomeStep homeStep;

    @Dado("que ya estoy registrado")
    public void queYaEstoyRegistrado() {
        accesoStep.accederConCuenta();
    }

    @Cuando("hago login con el email y la pass")
    public void queHagoLoginConElEmailYLaPass() {
        loginStep.aceptarTerminosGoogle();
        loginStep.aceptarSync();
        loginStep.introducirEmail();
        loginStep.introducirPass();
        loginStep.accederHome();

    }

    @Entonces("validar que se accede a la home")
    public void validarQueSeAccedeALaHome() {
        loginStep.verificarHome();
    }

}
