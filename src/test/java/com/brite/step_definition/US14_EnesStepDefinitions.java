package com.brite.step_definition;

import com.brite.pages.LoginPage;
import com.brite.pages.MainModulesPage;
import com.brite.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US14_EnesStepDefinitions {


    LoginPage loginPage = new LoginPage();
    MainModulesPage mainModulesPage = new MainModulesPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

        Driver.getDriver().get("http://qa.briteerp.com/web/login");
    }

    @When("Inventory manager enters valid {string} and {string}")
    public void inventory_manager_enters_valid_and(String email, String password) {
        loginPage.emailInputBox.sendKeys(email);
        loginPage.passWordInputBox.sendKeys(password);
        loginPage.loginButton.click();
    }

    @Then("user should see following options")
    public void user_should_see_following_options(io.cucumber.datatable.DataTable dataTable) {


    }







}
