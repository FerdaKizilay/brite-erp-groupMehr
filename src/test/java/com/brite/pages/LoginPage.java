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
    public WebElement emailInputBox;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passWordInputBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    public void login(String username,String password){
        emailInputBox.sendKeys(username);
        passWordInputBox.sendKeys(password);
        loginButton.click();

    }



}
