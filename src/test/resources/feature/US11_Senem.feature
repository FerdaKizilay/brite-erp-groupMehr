@senem
Feature: Quotation Management on Sales Page
  As a POS & Sales manager
  I want to manage quotations on the Sales page

  Scenario Outline: User selects all quotations on Sales page
    Given user is on the login page
    When User login using "<email>" and "<password>"
    When User is on the Sales page
    When User clicks on the top checkbox
    Then All quotations should be selected

    @posmanager
    Examples:
      | email                | password   |
      | posmanager5@info.com | posmanager |

    @sales-manager
    Examples:
      | email                  | password     |
      | salesmanager6@info.com | salesmanager |