package com.brite.pages;

import com.brite.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Sales_Page {
    public Sales_Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
 @FindBy(xpath ="//input[@class='o_searchview_input']")
 public WebElement SearchBox;

    @FindBy(xpath = "//th")
    public List<WebElement> QoutesTableColumns;

@FindBy(xpath ="//div[@class='o_facet_values']")//td[2][1]")
        //"//td[@class='o_data_cell o_readonly_modifier o_required_modifier'][1]")
    public WebElement searchedOrderNumber;


}
