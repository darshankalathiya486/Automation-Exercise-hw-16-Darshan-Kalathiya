package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    WebElement signupAndLogin;

    @CacheLookup
    @FindBy(xpath = "//li[10]//a[1]")
    WebElement loggedInAsUserNameText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Delete Account']")
    WebElement deleteAccountLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement logoutLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Contact us']")
    WebElement contactUSLink;

    @CacheLookup
    @FindBy(xpath = "//a[@href='/products']")
    WebElement productLink;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Subscription']")
    WebElement subscriptionText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='susbscribe_email']")
    WebElement subscriptionEmailField;

    @CacheLookup
    @FindBy(xpath = "//button[@id='subscribe']")
    WebElement subscriptionButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert-success alert']")
    WebElement successAlertText;

    @CacheLookup
    @FindBy(xpath = "//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
    WebElement cartLink;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Category']")
    WebElement categoryText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Women']")
    WebElement womenCategoryLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Tops']")
    WebElement womenTopsCategoryLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Men']")
    WebElement menCategoryLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Jeans']")
    WebElement menJeansCategoryLink;

    @CacheLookup
    @FindBy(xpath = "//div[@id='recommended-item-carousel']//a[@class='btn btn-default add-to-cart']")
    List<WebElement> recommendedItemsList;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='recommended items']")
    WebElement recommendedItemsText;

    @CacheLookup
    @FindBy(xpath = "//u[normalize-space()='View Cart']")
    WebElement viewCartButtonInRecommendedItems;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr")
    List<WebElement> addedCardProducts;

    @CacheLookup
    @FindBy (xpath = "//i[@class='fa fa-angle-up']")
    WebElement bottomRightArrowButton;

    @CacheLookup
    @FindBy (xpath = "//div[@class='item active']//h2[contains(text(),'Full-Fledged practice website for Automation Engin')]")
    WebElement fullFledgedText;












    public void clickOnSignupAndLoginButton(){
        clickOnElement(signupAndLogin);
    }

    public String verifyTheLoggedInAsUserNameText(){
        return getTextFromElement(loggedInAsUserNameText);
    }

    public void clickOnDeleteAccountLink(){
        clickOnElement(deleteAccountLink);
    }

    public void clickOnLogoutLink(){
        clickOnElement(logoutLink);
    }

    public void clickOnContactUsLink(){
        clickOnElement(contactUSLink);
    }

    public void clickOnProductLink(){
        clickOnElement(productLink);
    }

    public void scrollToElement() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", subscriptionText);
    }

    public String verifyTheSubscriptionText(){
        return getTextFromElement(subscriptionText);
    }

    public void enterEmailAddressInField(String emailAddress){
        sendTextToElement(subscriptionEmailField,emailAddress);
    }

    public void clickOnArrowButton(){
        clickOnElement(subscriptionButton);
    }

    public String verifyTheSuccessAlertText(){
        return getTextFromElement(successAlertText);
    }

    public void clickOnCartLink(){
        clickOnElement(cartLink);
    }

    public String verifyTheCategoryText(){
        return getTextFromElement(categoryText);
    }

    public void clickOnWomanCategory(){
        clickOnElement(womenCategoryLink);
    }

    public void clickOnWomenTopsCategory(){
        clickOnElement(womenTopsCategoryLink);
    }

    public void clickOnMenCategory(){
        clickOnElement(menCategoryLink);
    }

    public void clickOnMenJeansCategory(){
        clickOnElement(menJeansCategoryLink);
    }

    public void clickOnAddToCartRecommendedProduct(){
        recommendedItemsList.get(4).click();
    }

    public void scrollToElementToRecommendedItems() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",recommendedItemsText);
    }

    public String verifyTheRecommendedItemsText(){
        return getTextFromElement(recommendedItemsText);
    }

    public void verifyTheRecommendedProductIsDisplay(){
       Assert.assertEquals(addedCardProducts.size(),1);
    }

    public void clickOnViewCartButtonInRecommendedItems(){
        clickOnElement(viewCartButtonInRecommendedItems);
    }

    public void clickOnBottomRightArrowButton() {
        clickOnElement(bottomRightArrowButton);
    }

    public String getFullFledgedText() {
        return getTextFromElement(fullFledgedText);
    }

    public void scrollUp() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,0)", "");
    }
}

