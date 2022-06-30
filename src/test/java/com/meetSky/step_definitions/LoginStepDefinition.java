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


    @Then("user is on dashboard")
    public void userIsOnDashboard() {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl="https://qa.meetsky.net/index.php/apps";
        Assert.assertTrue(actualUrl.contains(expectedUrl));

    }

    @When("user enters username {string} , password {string} and clicks login button")
    public void user_enters_username_password_and_clicks_login_button(String arg0, String arg1) {
            loginPage.login(arg0,arg1);
    }
    @Then("user see Wrong username or password as a warning")
    public void user_see_wrong_username_or_password_as_a_warning() {
        String warningMessage = loginPage.invalidCredentialWarning.getText();
        Assert.assertEquals(warningMessage,"Wrong username or password.");
    }

    @Then("user see Please fill out this field as a warning")
    public void userSeePleaseFillOutThisFieldAsAWarning() {
        Assert.assertTrue(Driver.getDriver().switchTo().alert().getText().contains("Please Fill out this field.".toLowerCase()));
    }
}
