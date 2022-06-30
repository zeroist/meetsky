package com.meetSky.pages;


import com.meetSky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(id = "user")
    public WebElement usernameBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(id = "submit-form")
    public WebElement loginButton;

    @FindBy(xpath = "//img[@src=\"/core/img/actions/toggle.svg\"]")
    public WebElement eyeIcon;

    @FindBy(xpath = "//p[@class=\"warning wrongPasswordMsg\"]")
    public WebElement invalidCredentialWarning;

    @FindBy(id = "lost-password")
    public WebElement forgotPasswordLink;

    @FindBy(id="reset-password-submit")
    public WebElement resetPasswordButton;

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void login(String username, String password) {
        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginButton.click();
    }
    public void login() {
        usernameBox.sendKeys("Employee91");
        passwordBox.sendKeys("Employee123");
        loginButton.click();
    }



}
