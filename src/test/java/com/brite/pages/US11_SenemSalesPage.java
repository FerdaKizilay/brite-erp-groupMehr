package com.brite.pages;

import com.brite.utilities.Driver;
import org.apache.commons.logging.Log;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US11_SenemSalesPage {

    public US11_SenemSalesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "/html/body/nav/div[2]/ul[1]/li[6]/a/span")
    public static WebElement spanSales;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/table/thead/tr/th[1]/div/input")
    public static WebElement input;



}

