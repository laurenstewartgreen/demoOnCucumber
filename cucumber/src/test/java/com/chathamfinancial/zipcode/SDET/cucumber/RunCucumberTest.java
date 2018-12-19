package com.chathamfinancial.zipcode.SDET.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"})
public class RunCucumberTest {
    @BeforeClass
    public static void setupWebDriver() {
        /**
         *  This is a third party library to download the selenium driver.
         * https://github.com/bonigarcia/webdrivermanager
         * It basically looks up the latest selenium drivers for their respective servers to the systems `.m2/` folder*
         * Then it binds the binary at runtime to running app.
         *
         *   * the `.m2/` directory is where maven caches dependencies
         **/
        WebDriverManager.chromedriver().setup();
    }
}