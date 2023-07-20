@B28-228
  Feature: Default
  #POS Orders feature
Background:
  Given user is on the login page
  When user enters POS manager credentials and login
  When User clicks POS module
  When User clicks Orders menu in the POS page
  When User checks the Order Reference checkbox
  @B28-226
  #AC1:Verify the POS managers can view the order list on the Point of Sale page, after checking the Order Reference, all the orders should be checked.

    Scenario: AC1: Verify the POS managers can view the order list on the Point of Sale page, after checking the Order Reference, all the orders should be checked.


    Then All the orders should be checked

    @B28-227
 # AC2:Verify the Action drop down has 3 options : Import, Export, Delete (Bug: import is not displayed)
  Scenario: AC2: Verify the Action drop down has 3 options : Import, Export, Delete


    When User clicks on the Action dropdown
    Then User should be able to see 3 options: "<Import>", "<Export>", "<Delete>"


