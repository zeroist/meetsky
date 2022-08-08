package com.meetSky.pages;

import com.meetSky.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class ContactPage {
    public ContactPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@id=\"new-contact-button\"]")
    public WebElement leftNewConductButton;


    @FindBy(xpath = "//span[@title=\"All contacts\"]")
    public WebElement leftAllContactsButton;

    @FindBy(xpath = "//span[@title=\"Not grouped\"]")
    public WebElement leftNotGroupedButton;

    @FindBy(xpath = "//button[@class=\"icon vue-button action-item__menutoggle icon-add\"]")
    public WebElement leftNewGroupButton;

    @FindBy(xpath = "//input[@class=\"action-input__input focusable\"]")
    public WebElement addNewGroupInputBox;

    @FindBy(xpath = "//label[@class=\"action-input__label\"]")
    public WebElement arrowOfConfirmationForAddingNewGroup;

    @FindBy(xpath = "//ul[@id=\"appmenu\"]//li[@data-id=\"contacts\"]")
    public WebElement headerContacts;
    @FindBy(xpath = "//input[@placeholder=\"Add contact in group\"]")
    public WebElement groupsInputBoxInContactDetails;

    @FindBy(xpath = "//span[@class=\"app-navigation-entry__title\"]")
    public List<WebElement> allWebElementsOfGroupsAsList;

    @FindBy(xpath = "//span[@class=\"multiselect__option multiselect__option--selected\"]")
    public List<WebElement> allWebElementsOfSELECTEDGroupsAsList;

    @FindBy(xpath = "//div[@class=\"vue-recycle-scroller__item-wrapper\"]//div[@class=\"app-content-list-item-line-one\"]")
    public List<WebElement> allWebElementsOfContactsAsList;



    public List<String> getAllGroupNamesInAStringOfList(){
        List<String>groupNamesList=new ArrayList<>();
        for (WebElement each : this.allWebElementsOfGroupsAsList) {
            groupNamesList.add(each.getText());
        }
        return groupNamesList;
    }

    ////li[@class="app-navigation-entry"]//span[@title="classmates"]/../following-sibling::div/div[@class="app-navigation-entry__counter"]

    public String countOfMembers(String groupName){
        String webElementText="//li[@class=\"app-navigation-entry\"]//span[@title=\""+groupName+"\"]/../following-sibling::div/div[@class=\"app-navigation-entry__counter\"]";
        WebElement numberofMembersInGroup=Driver.getDriver().findElement(By.xpath(webElementText));
        return numberofMembersInGroup.getText();
    }

    public void clickContact(String contactName){
        String webElementOfContacts="//div[@class=\"app-content-list-item-line-one\" and contains(.,'"+contactName+"')]";
        Driver.getDriver().findElement(By.xpath(webElementOfContacts)).click();
    }











}
