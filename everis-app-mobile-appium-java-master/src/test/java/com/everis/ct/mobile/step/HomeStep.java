package com.everis.ct.mobile.step;

import com.everis.ct.mobile.service.aspect.evidence.ScreenShot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@ScreenShot
public class HomeStep {

    @Autowired
    private Views view;

    public void tapMenuHamburguesa(){
        view.home().tapMenuLateral();
    }

    public void verificarEstDefecto(String Bar){
        view.home().verificarTituloBar(Bar);
        view.home().textoPromociones();
    }

    public void cambioEst(){
        view.home().desplegarSelectorEstab();
    }

    public void tapOtroNegocio(){
        view.home().pulsarOtroNegocio();
    }

    public void verificarOtroNegocio(String Bar){
        view.home().verificarAcceso();
        view.home().verificarTituloBar(Bar);
        view.home().textoCartaDigital();
    }
}
