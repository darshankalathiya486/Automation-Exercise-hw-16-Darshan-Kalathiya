package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Blue Top']")
    WebElement productNameText;

    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Category: Women > Tops']")
    WebElement categoryText;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Rs. 500']")
    WebElement priceText;

    @CacheLookup
    @FindBy(xpath = "//p[text() = ' In Stock']")
    WebElement availabilityText;

    @CacheLookup
    @FindBy(xpath = "//p[text() = ' New']")
    WebElement conditionText;

    @CacheLookup
    @FindBy(xpath = "//p[text() = ' Polo']")
    WebElement brandText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='quantity']")
    WebElement quantityField;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//u[normalize-space()='View Cart']")
    WebElement viewCartLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Write Your Review']")
    WebElement writeYourReviewText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='name']")
    WebElement nameField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='email']")
    WebElement emailField;

    @CacheLookup
    @FindBy(xpath = "//textarea[@id='review']")
    WebElement reviewField;

    @CacheLookup
    @FindBy(xpath = "//button[@id='button-review']")
    WebElement submitButton;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Write Your Review']")
    WebElement scrollsDown;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Thank you for your review.']")
    WebElement submitMessageText;






    public String verifyProductName(){
        return getTextFromElement(productNameText);
    }

    public String verifyCategory(){
        return getTextFromElement(categoryText);
    }

    public String verifyPrice(){
        return getTextFromElement(priceText);
    }

    public String verifyAvailability(){
        return getTextFromElement(availabilityText);
    }

    public String verifyTheCondition(){
        return getTextFromElement(conditionText);
    }

    public String verifyTheBrand(){
        return getTextFromElement(brandText);
    }

    public void enterQuantityInField(String quantity){
        clearTextOnElement(quantityField);
        sendTextToElement(quantityField,quantity);
    }

    public void clickOnAddToCartButton(){
        clickOnElement(addToCartButton);
    }

    public void clickOnViewCardLink(){
        clickOnElement(viewCartLink);
    }

    public String verifyTheWriteYourReviewText(){
        return getTextFromElement(writeYourReviewText);
    }

    public void enterDetails(String name, String email, String review){
        sendTextToElement(nameField,name);
        sendTextToElement(emailField,email);
        sendTextToElement(reviewField,review);
    }

    public void scrollToElement() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", scrollsDown);
    }

    public void clickOnSubmitButton(){
        clickOnElement(submitButton);
    }

    public String verifyTheSubmitMessageText(){
        return getTextFromElement(submitMessageText);
    }
}
