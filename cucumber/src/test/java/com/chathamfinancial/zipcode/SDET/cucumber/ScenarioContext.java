package com.chathamfinancial.zipcode.SDET.cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScenarioContext {
    private WebDriver driver;

    public ScenarioContext() {
        driver = new ChromeDriver();
    }

    public WebDriver getWebDriver() {
        return driver;
    }
}

