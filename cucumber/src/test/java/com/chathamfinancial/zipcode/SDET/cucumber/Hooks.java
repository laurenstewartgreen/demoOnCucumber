package com.chathamfinancial.zipcode.SDET.cucumber;

import cucumber.api.java.After;

public class Hooks {

    private ScenarioContext context;

    public Hooks(ScenarioContext context) {
        this.context = context;
    }

    @After
    public void afterEachTests() {
        this.context.getWebDriver().close();
    }
}
