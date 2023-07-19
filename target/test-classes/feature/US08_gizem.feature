@repair
Feature:  Brite ERP login feature

  User Story:
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: Sales Manager, POS manager, CRM Manager, Inventory Manager, Expenses Manger.

  Scenario Outline: As a POS & sales manager, I want to access the Repairs page.

    Given I am on the login page
    When I login using "<email>" and "<password>"
    Then account holder name should be "<name>"
    Then POS & sales, I want to access the Repairs page.
    Then Verify there are six columns to see the repair orders on the Repairs page when the POS & sales managers login.
      | Repair Reference Product to Repair Customer Delivery Address Warranty Expiration Status |



    And Verify POS & sales manager can see the result on the list when searching with Repair Reference data.


    @posmanager
    Examples:
      | email                | password   | name        |
      | posmanager5@info.com | posmanager | POSManager5 |
      | posmanager6@info.com | posmanager | POSManager6 |
      | posmanager7@info.com | posmanager | POSManager7 |
      | posmanager8@info.com | posmanager | POSManager8 |
      | posmanager9@info.com | posmanager | POSManager9 |

    @salesmanager
    Examples:
      | email                   | password     | name           |
      | salesmanager6@info.com  | salesmanager | SalesManager6  |
      | salesmanager7@info.com  | salesmanager | SalesManager7  |
      | salesmanager8@info.com  | salesmanager | SalesManager8  |
      | salesmanager9@info.com  | salesmanager | SalesManager9  |
      | salesmanager10@info.com | salesmanager | SalesManager10 |