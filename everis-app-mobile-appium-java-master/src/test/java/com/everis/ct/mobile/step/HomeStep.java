package com.everis.ct.mobile.step;

import com.everis.ct.mobile.service.aspect.evidence.ScreenShot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.awt.event.KeyEvent;

@Component
@ScreenShot
public class HomeStep {

    @Autowired
    private Views view;

    public void tapMenuHamburguesa(){
        view.home().tapMenuLateral();

//        try {
//            Robot r = new Robot();
//            r.keyPress(KeyEvent.VK_END);
//        } catch (AWTException e) {
//            throw new RuntimeException(e);
//        }
    }

    public void verificarEstDefecto(String Bar){
        view.home().verificarTituloEncabezado(Bar);
        view.home().tapMenuLateral();
        view.menuLateral().tapBotonConfig();
        view.setting().flagConsumo();
        view.setting().aceptarPopUpConsumo();
        view.setting().pulsarAtras();
        view.home().verificarNoAparece("MI NEGOCIO");
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

    public void verificarOtroNegocio(String Titulo){
        view.home().verificarAcceso();
        view.home().verificarTituloEncabezado(Titulo);
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

    public void verificarAparece(String Texto){
        view.home().verificarAparece(Texto);
    }

    public void verificacionNoAparece(String texto){
        view.home().verificarNoAparece(texto);
    }

    public void verificarEncabezado(String Titulo){
        view.home().verificarTituloEncabezado(Titulo);
    }

    public void tapCartaDigital(){
        view.home().pulsarCartaDigital();
    }

    public void tapEsteDispositivo(){
        view.home().pulsarEsteDispositivo();
    }
}
