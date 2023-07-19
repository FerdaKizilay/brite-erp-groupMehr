package com.brite.step_definition;

import com.brite.pages.LoginPage;
import com.brite.pages.US11_SenemSalesPage;
import com.brite.utilities.BrowserUtils;
import com.brite.utilities.ConfigurationReader;
import com.brite.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US11_SenemStepDefs {
    LoginPage loginPage = new LoginPage();
    US11_SenemSalesPage salesPage = new US11_SenemSalesPage();



    @When("User login using {string} and {string}")
    public void user_login_using_and(String email, String password) {
       loginPage.login(email, password);
    }


    @When("User is on the Sales page")
    public void user_on_the_sales_page() {
        Driver.getDriver().getWindowHandle();
        US11_SenemSalesPage.spanSales.click();
        BrowserUtils.switchWindowAndVerify(Driver.getDriver(),"Quotations - Odoo","Odoo");
        BrowserUtils.sleep(3);
    }
    @When("User clicks on the top checkbox")
    public void user_click_on_the_top_checkbox() {
        US11_SenemSalesPage.input.click();
        }

    @Then("All quotations should be selected")
    public void allQuotationsShouldBeSelected() {
        US11_SenemSalesPage.input.isSelected();
    }

}


