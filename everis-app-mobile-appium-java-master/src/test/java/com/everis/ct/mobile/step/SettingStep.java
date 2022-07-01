package com.everis.ct.mobile.step;

import com.everis.ct.mobile.service.aspect.evidence.ScreenShot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ResourceBundle;

@Component
@ScreenShot
public class SettingStep {


    @Autowired
    private Views view;

    public void tapMenuHamburguesa(){
        view.home().tapMenuLateral();
    }

    public void tapConfiguracion(){
        view.menuLateral().tapBotonConfig();
    }

    public void verificarMenuConfig(){
        view.setting().verificarTituloUsuario();
    }

    public void accesoCambioPass(){
        view.setting().cambiarPass();
    }

    public void introducirPassActual(){
        ResourceBundle datosUser = ResourceBundle.getBundle("application");
        view.login().sendPass(datosUser.getString("password"));
    }

    public void introducirPassNueva(String pass2){
        view.setting().passNueva(pass2);
    }

    public void repetirPassNueva(String pass2){
        view.setting().repitePass(pass2);
    }

    public void guardarPassNueva(){
        view.setting().guardarPass();
    }

    public void pulsarCerrarSesion(){
        view.setting().cerrarSesion();
    }
}
