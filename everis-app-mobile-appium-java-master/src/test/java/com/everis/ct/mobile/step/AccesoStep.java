package com.everis.ct.mobile.step;

import com.everis.ct.mobile.service.aspect.evidence.ScreenShot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ResourceBundle;

@Component
@ScreenShot
public class AccesoStep {

    @Autowired
    private Views view;

    public void avanceTutorial() throws InterruptedException {
        view.acceso().verificarAperturaAplicacion();
        view.acceso().tapSiguiente();
        view.acceso().tapSiguiente();
        view.acceso().tapRegistrarEstablecimiento();
    }

    public void introducirPincode() {
        ResourceBundle datosUser = ResourceBundle.getBundle("application");
        view.acceso().verificarPantallaIntroduccionCodigo();
        view.acceso().sendCodigoAcceso(datosUser.getString("pincode"));
        view.acceso().tapSiguiente();
    }

    public void verificarErrorCodigo() {
        view.acceso().verificarErrorCodigo();
        view.acceso().tapAceptar();
    }

    public void accederConCuenta(){
        view.acceso().tapYaTengoCuenta();
    }

}