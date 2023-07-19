package com.brite.pages;

import com.brite.utilities.ConfigurationReader;
import com.brite.utilities.Driver;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.util.List;

public class LoginPage {

    public LoginPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//input[@type='text']")
    public static WebElement emailInputBox;

    @FindBy(xpath = "//input[@type='password']")
    public static WebElement passWordInputBox;

    @FindBy(xpath = "//button[@type='submit']")
    public static WebElement loginButton;

    public void login(String email, String password) {
        emailInputBox.sendKeys(email);
        passWordInputBox.sendKeys(password);
        loginButton.click();


    }
}
