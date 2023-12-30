package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Address Details']")
    WebElement addressDetailsText;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Review Your Order']")
    WebElement reviewYourOrderText;

    @CacheLookup
    @FindBy(xpath = "//textarea[@name='message']")
    WebElement messageTextArea;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Place Order']")
    WebElement placeOrderButton;

    @CacheLookup
    @FindBy(xpath = "//ul[@id='address_delivery']//li[4]")
    WebElement addressText;




    public String verifyTheAddressDetailsText(){
        return getTextFromElement(addressDetailsText);
    }

    public String verifyTheReviewYourOrderText(){
        return getTextFromElement(reviewYourOrderText);
    }

    public void enterMessageInTextArea(String description){
        sendTextToElement(messageTextArea,description);
    }

    public void clickOnPlaceOrderButton(){
        clickOnElement(placeOrderButton);
    }

    public String verifyTheAddressText(){
        return getTextFromElement(addressText);
    }


}
