package com.meetSky.step_definitions;

import com.meetSky.pages.LoginPage;
import com.meetSky.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinition {
    LoginPage loginPage=new LoginPage();
    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        Driver.getDriver().get("https://qa.meetsky.net/index.php/login");
    }

    @When("user enters username {string} , password {string} and clicks login button")
    public void userEnterUsernamePasswordAndClicksLoginButton(String arg0, String arg1) {
        loginPage.login(arg0,arg1);
    }

    @Then("user is on dashboard")
    public void userIsOnDashboard() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle="Files - Meetsky - QA";
        Assert.assertEquals(actualTitle,expectedTitle);

    }

    @Then("user see Wrong username or password as a warning")
    public void userSeeWrongUsernameOrPasswordAsAWarning() {
        String warningMessage = loginPage.invalidCredentialWarning.getText();
        Assert.assertEquals(warningMessage,"Wrong username or password.");


    }
}
