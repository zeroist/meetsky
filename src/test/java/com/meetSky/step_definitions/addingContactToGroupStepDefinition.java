package com.meetSky.step_definitions;

import com.meetSky.pages.ContactPage;
import com.meetSky.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class addingContactToGroupStepDefinition {
    ContactPage contactPage=new ContactPage();
    String countOfMembersBefore;


    @Then("user click the groups in the contact Details")
    public void userClickTheGroupsInTheContactDetails() {
        contactPage.groupsInputBoxInContactDetails.click();
    }



    @And("user add contact to group {string} and hits Enter")
    public void userAddContactToGroupAndHitsEnter(String arg0) {
        countOfMembersBefore = contactPage.countOfMembers(arg0);
        System.out.println("countOfMembersBefore = " + countOfMembersBefore);
        contactPage.groupsInputBoxInContactDetails.sendKeys(arg0+ Keys.ENTER);
    }

    @And("user observe increasing number of members in the {string} group")
    public void userObserveIncreasingNumberOfMembersInTheGroup(String arg0) {
        String countOfMembersAfter = contactPage.countOfMembers(arg0);
        System.out.println("countOfMembersAfter = " + countOfMembersAfter);
        Assert.assertEquals(Integer.parseInt(countOfMembersBefore)+1,Integer.parseInt(countOfMembersAfter));


    }

    @When("user click contact {string}")
    public void userClickContact(String arg0) {
        try {
            contactPage.clickContact(arg0);
        } catch (Exception e) {
            System.out.println("user is not registered");
            Driver.getDriver().quit();
        }
    }
}
