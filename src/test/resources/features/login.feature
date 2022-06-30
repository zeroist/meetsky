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

  @MTSK-389
  Scenario Outline: User can not login with any invalid credentials "Please fill out this field" message should be displayed
  if the password or username is empty
    Given user is on the login page
    When user enters username "<userName>" , password "<password>" and clicks login button
    Then user see Please fill out this field as a warning
    Examples:
      | userName   | password    |
      |            | Employee123 |
      | Employee91 |             |

  @MTSK-390
  Scenario: User can see the password in a form of dots by default

    Given user is on the login page
    When user enters password "Employee123"
    Then user see the password in dots form

  @MTSK-391
  Scenario: User can see the password explicitly if needed
    Given user is on the login page
    When user enters password "Employee123"
    Then user clicks the eye icon next to password input box
    Then User can see the password explicitly

  @MTSK-392
  Scenario: User can see the "Forgot password?" link on the login page and can see the "Reset Password"
  button on the next page after clicking on forget password link

    Given user is on the login page
    When User can see the Forgot password?
    And user clicks the Forgot password? link
    Then use can see Reset Password button

  @MTSK-393
  Scenario: User can see valid placeholders on Username and Password fields
    Given user is on the login page
    When user see valid placeholder for UserName field
    Then user see valid placeholder for Password field

  @MTSK-397
  Scenario Outline: Username should be case sensitive
    Given user is on the login page
    When user enters username "<userName>" , password "<password>" and clicks login button
    Then user should not be able open dashboard
    Examples:
      | userName   | password    |
      | Employee91 | Employee123 |
      | eMployee80 | Employee123 |
      | EmpLOyee81 | Employee123 |
      | EmployEE82 | Employee123 |
      | EMploYEE90 | Employee123 |



