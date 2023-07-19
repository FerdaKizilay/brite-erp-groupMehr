Feature: POS Orders feature


  AC1:Verify the POS managers can view the order list on the Point of Sale page, after checking the Order Reference, all the orders should be checked.
Given user is on the login page
When user enters POS manager credentials and login
When User is on the Point Of Sale page
When User checks the Order Reference checkbox
Then All the orders should be checked


  AC2:Verify the Action drop down has 3 options : Import, Export, Delete (Bug: import is not displayed)


Given user is on the login page
When user enters POS manager credentials and login
When User is on the Point Of Sale page
When User checks the Order Reference checkbox
When User clicks on the Action dropdown
Then User should be able to see 3 options: Import, Export, Delete
