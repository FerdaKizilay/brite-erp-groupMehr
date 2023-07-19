package com.brite.pages;

import com.brite.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sales_Page {
    public Sales_Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
 @FindBy(xpath ="//input[@class='o_searchview_input']")

    public WebElement SearchBox;

    @FindBy(xpath = "//table//td[7]")
    public WebElement QoutesTable;




}
