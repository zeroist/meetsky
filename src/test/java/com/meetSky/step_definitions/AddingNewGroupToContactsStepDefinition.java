package com.meetSky.step_definitions;

import com.meetSky.pages.ContactPage;
import com.meetSky.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddingNewGroupToContactsStepDefinition {
    ContactPage contactPage=new ContactPage();
    String newGroupName2;
    List<String> allGroupNamesInAStringOfList;

    @Given("user click Contacts icon")
    public void userClickContactsIcon() {
        contactPage.headerContacts.click();
    }

    @When("user see Contacts Page")
    public void userSeeContactsPage() {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl="qa.meetsky.net/index.php/apps/contacts";
        Assert.assertTrue(actualUrl.contains(expectedUrl));

    }

    @And("user click +New group")
    public void userClickNewGroup() {
        contactPage.leftNewGroupButton.click();
    }

    @And("user see popup box")
    public void userSeePopupBox() {
        Assert.assertTrue(contactPage.addNewGroupInputBox.isDisplayed());
    }

    @And("user type group name as {string};")
    public void userTypeGroupNameAs(String newGroupName) {
        contactPage.addNewGroupInputBox.sendKeys(newGroupName);
        newGroupName2=newGroupName;
    }

    @And("user click arrow which is at left side of the popup box")
    public void userClickArrowWhichIsAtLeftSideOfThePopupBox() {
        contactPage.arrowOfConfirmationForAddingNewGroup.click();
    }

    @Then("user see newly created group in the group list")
    public void userSeeNewlyCreatedGroupInTheGroupList() {
        allGroupNamesInAStringOfList = contactPage.getAllGroupNamesInAStringOfList();
        Assert.assertTrue(allGroupNamesInAStringOfList.contains(newGroupName2));
        System.out.println(allGroupNamesInAStringOfList);
    }


}
