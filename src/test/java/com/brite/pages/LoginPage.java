package com.brite.pages;

import com.brite.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class LoginPage {

  public LoginPage(){

      PageFactory.initElements(Driver.getDriver(),this);

  }

  @FindBy(xpath = "//input[@type='text']")
    public WebElement userName;

  @FindBy(xpath = "//input[@type='password']")
    public WebElement passWord;

  @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;



  public void login(String username,String password){
    userName.sendKeys(username);
    passWord.sendKeys(password);
    loginButton.click();
  }

  public void login(String userType){

  }
}
