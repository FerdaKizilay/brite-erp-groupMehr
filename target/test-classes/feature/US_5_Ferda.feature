@ferda
Feature: Brite ERP create a new customer module

  User Story: As a Sales Manager, I should be able to create a new customer from "Sales" module

  Scenario: Create a new customer module
    Given user is on the login page
    When user enters the sales manager information
    Then user clicks sales button
    And user clicks customer button
    And user clicks create button
    And user writes his name on name box
    Then user clicks save button
    Then user should see his name


