@MTSK-379
Feature: Login Feature

  @MTSK-378
  Scenario: User can Login Dashboard With Valid Credentials
    Given user is on the login page
    When user enters username "Employee91" , password "Employee123" and clicks login button
    Then user is on dashboard

  @MTSK-380
  Scenario Outline: User can not login with any invalid credentials-
  "Wrong username or password." should be displayed for invalid credentials
    Given user is on the login page
    When user enters username "<userName>" , password "<password>" and clicks login button
    Then user see Wrong username or password as a warning
    Examples:
      | userName | password |
      | invalid  | fasdg    |
      | 123      | safdfqew |
      | sfsty    | gdhf     |

    Scenario: User can not login with any invalid credentials "Please fill out this field" message should be displayed
    if the password or username is empty
      Given user is on the login page
      When user enters username "<userName>" , password "<password>" and clicks login button
      Then user see Please fill out this field as a warning
