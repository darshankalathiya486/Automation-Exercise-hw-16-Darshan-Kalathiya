package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PaymentDonePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Congratulations! Your order has been confirmed!']")
    WebElement orderPlacedMessage;

    public String verifyTheOrderPlacedMessage(){
        return getTextFromElement(orderPlacedMessage);
    }
}
