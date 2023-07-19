@login

Feature:  Brite ERP login feature

  User Story:
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: Sales Manager, POS manager, CRM Manager, Inventory Manager, Expenses Manger.

  Background: User is already in the log in page
    Given the user is on the login page

  @wip
  Scenario: Verify login with different user types
    Given the user logged in as "<userType>"
    Given the user logged in with username as "posmanager" and password as "UserUser123"