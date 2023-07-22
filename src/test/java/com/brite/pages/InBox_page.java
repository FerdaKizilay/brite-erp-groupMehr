package com.brite.pages;

import com.brite.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InBox_page {
    public InBox_page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[6]/a")
    public WebElement SalesLinkBtn;
@FindBy(xpath = "//span[@class='fa fa-close']")
public WebElement popUp;

    @FindBy(xpath = "//a[@href='/web#menu_id=484&action=']")
            //" //span[normalize-space(text())='Point of Sale']")//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[8]/a")

    public WebElement POSlinkBtn;

}
