@B28-239
Feature:Brite erp application functionality
  Agile Story:
  As a user, I want to see the calendar page as daily, weekly (as a default) and monthly.

  Background:For all scenarios user is on the login page of Brite ERP application
    Given user is on the login page of the Brite ERP application

  @B28-235
  Scenario Outline:Verify users see the calendar as a daily
    When User enters "<email>" and "<password>"
    And User clicks on login button
    Then User should see "<account_Name>" on the page
    When User clicks on calendar module
    Then User should be able to see Day module
    When User clicks on Day module
    Then User should be able to see Day header
    And User should be able to see time column

    Examples:
      |email                         |password          |account_Name        |
      |posmanager75@info.com         |posmanager        |POSManager75        |
      |eventscrmmanager102@info.com  |eventscrmmanager  |EventsCRMManager102 |
      |salesmanager69@info.com       |salesmanager      |SalesManager69      |
      |imm113@info.com               |inventorymanager  |InventoryManager113 |
      |expensesmanager107@info.com   |expensesmanager   |ExpensesManager107   |

  @B28-237
  Scenario Outline:Verify users see the calendar as a weekly
    When User enters "<email>" and "<password>"
    And User clicks on login button
    Then User should see "<account_Name>" on the page
    When User clicks on calendar module
    Then User should be able to see Week module
    And User should be able to see Days of the Week
    And User should be able to see time column

    Examples:
      |email                         |password          |account_Name        |
      |posmanager75@info.com         |posmanager        |POSManager75        |
      |eventscrmmanager102@info.com  |eventscrmmanager  |EventsCRMManager102 |
      |salesmanager69@info.com       |salesmanager      |SalesManager69      |
      |imm113@info.com               |inventorymanager  |InventoryManager113 |
      |expensesmanager107@info.com   |expensesmanager   |ExpensesManager107   |


    @B28-238
  Scenario Outline:Verify users see the calendar as a monthly
    When User enters "<email>" and "<password>"
    And User clicks on login button
    Then User should see "<account_Name>" on the page
    When User clicks on calendar module
    Then User should be able to see Month module
    When  User clicks on Month module
    Then User should be able to see Days of the month
      And User should be able to see Dates of the month in a table

    Examples:
      |email                         |password          |account_Name        |
      |posmanager75@info.com         |posmanager        |POSManager75        |
      |eventscrmmanager102@info.com  |eventscrmmanager  |EventsCRMManager102 |
      |salesmanager69@info.com       |salesmanager      |SalesManager69      |
      |imm113@info.com               |inventorymanager  |InventoryManager113 |
      |expensesmanager107@info.com   |expensesmanager   |ExpensesManager107   |