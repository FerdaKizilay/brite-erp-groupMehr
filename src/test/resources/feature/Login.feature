@login


Feature:  Brite ERP login feature

  User Story:
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: Sales Manager, POS manager, CRM Manager, Inventory Manager, Expenses Manger.

  Background:
    Given user is on the login page

  @sales
  Scenario: Login as sales manager
    When user enters the sales manager information

  @posmanager
  Scenario: Login as pos manager
    When user enters the pos manager information


