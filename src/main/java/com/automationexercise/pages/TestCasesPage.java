package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class TestCasesPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//div[@class='item active']//button[@type='button'][normalize-space()='Test Cases']")
    WebElement testCasesButton;

    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Test Cases']")
    WebElement testCasesText;


    public void clickOnTestCasesButton(){
        clickOnElement(testCasesButton);
    }

    public String verifyTheTestCasesPage(){
        return getTextFromElement(testCasesText);
    }
}
