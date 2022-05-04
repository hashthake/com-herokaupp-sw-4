package com.herokuapp.internet_the.pages;

import com.herokuapp.internet_the.utility.Utility;
import org.openqa.selenium.By;

public class LoginPageTest extends Utility {

    By userNameField = By.id("username");
    By passwordField = By.id("password");
    By loginBtn = By.xpath("//i[contains(text(),'Login')]");
    By verifySecureArea = By.xpath("//body[1]/div[2]/div[1]/div[1]/h2[1]");
    By verifyInvalidUserName = By.xpath("//div[@id='flash']");
    By verifyInvalidPassword = By.xpath("//div[@id='flash']");

    public void userName(String value){
        sendTextToElement(userNameField,value);
    }
    public void password(String value){
        sendTextToElement(passwordField,value);
    }
    public void clickOnLogin(){
        clickOnElement(loginBtn);
    }
    public String verifyTextSecureArea(){
        return getTextFromElement(verifySecureArea);
    }
    public String verifyInvalidUserName(){
        return getTextFromElement(verifyInvalidUserName);
    }
    public String verifyInvalidPassword(){
        return getTextFromElement(verifyInvalidPassword);
    }

}
