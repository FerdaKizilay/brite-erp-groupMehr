@B28-209
Feature: Default

  Background:
    Given user is on the login page

  @B28-208
  Scenario Outline: : Verify user can see the result on the list when searching with Quotation Number data.

    When user enters POS manager credentials and login
    When User is on the sales page
    When User enters "<Quotation Number>" on the SearchBox
    Then User should be able to see the result on the list with the "<Quotation Number>"

    Examples:
      | Quotation Number |
      | SO004            |
      | SO805           |
      | SO808            |


  @B28-206
  Scenario: Verify there are 6 columns to see the quotations on the Sales page when the POS managers login.

    When user enters POS manager credentials and login
    When User is on the sales page
    Then User should be able to see 6 columns of the quotations

  @B28-207
  Scenario: Verify there are 6 columns to see the quotations on the Sales page when the sales managers login.

    When user enters  sales manager credentials and login
    When User is on the sales page
    Then User should be able to see 6 columns of the quotations