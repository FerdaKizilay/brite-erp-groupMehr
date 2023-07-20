package com.brite.step_definition;

import com.brite.pages.LoginPage;
import com.brite.utilities.BrowserUtils;
import com.brite.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class US01Alex {
LoginPage loginPage = new LoginPage();

    @When("I login wrong using {string} and {string}")
    public void i_login_wrong_using_and(String email, String password) {
  loginPage.emailInputBox.sendKeys(email);
  loginPage.passWordInputBox.sendKeys(password);
  loginPage.loginButton.click();
    }

    @Then("error message should be displayed")
    public void error_message_should_be_displayed() {
      BrowserUtils.verifyElementDisplayed(loginPage.errorMessage);
    }


    @When("I hover on blank field")
    public void i_hover_on_blank_field() {
  // BrowserUtils.hover(loginPage.emailInputBox);
     loginPage.emailInputBox.click();
    }
    @Then("message should be displayed")
    public void message_should_be_displayed() {
      JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();

      WebElement field = Driver.getDriver().findElement(By.name("login"));
      Boolean is_valid = (Boolean)js.executeScript("return arguments[0].checkValidity();", field);
      String actualMessage = (String)js.executeScript("return arguments[0].validationMessage;", field);
      String expectedMessage = "Please fill in this field.";
      Assert.assertEquals("Failed!! actual message is different than the expected message",expectedMessage,actualMessage);
    }




    }