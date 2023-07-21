@B28-250
Feature: Brite ERP create a new customer module

  User Story: As a Sales Manager, I should be able to create a new customer from "Sales" module
  @B28-248
  Scenario: Create a new customer module
    Given user is on the login page
    When user enters the sales manager information
    Then user clicks sales button
    And user clicks customer button
    And user clicks create button
    And user writes his name on name box
    Then user clicks save button
    Then user should see his name

  @B28-249

  Scenario: Verify any customer can be editable
    Given user is on the login page
    When user enters the sales manager information
    Then user clicks sales button
    And user clicks customer button
    And user clicks any customer module
    And user able to click edit button


