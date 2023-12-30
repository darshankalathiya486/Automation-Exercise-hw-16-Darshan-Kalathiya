package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='All Products']")
    WebElement allProductText;


    @CacheLookup
    @FindBy(xpath = "//div[@class='productinfo text-center']//p")
    WebElement productsList;
    @CacheLookup
    @FindBy(xpath = "//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]")
    WebElement viewProductOne;

    @CacheLookup
    @FindBy(xpath = "//input[@id='search_product']")
    WebElement searchProductField;

    @CacheLookup
    @FindBy(xpath = "//button[@id='submit_search']")
    WebElement searchButton;

    @CacheLookup
    @FindBy(xpath = "//body/section/div[@class='container']/div[@class='row']/div[@class='col-sm-9 padding-right']/div[@class='features_items']/div[2]/div[1]/div[1]/div[1]")
    WebElement firstProduct;

    @CacheLookup
    @FindBy(xpath = "//body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]")
    WebElement firstProductAddToCart;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue Shopping']")
    WebElement continueShoppingButton;

    @CacheLookup
    @FindBy(xpath = "//body/section/div[@class='container']/div[@class='row']/div[@class='col-sm-9 padding-right']/div[@class='features_items']/div[3]/div[1]/div[1]/div[1]")
    WebElement secondProduct;

    @CacheLookup
    @FindBy(xpath = "//body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/a[1]")
    WebElement secondProductAddCart;

    @CacheLookup
    @FindBy(xpath = "//u[normalize-space()='View Cart']")
    WebElement viewCartLink;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Brands']")
    WebElement brandsText;

    @CacheLookup
    @FindBy(xpath = "//a[@href='/brand_products/Polo']")
    WebElement poloBrand;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Brand - Polo Products']")
    WebElement poloBrandPage;

    @CacheLookup
    @FindBy(xpath = "//a[@href='/brand_products/H&M']")
    WebElement hAndMBrand;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Brand - H&M Products']")
    WebElement hAndMBrandPage;

    @CacheLookup
    @FindBy(xpath = "//body/section/div[@class='container']/div[@class='row']/div[@class='col-sm-9 padding-right']/div[@class='features_items']/div[2]/div[1]/div[1]/div[1]")
    WebElement softStretchJeans;

    @CacheLookup
    @FindBy(xpath = "//body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/img[1]")
    WebElement regularFitJeans;









    public String verifyTheAllProductText(){
        return getTextFromElement(allProductText);
    }


    public void clickOnFirstProductName(){
        clickOnElement(viewProductOne);
    }

    public void searchProductName(String name){
        sendTextToElement(searchProductField,name);
    }

    public void clickOnSearchButton(){
        clickOnElement(searchButton);
    }

    public void verifyProductsListVisibility() {
        if (productsList.isDisplayed()) {
            System.out.println("Element is Present");
        }else {
            System.out.println("Element is Invisible");
        }
    }

    public void mouseHoverOnFirstProduct(){
        mouseHoverToElement(firstProduct);
    }

    public void clickOnFirstProductAddToCart(){
        clickOnElement(firstProductAddToCart);
    }

    public void clickOnContinueShoppingButton(){
        clickOnElement(continueShoppingButton);
    }

    public void mouseHoverOnSecondProduct(){
        mouseHoverToElement(secondProduct);
    }

    public void clickOnSecondProductAddToCart(){
        clickOnElement(secondProductAddCart);
    }
    public void clickOnViewCart(){
        clickOnElement(viewCartLink);
    }

    public String verifyBrandsTetx(){
        return getTextFromElement(brandsText);
    }

    public void clickOnPoloBrand(){
        clickOnElement(poloBrand);
    }

    public String verifyThePoloBrandPage(){
        return getTextFromElement(poloBrandPage);
    }

    public void clickOnHAndMBrand(){
        clickOnElement(hAndMBrand);
    }

    public String verifyTheHAndMBrandPage(){
        return getTextFromElement(hAndMBrandPage);
    }

    public void mouseHoverOnSoftStretchJeans(){
        mouseHoverToElement(softStretchJeans);
    }

    public void mouseHoverOnRegularFitJeans(){
        mouseHoverToElement(regularFitJeans);
    }

    }

