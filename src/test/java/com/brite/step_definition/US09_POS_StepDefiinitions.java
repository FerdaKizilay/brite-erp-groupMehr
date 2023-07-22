package com.brite.step_definition;

import com.brite.pages.InBox_page;
import com.brite.pages.LoginPage;
import com.brite.pages.PointOfSale_Page;
import com.brite.pages.Sales_Page;
import com.brite.utilities.BrowserUtils;
import com.brite.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class US09_POS_StepDefiinitions {
    LoginPage loginPage=new LoginPage();
    PointOfSale_Page pointOfSalePage=new PointOfSale_Page();
    InBox_page inBoxPage=new InBox_page();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));


    @When("User clicks POS module")
    public void userClicksPOSModule() {
        inBoxPage.popUp.click();
        inBoxPage.POSlinkBtn.click();
        wait.until(ExpectedConditions.titleIs("Point of Sale - Odoo"));
    }

    @When("User clicks Orders menu in the POS page")
    public void userClicksOrdersMenuInThePOSPage() {
        pointOfSalePage.OrdersLinkBtn.click();
    }
    @When("User checks the Order Reference checkbox")
    public void userChecksTheOrderReferenceCheckbox() {
        pointOfSalePage.recordSelectCheckbox.isSelected();

    }

    @Then("All the orders should be checked")
    public void allTheOrdersShouldBeChecked() {
        Assert.assertTrue(pointOfSalePage.Checkboxes.isSelected());
    }

    @When("User clicks on the Action dropdown")
    public void userClicksOnTheActionDropdown() {
        pointOfSalePage.select.selectByValue("");
        pointOfSalePage.select.selectByValue("");
    }




    @Then("User should be able to see {int} options: {string}, {string}, {string}")
    public void userShouldBeAbleToSeeOptions(int arg0, String arg1, String arg2, String arg3) {
       // List<WebElement> ActualSelect1=pointOfSalePage.select.getOptions();
        pointOfSalePage.select.selectByVisibleText("Import");
        String ActualSelectOption1=pointOfSalePage.select.toString();
        Assert.assertEquals(arg1,ActualSelectOption1);

        // pointOfSalePage.select.selectByVisibleText("Export");
         //pointOfSalePage.select.selectByVisibleText("Delete");
       // Assert.assertEquals(arg0, ActualSelect1.size());

    }


}
