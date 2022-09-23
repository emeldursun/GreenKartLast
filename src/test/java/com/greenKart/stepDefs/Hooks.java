package com.greenKart.stepDefs;

import com.greenKart.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    /*
    There is no connection between feature files and hooks.
Hooks will run always so we need to be careful about
what we use inside.
But we have also custom hooks that is running if we have
same tag on top of scenarios.
     */


    @Before
    public void setUp() {
        System.out.println("\tthis is coming from BEFORE");
        Driver.get().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }

        Driver.closeDriver();

    }
}

