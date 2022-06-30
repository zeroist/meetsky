package com.meetSky.step_definitions;

import com.meetSky.pages.HeaderPage;
import com.meetSky.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class logoutStepDefiniton {
    HeaderPage headerPage=new HeaderPage();
    @When("user clicks the setup on the header")
    public void userClicksTheSetupOnTheHeaer() {
        headerPage.headerSettings.click();
    }

    @Then("user clicks the log out links")
    public void userClicksTheLogOutLinks() {
        headerPage.logout.click();
    }

    @Then("user see login page")
    public void userSeeLoginPage() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("https://qa.meetsky.net/index.php/login"));
    }

    @And("user clicks step back button")
    public void userClicksStepBackButton() {
        Driver.getDriver().navigate().back();
    }
}
