package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//li[@class='active']")
    WebElement shoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Blue Top']")
    WebElement firstProductNameText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Men Tshirt']")
    WebElement secondProductNameText;

    @CacheLookup
    @FindBy(xpath = "//td[@class='cart_price']//p[contains(text(),'Rs. 500')]")
    WebElement firstProductPrice;

    @CacheLookup
    @FindBy(xpath = "//td[@class='cart_price']//p[contains(text(),'Rs. 400')]")
    WebElement secondProductPrice;

    @CacheLookup
    @FindBy(xpath = "//tr[@id='product-1']//button[@class='disabled'][normalize-space()='1']")
    WebElement firstProductQuantity;

    @CacheLookup
    @FindBy(xpath = "//tr[@id='product-2']//button[@class='disabled'][normalize-space()='1']")
    WebElement secondProductQuantity;

    @CacheLookup
    @FindBy(xpath = "//p[@class='cart_total_price'][normalize-space()='Rs. 500']")
    WebElement firstProductTotal;

    @CacheLookup
    @FindBy(xpath = "//p[@class='cart_total_price'][normalize-space()='Rs. 400']")
    WebElement secondProductTotal;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='4']")
    WebElement thirdProductQuantity;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Proceed To Checkout']")
    WebElement proceedToCheckoutButton;

    @CacheLookup
    @FindBy(xpath = "//p[2]")
    WebElement registerAndLoginLink;

    @CacheLookup
    @FindBy(xpath = "//a[@class='cart_quantity_delete']")
    WebElement crossButton;

    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Cart is empty!']")
    WebElement cartIsEmptyText;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr")
    List<WebElement> cardProducts;



    public String verifyTheShoppingCartText(){
        return getTextFromElement(shoppingCartText);
    }

    public String verifyFirstProductName(){
        return getTextFromElement(firstProductNameText);
    }
    public String verifySecondProductName(){
        return getTextFromElement(secondProductNameText);
    }

    public String verifyFirstProductPrice(){
        return getTextFromElement(firstProductPrice);
    }

    public String verifySecondProductPrice(){
        return getTextFromElement(secondProductPrice);
    }

    public String verifyFirstProuctQuantity(){
        return getTextFromElement(firstProductQuantity);
    }

    public String verifySecondProductQuantity(){
        return getTextFromElement(secondProductQuantity);
    }

    public String verifyFirstProductTotal(){
        return getTextFromElement(firstProductTotal);
    }

    public String verifySecondProductTotal(){
        return getTextFromElement(secondProductTotal);
    }

    public String verifyThirdProductQuantity(){
        return getTextFromElement(thirdProductQuantity);
    }

    public void clickOnProceedTOCheckout(){
        clickOnElement(proceedToCheckoutButton);
    }

    public void clickOnRegisterAndLoginButton(){
        clickOnElement(registerAndLoginLink);
    }

    public void clickOnCrossButton(){
        clickOnElement(crossButton);
    }

    public String verifyTheCartIsEmpty(){
        return getTextFromElement(cartIsEmptyText);
    }

    public int verifyTheCardProduct(){
        return cardProducts.size();
    }



}
