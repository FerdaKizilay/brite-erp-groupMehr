Feature: Brite ERP feature
  Background: For all scenarios user is on the login page of Brite ERP application
    Given user is on the login page of the Brite ERP application

  @US03_Tatiana
  Scenario Outline: Login with valid credential
    Given user is on the login page of the Brite ERP application
    When the user login in with "<username>","<password>"
    Then the user should see account name "<name>"
    When the user clicks on calendar module
    Then the user should sees "Meetings - Odoo" is in the title


    Examples:
      |username                    |password           |name                 |
      |posmanager75@info.com       | posmanager        | POSManager75        |
      |eventscrmmanager17@info.com |eventscrmmanager   | EventsCRMManager17  |
      |salesmanager93@info.com     |salesmanager       | SalesManager93      |
      |imm148@info.com             |inventorymanager   | InventoryManager148 |
      |expensesmanager101@info.com |expensesmanager    | ExpensesManager101  |