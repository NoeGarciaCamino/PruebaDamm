package com.everis.ct.mobile.runner;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import io.cucumber.testng.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.logging.Level;
import java.util.logging.Logger;


@CucumberOptions(

//        publish = false,
//        stepNotifications = true,
//      ******   Para lanzar una feature concreta   ******
//        features = {"src/test/resources/features/1.login.feature"},
//      ******   Para lanzar todas las features   ******
        features = {"src/test/resources/features"},
        glue = {"com.everis.ct.mobile.hooks", "com.everis.ct.mobile.glue"},
        //tags = "@DEMO"

        plugin = {"html:target/cucumber-report.html", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
)
public class RunneriPhone12mini {
    private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass
    public static void beforeExecution() {
        Logger.getLogger(RunneriPhone12mini.class.getName()).log(Level.INFO, "BEFORE EXECUTION --->");
    }

    @AfterClass
    public static void afterExecution() {
        Logger.getLogger(RunneriPhone12mini.class.getName()).log(Level.INFO, "AFTER EXECUTION --->");
    }
    @Listeners({ExtentITestListenerClassAdapter.class})
    public class RunCucumberTest extends AbstractTestNGCucumberTests
    {

    }
    @Test(groups = "cucumber", description = "Run Cucumber Features.", dataProvider = "scenarios", invocationCount=1)
    public void scenario(PickleWrapper pickleWrapper, FeatureWrapper featureWrapper) {
        testNGCucumberRunner.runScenario(pickleWrapper.getPickle());
    }
    @DataProvider
    public Object[][] scenarios() {
        if(testNGCucumberRunner == null){
            testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
        }
        return testNGCucumberRunner.provideScenarios();
    }
}
