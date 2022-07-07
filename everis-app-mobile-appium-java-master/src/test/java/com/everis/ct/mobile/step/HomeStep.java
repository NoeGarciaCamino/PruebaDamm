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

    public void tapMiguelito(){
        view.home().pulsarMigueltio();
    }

    public void verificarOtroNegocio(String Bar){
        view.home().verificarAcceso();
        view.home().verificarTituloBar(Bar);
        view.home().tapMenuLateral();
        view.menuLateral().tapBotonConfig();
        view.setting().flagConsumo();
        view.setting().aceptarPopUpConsumo();
        view.setting().pulsarAtras();
        view.home().verificarNoAparece("MI NEGOCIO");
    }

    public void verificacionCat(){
        view.home().verificarCat("Consum total");
    }

    public void verificacionEsp(){
        view.home().verificarEsp("Consumo total");
    }

    public void verificarAparece(){
        view.home().verificarAparece("MI NEGOCIO");
    }
}
