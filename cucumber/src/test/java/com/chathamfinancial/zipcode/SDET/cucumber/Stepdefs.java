package com.chathamfinancial.zipcode.SDET.cucumber;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Stepdefs {
    private static final String URL = "https://www.behindthename.com/random/";

    private ScenarioContext context;

    public Stepdefs(ScenarioContext context) {

        this.context = context;
    }

    @Given("I am on the name generator")
    public void onTheNameGenerator() {

        this.context.getWebDriver().get(URL);
    }

    @And("^I select a category of (\\w+)$")
    public void selectCategory(String category)  {

        WebDriver driver = this.context.getWebDriver();
        WebElement ele = driver.findElement(By.id("usage-" + category));
        ele.click();
    }

    @When("I generate name")
    public void generateName() {
        WebDriver driver = this.context.getWebDriver();
        WebElement ele = driver.findElement(By.className("largebutton"));
        ele.click();
    }

    @Then("^I get (\\d+) names$")
    public void checkNumberOfNames(int number) {
        WebDriver driver = this.context.getWebDriver();
        WebElement ele = driver.findElement(By.className("heavyhuge"));
        String[] result = ele.getText().split(" ");
        Assert.assertEquals(result.length, number);
    }

    @And("^I input (\\w+) as the surname$")
    public void inputSurname(String surname)  {

        WebDriver driver = this.context.getWebDriver();
        WebElement ele = driver.findElement(By.name("surname"));
        ele.sendKeys(surname);
    }

    @Then("^I get a surname of (\\w+)$")
    public void checkNumberOfNames(String surname) {
        WebDriver driver = this.context.getWebDriver();
        WebElement ele = driver.findElement(By.className("heavyhuge"));
        String[] result = ele.getText().split(" ");
        String actual = result[result.length - 1];
        Assert.assertEquals(surname, actual);
    }

    @And("^I select random surname$")
    public void selectRandomSurname()  {

        WebDriver driver = this.context.getWebDriver();
        WebElement ele = driver.findElement(By.id("randomsurname"));
        ele.click();
    }

    @And("^I select generate life story$")
    public void selectLifeStory()  {

        WebDriver driver = this.context.getWebDriver();
        WebElement ele = driver.findElement(By.id("showextra"));
        ele.click();
    }

}

