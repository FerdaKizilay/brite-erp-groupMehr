package com.brite.step_definition;


import com.brite.pages.LoginPage;
import com.brite.utilities.ConfigurationReader;
import com.brite.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

    LoginPage loginPage = new LoginPage();



    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user enters the sales manager information")
    public void user_enters_the_sales_manager_information() {
        loginPage.login(ConfigurationReader.getProperty("sales_manager_username"), ConfigurationReader.getProperty("sales_manager_password"));

    }

    @When("user enters the pos manager information")
    public void user_enters_the_pos_manager_information() {
        loginPage.login(ConfigurationReader.getProperty("posmanager_username"),ConfigurationReader.getProperty("posmanager_password"));
    }
}
