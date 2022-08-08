@smoke
Feature: user can create a new group under Contacts Module



  @contacts @login
  Scenario: user is on Contacts Page
    Given user click Contacts icon
    When user see Contacts Page

  Scenario Outline: user can create a new group under Contacts Module
    And user click +New group
    And user see popup box
    And user type group name as "<New Group Name>";
    And user click arrow which is at left side of the popup box
    Then user see newly created group in the group list
    Examples:
      | New Group Name |
      | Group10        |
      | Group20        |
      | Group30        |
      | Group40        |





