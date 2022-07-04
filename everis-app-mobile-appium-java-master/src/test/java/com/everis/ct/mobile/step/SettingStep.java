package com.everis.ct.mobile.step;

import com.everis.ct.mobile.service.aspect.evidence.ScreenShot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
@ScreenShot
public class SettingStep {


    @Autowired
    private Views view;

    public void verificarMenuConfig(){
        view.setting().verificarTituloUsuario();
    }

    public void accesoCambioPass(){
        view.setting().cambiarPass();
    }

    public void introducirPassActual(){
        view.setting().passActual();
    }

    public void introducirPassNueva(){
        view.setting().passNueva();
    }

    public void repetirPassNueva(){
        view.setting().repitePass();
    }

    public void tapGuardar(){
        view.setting().botonGuardar();
    }

    public void pulsarCerrarSesion(){
        view.setting().cerrarSesion();
    }
    public void pulsarMisEstablecimientos(){
        view.setting().accesoMisEstablecimientos();
    }

    public void verificacionBarDefecto(){
        view.setting().verificarBarDefecto();
    }
    public void tapAtras(){
        view.setting().pulsarAtras();
    }

    public void tapOtroNegocio(){
        view.setting().pulsarOtroNegocio();
    }

    public void tapBarMiguelito(){
        view.setting().pulsarBarMiguelito();
    }
}
