@smoke
Feature: user can create a new group under Contacts Module

  Background:  User can Login Dashboard With Valid Credentials
    Given user is on the login page
    When user enters username "Employee91" , password "Employee123" and clicks login button
    Then user clicks file button
    Then user is on dashboard

  Scenario: user is on Contacts Page
    Given user click Contacts icon
    When user see Contacts Page

  Scenario Outline: user can create "<New Group Name>" under Contacts Module
    Given user click Contacts icon
    When user see Contacts Page
    And user click +New group
    And user see popup box
    And user type group name as "<New Group Name>";
    And user click arrow which is at left side of the popup box
    Then user see newly created group in the group list
    Examples:
      | New Group Name |
      | Group10        |
      | Group20        |






