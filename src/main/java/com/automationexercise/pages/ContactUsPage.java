package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Get In Touch']")
    WebElement getInTouchText;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement nameField;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Email']")
    WebElement emailField;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Subject']")
    WebElement subjectField;

    @CacheLookup
    @FindBy(xpath = "//textarea[@id='message']")
    WebElement messageField;

    @CacheLookup
    @FindBy(xpath = "//input[@name='submit']")
    WebElement submitButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='status alert alert-success']")
    WebElement successMessageText;

    @CacheLookup
    @FindBy(xpath = "//a[@class='btn btn-success']")
    WebElement homeButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='item active']//h1[1]")
    WebElement homePage;





    public String verifyTheGetInTouchText(){
        return getTextFromElement(getInTouchText);
    }

    public void enterGetInTouchDetails(String name, String email, String subject, String message){
        sendTextToElement(nameField,name);
        sendTextToElement(emailField,email);
        sendTextToElement(messageField,message);
        sendTextToElement(subjectField,subject);
    }

    public void clickOnSubmitButton(){
        clickOnElement(submitButton);
    }

    public void confirmationDialog(){
        acceptAlert();
    }

    public String verifyTheSuccessMessageText(){
        return getTextFromElement(successMessageText);
    }

    public void clickOnHomeButton(){
        clickOnElement(homeButton);
    }

    public String verifyTheHomePage(){
        return getTextFromElement(homePage);
    }

}
