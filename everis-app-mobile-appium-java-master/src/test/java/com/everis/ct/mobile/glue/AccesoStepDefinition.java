package com.everis.ct.mobile.glue;

import com.everis.ct.mobile.MobileAutomationApplication;
import com.everis.ct.mobile.lib.MobileDriverManager;
import com.everis.ct.mobile.step.AccesoStep;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.Reporter;
import org.testng.xml.XmlTest;

import java.net.MalformedURLException;

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

    @Dado("^que abro la aplicacion$")
    public void queAbroLaAplicacion() throws MalformedURLException {
        //Parametros de la suite testng definida en xml
        XmlTest xmlTest = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest();
        String port = xmlTest.getParameter("port");
        String udid = xmlTest.getParameter("udid");
        String patformName = xmlTest.getParameter("platformName");
        manager.setUpDriver(port, udid, patformName);
        manager.clearCacheApp("com.android.chrome");
        manager.driverOnDetails();
    }

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
