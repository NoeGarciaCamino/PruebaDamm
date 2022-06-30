package com.everis.ct.mobile.glue;

import com.everis.ct.mobile.MobileAutomationApplication;
import com.everis.ct.mobile.lib.MobileDriverManager;
import com.everis.ct.mobile.step.AccesoStep;
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

    @Dado("que ya estoy registrado")
    public void queYaEstoyRegistrado() {
        accesoStep.accederConCuenta();
    }

    @Cuando("hago login con el email {string} y la pass {string}")
    public void queHagoLoginConElEmailYLaPass(String email, String pass) {
        loginStep.aceptarTerminosGoogle();
        loginStep.aceptarSync();
        loginStep.introducirEmail(email);
        loginStep.introducirPass(pass);
        loginStep.accederHome();

    }

    @Entonces("validar que se accede a la home")
    public void validarQueSeAccedeALaHome() {
        loginStep.verificarHome();
    }

    @Entonces("cambio de establecimiento")
    public void cambioDeEstablecimiento() {
        loginStep.cambioEst();
    }
}


//    @Value("#{${capabilities.config}}")
//    private Map<String,Object> capsMap;
//    @Value("${capabilities.appiumHub}")
//    private String appiumHub;
//
//    @Test
//    public void android() throws MalformedURLException {
//        System.out.println("myYamlMap: " + capsMap);
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        for(Map.Entry<String, Object> caps : capsMap.entrySet()){
//            capabilities.setCapability(caps.getKey(), caps.getValue());
//        }
//        AppiumDriver<MobileElement> driver = new AndroidDriver<>(new URL(appiumHub), capabilities);
//
//        System.out.println("getCapabilities(): " + driver.getCapabilities());
//        System.out.println("getSessionDetails(): " + driver.getSessionDetails());