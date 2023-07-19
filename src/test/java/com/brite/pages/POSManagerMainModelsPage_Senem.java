package com.brite.pages;

import com.brite.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POSManagerMainModelsPage_Senem {

    @FindBy(xpath = "//a[text()='Documentation']")
    public WebElement documentationLink;

    public POSManagerMainModelsPage_Senem() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}