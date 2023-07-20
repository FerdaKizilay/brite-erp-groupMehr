Feature: User valid login




  Background:For all scenarios user is on the login page
  Given I am on the login page

  @posmanager
   Scenario Outline: Verify user information <email>
    When I login using "<email>" and "<password>"
    Then account holder name should be "<name>"

    Examples:
      | email             | password   | name         |
      | posmanager55@info.com | posmanager | posmanager55 |
      | posmanager67@info.com | posmanager | posmanager67 |
      | posmanager89@info.com | posmanager | posmanager89 |

  @eventcrmmanager1

Scenario Outline:  Verify wrong user information <email>

    When I login wrong using "<email>" and "<password>"
    Then error message should be displayed
    Examples:
  |      email               | password       |
  |eventcrmmanager55@info.com|eventcrmmanager |
  |eventcrmmanager67@info.com|eventcrmmanager |
  |eventcrmmanager89@info.com|eventcrmmanager |




  Scenario: Verify that the user gets the "Please fill out this field." message for at least one blank field.
  When I hover on blank field
  Then message should be displayed

