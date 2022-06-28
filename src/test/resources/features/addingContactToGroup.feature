
Feature: Adding a contact to a group

  @login
  Scenario: Adding a contact to a group
    Given user click Contacts icon
    When user click contact "serdar olgun"
    Then user click the groups in the contact Details
    And user add contact to group "cadılar" and hits Enter
    And user observe increasing number of members in the "cadılar" group



