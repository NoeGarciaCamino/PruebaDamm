package com.everis.ct.mobile.step;

import com.everis.ct.mobile.service.aspect.evidence.ScreenShot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.Properties;
import java.util.ResourceBundle;

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

    public void introducirEmail() {
        //ResourceBundle datosUser = ResourceBundle.getBundle("application");
        Properties properties = new Properties();
        String path = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "application.properties";
        try {
            properties.load(new FileInputStream(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        view.login().sendEmail(properties.getProperty("userName"));
        properties.setProperty("userName", "!Damm2023");
        try (final OutputStream outputstream = new FileOutputStream(path);) {
            properties.store(outputstream, "File Updated");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String userName = properties.getProperty("userName");
        String digitos = userName.substring(5,9);
        int numero = Integer.parseInt(digitos);
        String passFinal = userName.substring(0,4) + String.valueOf(numero+1);
        properties.setProperty("userName", passFinal);
        try (final OutputStream outputstream = new FileOutputStream(path);) {
            properties.store(outputstream, "File Updated");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void introducirPass() {
        ResourceBundle datosUser = ResourceBundle.getBundle("application");
        view.login().sendPass(datosUser.getString("password"));
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

}