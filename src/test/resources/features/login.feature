Feature: Login Feature
  Scenario: User Login Dashboard With Valid Credentials
    Given user is on the login page
    When user enter username "Employee91" , password "Employee1234" and clicks login button
    Then user is on dashboard