package com.everis.ct.mobile.glue;

import com.everis.ct.mobile.MobileAutomationApplication;
import com.everis.ct.mobile.lib.MobileDriverManager;
import com.everis.ct.mobile.step.AccesoStep;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.everis.ct.mobile.service.util.UtilMobile.getValueFromDataTable;

@CucumberContextConfiguration
@SpringBootTest(classes = MobileAutomationApplication.class)
public class AccesoStepDefinition {

    @Autowired
    private AccesoStep accesoStep;

    @Autowired
    private MobileDriverManager manager;

    @Dado("que abro la aplicacion mobile en:")
    public void queAbroLaAplicacionMobileEn(DataTable dataTable) {
        var port = getValueFromDataTable(dataTable, "port");
        var udid = getValueFromDataTable(dataTable, "udid");
        var platformName = getValueFromDataTable(dataTable, "platformName");
        manager.setUpDriver(port, udid, platformName);
    }

    @Dado("^que abro la aplicacion mobile$")
    public void abroLaAplicacionMobile() {
        manager.setUpDriver();
        manager.driverOnDetails();
        manager.clearCacheApp("com.android.chrome");
    }

//    @Dado("que busco el nuevo video {string}")
//    public void queBuscoElNuevoVideo(String nombreVideo) {
//        homeStep.searchVideo(nombreVideo);
//    }
//
//    @Entonces("validar si hay mas de un resultado")
//    public void validarSiHayMasDeUnResultado() {
//        Assertions.assertTrue(homeStep.getSizeResult() > 0, "El numero de resultados es igual a 0.");
//    }

    @Dado("que registro mi establecimiento")
    public void queRegistroMiEstablecimiento() throws InterruptedException {
        accesoStep.avanceTutorial();
    }

    @Cuando("informo el pincode invalido")
    public void informoElPincodeInvalido() {
        accesoStep.introducirPincode();
    }

    @Entonces("validar que aparece un mensaje de error indicando que el pincode no es valido")
    public void validarQueApareceUnMensajeDeErrorIndicandoQueElPincodeNoEsValido() {
        accesoStep.verificarErrorCodigo();
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