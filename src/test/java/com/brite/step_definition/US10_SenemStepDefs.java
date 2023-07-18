package com.brite.step_definition;

import com.brite.pages.LoginPage;
import com.brite.pages.OddoDocs_Page_Senem;
import com.brite.pages.POSManagerMainModelsPage_Senem;
import com.brite.utilities.BrowserUtils;
import com.brite.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US10_SenemStepDefs {

    LoginPage loginPage = new LoginPage();
    POSManagerMainModelsPage_Senem posManagerMainModelsPage;
    OddoDocs_Page_Senem oddoDocs_page_senem = new OddoDocs_Page_Senem();

    @Given("User on the Login Page")
    public void navigateToLoginPage() {
        Driver.getDriver().get("https://qa.briteerp.com/web/login");
    }

 /*   @When("User login using {string} and {string}")
    public void iLoginUsing(String email, String password) {

        LoginPage.emailInputBox.sendKeys(email);
        LoginPage.passWordInputBox.sendKeys(password);
        LoginPage.loginButton.click();

        posManagerMainModelsPage = new POSManagerMainModelsPage_Senem();
        BrowserUtils.waitFor(3);
    }*/

    @Then("User access Documentation {string}")
    public void userAccessesDocumentation(String name) {
        posManagerMainModelsPage.documentationLink.click();
        BrowserUtils.waitFor(3);
    }

    @Then("User click on the Documentation link")
    public void clickOnDocumentationLink() {
        posManagerMainModelsPage.documentationLink.click();
        BrowserUtils.waitFor(3);
    }

    @Then("user goes to dashboard page")
    public void userGoesToDashboardPage() {
        Driver.getDriver().get("https://qa.briteerp.com/web?#action=120&active_id=channel_inbox");
    }

    @Then("user lands on Odoo Documentations Page")
    public void userLandsOnOdooDocumentationsPage() {
        Driver.getDriver().get("https://www.odoo.com/documentation/16.0/");
    }

    @Then("user should see Odoo Documentation")
    public void userShouldSeeOdooDocumentation() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(oddoDocs_page_senem.OdooDocsMessage));
        Assert.assertEquals("Odoo Documentation",oddoDocs_page_senem.OdooDocsMessage.getText());
    }
}
