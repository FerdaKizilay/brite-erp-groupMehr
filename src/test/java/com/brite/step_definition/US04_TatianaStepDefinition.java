package com.brite.step_definition;

import com.brite.pages.CalendarPage_Tatiana;
import com.brite.pages.LoginPage;
import com.brite.utilities.BrowserUtils;
import com.brite.utilities.ConfigurationReader;
import com.brite.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class US04_TatianaStepDefinition {
    LoginPage loginPage=new LoginPage();
    CalendarPage_Tatiana calendarPage=new CalendarPage_Tatiana();

    @Given("User is logged in")
    public void user_is_logged_in() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login("posmanager75@info.com","posmanager");

    }
    @Then("User should see {string} in the title")
    public void user_should_see_in_the_title(String expectedInTitle) {
        String actualTitle= Driver.getDriver().getTitle();
        Assert.assertEquals(expectedInTitle,actualTitle);

    }
    @When("User clicks on desire time and day cell from the table")
    public void user_clicks_on_desire_time_and_day_cell_from_the_table() {
        Actions actions=new Actions(Driver.getDriver());
       actions.click(calendarPage.event).perform();

    }


    @Then("User should be able to type in desire message")
    public void user_should_be_able_to_type_in_desire_message() {
        calendarPage.eventCreateInputBox.sendKeys("meeting");



    }
    @When("User clicks on create button")
    public void user_clicks_on_create_button() {
        calendarPage.eventCreateButtonclick.click();

    }
    @Then("User should be able to see created event in the calendar")
    public void user_should_be_able_to_see_created_event_in_the_calendar() {
        //BrowserUtils.verifyElementDisplayed(calendarPage.existingEvent);
        //BrowserUtils.verifyElementDisplayed(calendarPage.todayDay);
        Assert.assertEquals(calendarPage.existingEvent,calendarPage.todayDay);

    }


    @Then("User should see the pop-up window")
    public void userShouldSeeThePopUpWindow() {
        BrowserUtils.verifyElementDisplayed(calendarPage.popUpWindow);

    }

    @Then("User should be able to see the event")
    public void user_should_be_able_to_see_the_event() {
        BrowserUtils.verifyElementDisplayed(calendarPage.createdEvent);

    }
    @When("User clicks on the event")
    public void user_clicks_on_the_event() {
        calendarPage.createdEvent.click();
    }
    @Then("User should see new window was created")
    public void user_should_see_new_window_was_created() {
        BrowserUtils.verifyElementDisplayed(calendarPage.eventCreatedWindow);
    }
    @Then("User should see the details about event")
    public void user_should_see_the_details_about_event() {
        String actualEventText=calendarPage.eventDetails.getText();
        String expectedEventText="Starting at";
        Assert.assertTrue(actualEventText.contains(expectedEventText));

    }




}
