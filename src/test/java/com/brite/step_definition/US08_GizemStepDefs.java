package com.brite.step_definition;

import com.brite.pages.LoginPage;
import com.brite.pages.RepairsPage;
import com.brite.utilities.BrowserUtils;
import com.brite.utilities.ConfigurationReader;
import com.brite.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class US08_GizemStepDefs {

    LoginPage loginPage = new LoginPage();
    RepairsPage repairsPage = new RepairsPage();

/*
    @Given("I am on the login page")
    public void i_am_on_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("I login using {string} and {string}")
    public void i_login_using_and(String email, String password) {

        loginPage.emailInputBox.sendKeys(email);
        loginPage.passWordInputBox.sendKeys(password);
        loginPage.loginButton.click();
    }

 */
    @Then("account holder name should be {string}")
    public void account_holder_name_should_be(String expectedName) {

        repairsPage.nameText.getText();


    }
    @Then("POS & sales, I want to access the Repairs page.")
    public void pos_sales_i_want_to_access_the_repairs_page() {

        ((JavascriptExecutor) Driver.getDriver()).executeScript("window.open('/web#menu_id=535&action=723');");


        BrowserUtils.switchWindowAndVerify("Repair Orders - Odoo", "Odoo");


        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleIs("Repair Orders - Odoo"));

    }
    @Then("Verify there are six columns to see the repair orders on the Repairs page when the POS & sales managers login.")
    public void verify_there_are_six_columns_to_see_the_repair_orders_on_the_repairs_page_when_the_pos_sales_managers_login(List<String> expectedColumns) {

        BrowserUtils.sleep(4);


        List<String> actualColumns = new ArrayList<>();


        for (WebElement each : repairsPage.columns) {
            actualColumns.add(each.getText());

        }

        Assert.assertEquals(expectedColumns,actualColumns);


    }
    @Then("Verify POS & sales manager can see the result on the list when searching with Repair Reference data.")
    public void verify_pos_sales_manager_can_see_the_result_on_the_list_when_searching_with_repair_reference_data() {

        repairsPage.searchBox.sendKeys("RMA/00238"+ Keys.ENTER);
        String expectedResultText = "RMA/00238";
        String actualResultText = repairsPage.searchBoxResult.getText();

        Assert.assertEquals(expectedResultText,actualResultText);



    }


}
