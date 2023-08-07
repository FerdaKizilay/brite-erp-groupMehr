package com.brite.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.brite.utilities.Driver;

import java.util.List;


public class CalendarPage_Tatiana {

        public CalendarPage_Tatiana(){
            PageFactory.initElements(Driver.getDriver(),this);
        }


        @FindBy(xpath = "//span[@class='oe_topbar_name']")
        public WebElement accountName;

        @FindBy(xpath = "//button[.='Day']")
        public WebElement dayButton;

        @FindBy(xpath = "(//table//table//th[2])")
        public WebElement dayHeader;

        @FindBy(xpath = "(//table)[6]//tr")
        public WebElement timeColumn;

        @FindBy(xpath="(//table)[6]//td[.='0:00']")
        public WebElement timeStartPoint;

        @FindBy(xpath="(//table)[6]//td[.='23:00']")
        public WebElement timeEndPoint;




        @FindBy(xpath = "//span[normalize-space(text())='Calendar']")
        public WebElement calendarModule;


        @FindBy(xpath = "(//table)[2]//th")
        public List<WebElement> daysOfTheWeek;

        @FindBy(xpath = "//button[.='Week']")
        public WebElement weekModule;


       @FindBy(xpath = "(//table)[1]//td[@class='fc-week-number']/span")
       public List<WebElement> numberOfRowsInCalendarTable;

        @FindBy(xpath = "//button[.='Month']")
        public WebElement monthButton;

        @FindBy(xpath = "(//table)[2]//th")
        public List<WebElement> monthlyDaysOfTheWeek;

        @FindBy(xpath = "//table//tbody//tr[19]//td[2]")
        public WebElement event;

        @FindBy(xpath = "//div[@class='modal-content']")
        public WebElement popUpWindow;


        @FindBy(xpath = "//input[@name='name']")
        public WebElement eventCreateInputBox;

        @FindBy(xpath = "//span[normalize-space()='Create']")
        public WebElement eventCreateButtonclick;

        @FindBy(xpath = "//div[@class='fc-content']")
        public WebElement existingEvent;

        @FindBy(xpath = "(//td[contains(@class,'today')])[2]")
        public WebElement todayDay;


        @FindBy(xpath = "//div[@class='modal-content']")
        public WebElement eventCreatedWindow;


        @FindBy(xpath = "(//table)[7]//td[5]//a")
        public WebElement createdEvent;



        @FindBy(xpath = "(//table//td[1]/label[text()='Starting at'])[2] ")
        public WebElement eventDetails;

    }


