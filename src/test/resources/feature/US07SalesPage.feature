@B28-209
Feature: Default

	
	@B28-208
	Scenario: Verify user can see the result on the list when searching with Quotation Number data.
		Given user is on the login page
		  When user enters POS manager credentials and login
		  When User enters Quotation Number on the SearchBox
		  Then User should be able to see the result on the list with the data	

	
	@B28-206
	Scenario: Verify there are 6 columns to see the quotations on the Sales page when the POS & sales managers login.
		Given user is on the login page
		  When user enters POS manager credentials and login
		  When User is on the sales page
		  Then User should be able to see 6 columns of the quotations