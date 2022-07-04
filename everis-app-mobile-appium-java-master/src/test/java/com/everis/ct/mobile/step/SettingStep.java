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

    public void guardarPassNueva(){
        view.setting().guardarPass();
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
}
