package com.brite.step_definition;

import com.brite.pages.LoginPage;
import com.brite.utilities.ConfigurationReader;
import com.brite.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

    LoginPage loginPage=new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Login to app in Before method");
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {

        loginPage.login("posmanager");

//        String userName=null;
//        String password=null;
//
//        if(userType.equalsIgnoreCase("posmanager")){
//            userName = ConfigurationReader.getProperty("posmanager_username");
//            password = ConfigurationReader.getProperty("posmanager_password");
//        }else if(userType.equalsIgnoreCase("crm manager")){
//            userName = ConfigurationReader.getProperty("crm_manager_username");
//            password = ConfigurationReader.getProperty("crm_manager_password");
//        }else if(userType.equalsIgnoreCase("sales manager")){
//            userName = ConfigurationReader.getProperty("sales_manager_username");
//            password = ConfigurationReader.getProperty("sales_manager_password");
//        }else if(userType.equalsIgnoreCase("inventory manager")){
//            userName = ConfigurationReader.getProperty("inventory_manager_username");
//            password = ConfigurationReader.getProperty("inventory_manager_password");
//        }else if(userType.equalsIgnoreCase("expenses manager")){
//            userName = ConfigurationReader.getProperty("expenses_manager_username");
//            password = ConfigurationReader.getProperty("expenses_manager_password");
//        }
        //send username and password and login
//        new LoginPage().login(userName,password);

    }
    @Given("the user logged in with username as {string} and password as {string}")
    public void the_user_logged_in_with_username_as_and_password_as(String userName, String password) {
        LoginPage loginPage=new LoginPage();
        loginPage.login(userName,password);
    }

}
