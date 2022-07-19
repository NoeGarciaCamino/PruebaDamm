package com.everis.ct.mobile.service.util;

import java.io.*;
import java.util.Properties;

public class ReadProperties {
    Properties properties = new Properties();
    String path = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "application.properties";
    {
        try {
            properties.load(new FileInputStream(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

     public String pinCode(){
      return properties.getProperty("pincode");
     }

    public String pasarEmail(){
        return properties.getProperty("userName");
    }

    public String pasarPass(){
        return properties.getProperty("password");
    }

    public String pasarPassNueva(){
        String pass = properties.getProperty("password");
        String digitos = pass.substring(5,9);
        int numero = Integer.parseInt(digitos);
        String passFinal = pass.substring(0,5) + String.valueOf(numero+1);
        properties.setProperty("passNueva", passFinal);
        return properties.getProperty("passNueva");
    }

    public String pasarEmailNuevo() {
        String email = properties.getProperty("userName");

        int posicionArroba = email.indexOf("@");
        char caracterPrevio = email.charAt(posicionArroba-1);

        if(caracterPrevio == '+') {
            email = email.replace("+1@", "@");
        } else {
            email = email.replace("@", "+1@");
        }
        properties.setProperty("userNameNuevo", email);
        return email;
    }

    public void cambiarPassNXPassA(){
        String passNueva = properties.getProperty("passNueva");
        properties.setProperty("password", passNueva);
    }

    public void cambiarEmailNXEmailA(){
        String passNueva = properties.getProperty("userNameNuevo");
        properties.setProperty("userName", passNueva);
    }

    public void escribirArchivoProperties(){
        try (final OutputStream outputstream = new FileOutputStream(path);) {
            properties.store(outputstream, "File Updated");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


