package com.brite.step_definition;

import com.brite.pages.US1_Ferda_Page;
import com.brite.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

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
       BrowserUtils.waitFor(3);
    }
    @Then("user clicks save button")
    public void user_clicks_save_button() {
        ferdaPage.saveButton.click();
    }
    @Then("user should see his name")
    public void user_should_see_his_name() {
       String actualDisplayName=ferdaPage.displayName.getText();
       String expectedDisplayName="Ferda";
        Assert.assertTrue(actualDisplayName.equals(expectedDisplayName));
    }

    @Then("user clicks any customer module")
    public void user_clicks_any_customer_module() {
        ferdaPage.customerModule.click();
    }
    @Then("user able to click edit button")
    public void user_able_to_click_edit_button() {
        ferdaPage.editButton.click();
    }


}
