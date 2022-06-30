@MTSK-395
Feature:  I should be able to log out

  Background: user already logged in
    When user is on the login page
    Then user enters username "Employee91" , password "Employee123" and clicks login button

  @MTSK-394
  Scenario: User can log out and ends up in login page

    Given user is on dashboard
    When user clicks the setup on the header
    And user clicks the log out links
    Then user see login page

  @MTSK-396
  Scenario: User can not go to home page again by clicking step back button after successfully logged out.
    Given user is on dashboard
    When user clicks the setup on the header
    And user clicks the log out links
    And user clicks step back button
    Then user see login page
