package com.herokuapp.internet_the.testsuite;

import com.herokuapp.internet_the.pages.LoginPageTest;
import com.herokuapp.internet_the.testbase.TestBase;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPageTest loginPageTest = new LoginPageTest();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredential(){
        loginPageTest.userName("tomsmith");
        loginPageTest.password("SuperSecretPassword!");
        loginPageTest.clickOnLogin();
        String expectedText = "Secure Area";
        String actualText = loginPageTest.verifyTextSecureArea();
    }
    @Test
    public void verifyUsernameErrorMessage(){
        loginPageTest.userName("tomsimth1");
        loginPageTest.password("SuperSecretPassword!");
        loginPageTest.clickOnLogin();
        String expectedText = "Your username is invalid!";
        String actualText = loginPageTest.verifyInvalidUserName();
    }
    @Test
    public void verifyThePasswordErrorMessage(){
        loginPageTest.userName("tomsimth");
        loginPageTest.password("SuperSecretPassword");
        loginPageTest.clickOnLogin();
        String expectedText = "Your password is invalid!";
        String actualText = loginPageTest.verifyInvalidPassword();

    }
}
