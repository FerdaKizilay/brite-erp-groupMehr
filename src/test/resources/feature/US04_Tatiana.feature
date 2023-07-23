@B28-247
Feature: create events on my calendar from "Calendar" module
         Agile story: US04 As a Posmanager, I should be able to create events
          on my calendar from "Calendar" module
  Background: For all the scenarios user should be logged in on Brite ERP application
    Given User is logged in

  @B28-245
  Scenario: User can create event by clicking on time box
      When User clicks on calendar module
      Then User should see "Meetings - Odoo" in the title
      When User clicks on desire time and day cell from the table
      Then User should see the pop-up window
      And User should be able to type in desire message
      When User clicks on create button
      Then User should be able to see created event in the calendar

    @B28-246
      Scenario: User can see event details when clicking the event on the calendar.
        When User clicks on calendar module
        Then User should be able to see the event
        When User clicks on the event
        Then User should see new window was created
        And User should see the details about event



