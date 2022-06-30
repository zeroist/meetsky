package com.meetSky.pages;

import com.meetSky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage {
    public HeaderPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "div[class=\"logo logo-icon\"]")
    public WebElement headerLogo;

    @FindBy(xpath = "//ul[@id=\"appmenu\"]//li[@data-id=\"files\"]")
    public WebElement headerFiles;

    @FindBy(xpath = "//ul[@id=\"appmenu\"]//li[@data-id=\"photos\"]")
    public WebElement headerPhotos;

    @FindBy(xpath = "//ul[@id=\"appmenu\"]//li[@data-id=\"activity\"]")
    public WebElement headerActivity;

    @FindBy(xpath = "//ul[@id=\"appmenu\"]//li[@data-id=\"spreed\"]")
    public WebElement headerTalk;

    @FindBy(xpath = "//ul[@id=\"appmenu\"]//li[@data-id=\"contacts\"]")
    public WebElement headerContacts;

    @FindBy(xpath = "//ul[@id=\"appmenu\"]//li[@data-id=\"calendar\"]")
    public WebElement headerCalendar;

    @FindBy(xpath = "//ul[@id=\"appmenu\"]//li[@data-id=\"notes\"]")
    public WebElement headerNotes;

    @FindBy(xpath = "//ul[@id=\"appmenu\"]//li[@data-id=\"tasks\"]")
    public WebElement headerTasks;

    @FindBy(xpath = "//div[@class=\"header-menu unified-search\"]")
    public WebElement headerSearch;

    @FindBy(xpath = "//div[@class=\"notifications\"]")
    public WebElement headerNotifications;

    @FindBy(xpath = "//div[@id=\"contactsmenu\"]")
    public WebElement headerMyContacts;

    @FindBy(xpath = "//div[@id=\"settings\"]")
    public WebElement headerSettings;

    @FindBy(xpath = "//li[@data-id=\"logout\"]")
    public WebElement logout;




}

