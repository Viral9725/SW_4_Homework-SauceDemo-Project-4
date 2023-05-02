package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By userNameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButton = By.xpath("//input[@id='login-button']");



    public void enterUserNameField(String userName){
        sendTextToElement(userNameField,userName);
    }
    public void enterPasswordField(String password){
        sendTextToElement(passwordField,password);

    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

}
