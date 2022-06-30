package com.everis.ct.mobile.base.methods;

import com.everis.ct.mobile.base.dom.ICommonsActions;
import com.everis.ct.mobile.lib.MobileDriverManager;
import io.appium.java_client.*;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.PendingException;

import java.sql.Time;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonsActionsDom implements ICommonsActions {

    private final AppiumDriver<MobileElement> driver;

    public CommonsActionsDom() {
        this.driver = MobileDriverManager.getDriver();
    }

    @Override
    public void tap(MobileElement mobileElement) {
        mobileElement.click();
    }

    @Override
    public void tap(MobileElement mobileElement, int timeOutOnSeconds) {
        waitUntilElementIsClickable(mobileElement, timeOutOnSeconds).click();
    }

    @Override
    public void type(MobileElement mobileElement, String charSequences) {
        mobileElement.sendKeys(charSequences);
    }

    @Override
    public void type(MobileElement mobileElement, String charSequences, int timeOutOnSeconds) {
        waitUntilElementIsVisible(mobileElement, timeOutOnSeconds).sendKeys(charSequences);
    }

    @Override
    public String getText(MobileElement mobileElement) {
        return mobileElement.getText();
    }

    @Override
    public String getText(MobileElement mobileElement, int timeOutOnSeconds) {
        return waitUntilElementIsVisible(mobileElement, timeOutOnSeconds).getText();
    }

    @Override
    public String getAttribute(MobileElement mobileElement, String attributeName) {
        return mobileElement.getAttribute(attributeName);
    }

    @Override
    public String getAttribute(MobileElement mobileElement, String attributeName, int timeOutOnSeconds) {
        return waitUntilElementIsVisible(mobileElement, timeOutOnSeconds).getAttribute(attributeName);
    }

    @Override
    public void tapElementInAList(List<MobileElement> listElement, String value) {
        for (MobileElement mobileElement : listElement) {
            if (getText(mobileElement).equalsIgnoreCase(value)) {
                tap(mobileElement);
                break;
            }
        }
    }

    @Override
    public void tapElementInAList(List<MobileElement> listElement, String value, int timeOutOnSeconds) {
        for (MobileElement mobileElement : listElement) {
            if (getText(mobileElement, timeOutOnSeconds).equalsIgnoreCase(value)) {
                tap(mobileElement, timeOutOnSeconds);
                break;
            }
        }
    }

    @Override
    public boolean isEnabled(MobileElement mobileElement) {
        return mobileElement.isEnabled();
    }

    @Override
    public boolean isEnabled(MobileElement mobileElement, int timeOutOnSeconds) {
        return waitUntilElementIsVisible(mobileElement, timeOutOnSeconds).isEnabled();
    }

    @Override
    public boolean isDisplayed(MobileElement mobileElement) {
        return mobileElement.isDisplayed();
    }

    @Override
    public boolean isDisplayed(MobileElement mobileElement, int timeOutOnSeconds) {
        return waitUntilElementIsVisible(mobileElement, timeOutOnSeconds).isDisplayed();
    }

    @Override
    public boolean isSelected(MobileElement mobileElement) {
        return mobileElement.isSelected();
    }

    @Override
    public boolean isSelected(MobileElement mobileElement, int timeOutOnSeconds) {
        return waitUntilElementIsVisible(mobileElement, timeOutOnSeconds).isSelected();
    }

    @Override
    public MobileElement waitUntilElementIsVisible(MobileElement mobileElement, int timeOutInSeconds) {
        return (MobileElement) new WebDriverWait(this.driver, timeOutInSeconds)
                .until(ExpectedConditions.visibilityOf(mobileElement));
    }

    @Override
    public MobileElement waitUntilElementIsClickable(MobileElement mobileElement, int timeOutInSeconds) {
        return (MobileElement) new WebDriverWait(this.driver, timeOutInSeconds)
                .until(ExpectedConditions.elementToBeClickable(mobileElement));
    }

    @Override
    public MobileElement waitUntilElement(ExpectedCondition<MobileElement> expectedCondition, int duration) {
        return new WebDriverWait(this.driver, duration).until(expectedCondition);
    }

    @Override
    public List<MobileElement> waitUntilElements(ExpectedCondition<List<MobileElement>> expectedCondition, int duration) {
        return new WebDriverWait(this.driver, duration).until(expectedCondition);
    }

    @Override
    public void swipeToBottom(double topY, double bottonY) {
        Dimension dim = driver.manage().window().getSize();
        int height = dim.getHeight();
        int width = dim.getWidth();
        int x = width / 2;
        int top_y = (int) (height * topY);
        int bottom_y = (int) (height * bottonY);
        var action = new TouchAction(driver);
        action.press(PointOption.point(x, top_y)).moveTo(PointOption.point(x, bottom_y)).release().perform();
    }

    public void ScrollToElement(MobileElement elemento){
        int numberOfTimes = 20;
        Dimension size = driver.manage().window().getSize();
        int width = (size.getWidth()/2);
        int height = (size.getHeight()/2);
        int endPoint = 10;

        for (int i = 0; i < numberOfTimes; i++) {
            try {
                new TouchAction(driver)
                        .longPress(PointOption.point(width, height))
                        .moveTo(PointOption.point(width, endPoint))
                        .release()
                        .perform();
               boolean objeto = elemento.isDisplayed();
               if(objeto){
                   i = numberOfTimes;
               } else{
                   System.out.printf("Element not available. Scrolling (%s) times...%n", i + 1);
                }
            } catch (Exception ex) {
                System.out.printf("Element not available. Scrolling (%s) times...%n", i + 1);
            }
        }
    }
}