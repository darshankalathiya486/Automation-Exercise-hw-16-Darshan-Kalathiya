package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='New User Signup!']")
    WebElement newUserSignupText;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement nameField;

    @CacheLookup
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    WebElement emailField;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Signup']")
    WebElement signupButton;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Login to your account']")
    WebElement loginToYourAccountText;

    @CacheLookup
    @FindBy(xpath = "//input[@data-qa='login-email']")
    WebElement emailAddressField;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Your email or password is incorrect!']")
    WebElement yourEmailAndPasswordIsIncorrect;



    public String verifyNewUserSignupText(){
        return getTextFromElement(newUserSignupText);
    }

    public void enterNameINField(String name){
        sendTextToElement(nameField,name);
    }

    public void enterEmailInField(String email){
        sendTextToElement(emailField,email);
    }

    public void clickOnSignupButton(){
        clickOnElement(signupButton);
    }

    public String verifyLoginToYourAccountText(){
        return getTextFromElement(loginToYourAccountText);
    }

    public void validEmailAndPassword(String emailAddress, String password){
        sendTextToElement(emailAddressField,emailAddress);
        sendTextToElement(passwordField,password);
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

    public String verifyTheYourEmailAndPasswordIsIncorrect(){
        return getTextFromElement(yourEmailAndPasswordIsIncorrect);
    }
}
