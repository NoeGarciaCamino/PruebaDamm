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
        try {
            Robot r = new Robot();
            r.keyPress(KeyEvent.VK_END);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }
}
