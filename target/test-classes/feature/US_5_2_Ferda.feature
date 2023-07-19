@ferda2
Feature: Brite ERP create a new customer module

  User Story: As a Sales Manager when clicking any customer and then clicking the edit button
  all the boxes entered information can be editable again.

  Scenario: Verify any customer can be editable
    Given user is on the login page
    When user enters the sales manager information
    Then user clicks sales button
    And user clicks customer button
    And user clicks any customer module
    And user able to click edit button
