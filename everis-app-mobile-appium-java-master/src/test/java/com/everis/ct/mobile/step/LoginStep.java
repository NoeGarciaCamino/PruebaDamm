package com.everis.ct.mobile.step;

import com.everis.ct.mobile.service.aspect.evidence.ScreenShot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@ScreenShot
public class LoginStep {

    @Autowired
    private Views view;

    public void accesoPantallaLogin() {
        view.acceso().tapYaTengoCuenta();
    }

    public void aceptarTerminosGoogle(){
        view.login().tapTerminosGoogle();
    }

    public void aceptarSync(){
        view.login().tapSync();
    }

    public void introducirEmail(String email) {
        view.login().sendEmail(email);
    }

    public void introducirPass(String pass) {
        view.login().sendPass(pass);
    }

    public void accederHome() {
        view.login().tapAcceder();
    }

    public void verificarHome(){
        view.home().verificarAcceso();
    }

    public void cambioEst(){
        view.home().desplegarSelectorEstab();
    }

//    public int getSizeResult() {
//        return view.results().getResults();
//    }

}