
  Feature: Brite ERP access the main modules

    User story: As an Inventory manager, I should be able to access the main modules.


    Background: user is already on the login page
      Given user is on the login page

    Scenario:
      When Inventory manager enters valid "<username>" and "<password>"
      Then user should see following options
      |Discus|
      |Calendar|
      |Notes|
      |Contacts|
      |Website|
      |Inventory|
      |Manufacturing|
      |Repairs|
      |Invoicing|
      |Employees|
      |Leaves|
      |Expenses|
      |Lunch|
      |Maintenance|
      |Dashboards|






