package com.brite.step_definition;

import com.brite.pages.US1_Ferda_Page;
import com.brite.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US_1_Ferda_StepDefinition {

    US1_Ferda_Page ferdaPage=new US1_Ferda_Page();


    @Then("user clicks sales button")
    public void user_clicks_sales_button() {
        ferdaPage.salesButton.click();
        BrowserUtils.waitFor(2);
    }
    @Then("user clicks customer button")
    public void user_clicks_customer_button() {
       ferdaPage.customerButton.click();
       BrowserUtils.waitFor(2);
    }
    @Then("user clicks create button")
    public void user_clicks_create_button() {
       ferdaPage.createButton.click();
       BrowserUtils.waitFor(2);
    }

    @Then("user writes his name on name box")
    public void user_writes_his_name_on_name_box() {
       ferdaPage.nameInputBox.sendKeys("Ferda");
       BrowserUtils.waitFor(2);
    }
    @Then("user clicks save button")
    public void user_clicks_save_button() {
        ferdaPage.saveButton.click();
    }
    @Then("user should see his name")
    public void user_should_see_his_name() {
       String actualDisplayeName=ferdaPage.displayName.getText();
       String expectedDisplayName="Ferda";
        Assert.assertTrue(actualDisplayeName.equals(expectedDisplayName));
    }

}
