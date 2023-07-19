package com.brite.pages;

import com.brite.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US1_Ferda_Page {

    public US1_Ferda_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "(//span[text()[normalize-space()='Sales']])[1]")
    public WebElement salesButton;

    @FindBy(xpath = "//a[@data-menu='447']")
    public WebElement customerButton;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createButton;

    @FindBy (xpath = "//input[@placeholder='Name']")
    public WebElement nameInputBox;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButton;

    @FindBy(xpath = "//span[@name='name']")
    public WebElement displayName;

}
