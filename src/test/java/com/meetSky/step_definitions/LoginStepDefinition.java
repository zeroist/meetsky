package com.meetSky.step_definitions;


import com.meetSky.pages.LoginPage;
import com.meetSky.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginStepDefinition {
    LoginPage loginPage = new LoginPage();
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);

    String userName, password;

    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        Driver.getDriver().get("https://qa.meetsky.net/index.php/login");
    }


    @Then("user is on dashboard")
    public void userIsOnDashboard() {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.meetsky.net/index.php/apps";
        Assert.assertTrue(actualUrl.contains(expectedUrl));

    }

    @When("user enters username {string} , password {string} and clicks login button")
    public void user_enters_username_password_and_clicks_login_button(String user, String pass) {
        userName = user;
        password = pass;
        loginPage.login(user, pass);
    }

    @Then("user see Wrong username or password as a warning")
    public void user_see_wrong_username_or_password_as_a_warning() {
        String warningMessage = loginPage.invalidCredentialWarning.getText();
        Assert.assertEquals(warningMessage, "Wrong username or password.");
    }

    @Then("user see Please fill out this field as a warning")
    public void userSeePleaseFillOutThisFieldAsAWarning() {
        if (userName.equals("")) {
            wait.until(ExpectedConditions.attributeContains(loginPage.usernameBox,"validationMessage","Please fill out this field."));
            String validationMessage = loginPage.usernameBox.getAttribute("validationMessage");
            Assert.assertEquals(validationMessage,"Please fill out this field.");
        }
        if (password.equals("")) {
            wait.until(ExpectedConditions.attributeContains(loginPage.passwordBox,"validationMessage","Please fill out this field."));
            String validationMessage = loginPage.passwordBox.getAttribute("validationMessage");
            Assert.assertEquals(validationMessage,"Please fill out this field.");
        }
    }
}
