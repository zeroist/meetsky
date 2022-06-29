Feature: Login Feature

  @MTSK-378
  Scenario: User Login Dashboard With Valid Credentials
    Given user is on the login page
    When user enters username "Employee91" , password "Employee1234" and clicks login button
    Then user is on dashboard

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