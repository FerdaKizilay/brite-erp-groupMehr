package com.brite.pages;

import com.brite.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PointOfSale_Page {
    public PointOfSale_Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy(xpath ="//a[@data-menu='489']")
    public WebElement OrdersLinkBtn;

@FindBy(xpath = "th[@class='o_list_record_selector']")
    public WebElement recordSelectCheckbox;

@FindBy(xpath = "//div[@czlass='o_checkbox']")
    public WebElement Checkboxes;

@FindBy(xpath = "//div[@class='btn-group o_dropdown']")
    public WebElement dropdownBtnImportExportDelete;


}
