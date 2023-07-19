package com.brite.step_definition;

import com.brite.pages.LoginPage;
import com.brite.pages.Sales_Page;
import com.brite.utilities.ConfigurationReader;
import com.brite.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US07_SalesStepDefinitions {

    LoginPage loginPage=new LoginPage();
    Sales_Page salesPage=new Sales_Page();


    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


    @When("user enters POS manager credentials and login")
    public void userEntersPOSManagerCredentialsAndLogin() {

    }

    @When("User enters Quotation Number on the SearchBox")
    public void userEntersQuotationNumberOnTheSearchBox() {
    }

    @Then("User should be able to see the result on the list with the data")
    public void userShouldBeAbleToSeeTheResultOnTheListWithTheData() {
    }

    @When("User is on the sales page")
    public void userIsOnTheSalesPage() {
    }

    @Then("User should be able to see {int} columns of the quotations")
    public void userShouldBeAbleToSeeColumnsOfTheQuotations(int arg0) {
    }





}
