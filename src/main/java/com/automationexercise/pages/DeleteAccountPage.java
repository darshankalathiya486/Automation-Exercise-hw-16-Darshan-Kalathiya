package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DeleteAccountPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Account Deleted!']")
    WebElement accountDeletedText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement deleteContinueButton;


    public String verifyTheAccountDeletedText(){
        return getTextFromElement(accountDeletedText);
    }

    public void clickOnDeleteContinueButton(){
        clickOnElement(deleteContinueButton);
    }
}
