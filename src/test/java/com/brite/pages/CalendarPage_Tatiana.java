package com.brite.pages;

import com.brite.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage_Tatiana {

    public CalendarPage_Tatiana(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement accountName;

    @FindBy(xpath = "//button[.='Day']")
    public WebElement dayButton;

    @FindBy(xpath = "//table//table//th[2]")
    public WebElement dayHeader;

    @FindBy(xpath = "(//td[@class='fc-axis fc-widget-content'])[2]")
    public WebElement timeColumn;


    @FindBy(xpath = "//span[normalize-space(text())='Calendar']")
    public WebElement calendarModule;


    @FindBy(xpath = "//div[@class='fc-row fc-widget-header']")
    public WebElement daysOfTheWeek;

    @FindBy(xpath = "//button[.='Week']")
    public WebElement weekModule;


    @FindBy(xpath="//thead[@class='fc-head']")
    public WebElement daysOfTheMonth;

    @FindBy(xpath = "//tbody[@class='fc-body']")
    public WebElement datesOfTheMonth;









}
