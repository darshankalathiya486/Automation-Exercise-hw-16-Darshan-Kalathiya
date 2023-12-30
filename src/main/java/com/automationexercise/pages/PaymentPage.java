package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@name='name_on_card']")
    WebElement nameOnCardField;

    @CacheLookup
    @FindBy(xpath = "//input[@name='card_number']")
    WebElement cardNumberField;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='ex. 311']")
    WebElement cvcField;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='MM']")
    WebElement expirationMonthField;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='YYYY']")
    WebElement expirationYearField;

    @CacheLookup
    @FindBy(xpath = "//button[@id='submit']")
    WebElement payAndConfirmOrderButton;

    @CacheLookup
    @FindBy (xpath = "//a[normalize-space()='Download Invoice']")
    WebElement downloadInvoiceButtonAfterOrderSuccessMessage;

    @CacheLookup
    @FindBy (xpath = "//a[normalize-space()='Continue']")
    WebElement continueButtonAfterOrderSuccessMessage;




    public void enterPaymentDetailsOnField(String nameOnCard, String cardNumber, String cvc, String expireMonth, String expireYear){
        sendTextToElement(nameOnCardField,nameOnCard);
        sendTextToElement(cardNumberField,cardNumber);
        sendTextToElement(cvcField,cvc);
        sendTextToElement(expirationMonthField,expireMonth);
        sendTextToElement(expirationYearField,expireYear);
    }

    public void clickOnPayAndConfirmOrderButton(){
        clickOnElement(payAndConfirmOrderButton);
    }

    public void clickOnDownloadInvoiceButtonAfterOrderSuccessMessage() {
        clickOnElement(downloadInvoiceButtonAfterOrderSuccessMessage);
    }

    public void clickOnContinueButtonAfterOrderSuccessMessage() {
        clickOnElement(continueButtonAfterOrderSuccessMessage);
    }
}
