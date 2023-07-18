@wip
Feature: Documentation Access
  As a user
  I want to access the documentation page
  In order to find relevant information
Background:
  Given User on the Login Page
  Scenario:Verify the “Odoo Documentation” message is displayed in a new window.
    Then user goes to dashboard page
    Then user lands on Odoo Documentations Page
    Then user should see Odoo Documentation










