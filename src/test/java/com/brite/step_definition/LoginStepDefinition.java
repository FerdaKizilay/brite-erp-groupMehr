package com.brite.step_definition;

import com.brite.pages.DashboardPage;
import com.brite.pages.LoginPage;
import com.brite.utilities.BrowserUtils;
import com.brite.utilities.ConfigurationReader;
import com.brite.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginStepDefinition {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();


    @Then("the user enters valid manager's {string} and {string}")
    public void theUserEntersValidManagerSAnd(String username, String password) {
        loginPage.login2(username, password);
    }


    @Given("the user enters valid {string}")
    public void theUserEntersValid(String accountType) {
        loginPage.displayAccountType();
    }
}
