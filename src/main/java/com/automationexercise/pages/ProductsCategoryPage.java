package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ProductsCategoryPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Women - Tops Products']")
    WebElement womenTopsProducts;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Men - Jeans Products']")
    WebElement menJeansProducts;

    public String verifyTheWomenTopsProducts(){
        return getTextFromElement(womenTopsProducts);
    }

    public String verifyTheMenJeansProducts(){
        return getTextFromElement(menJeansProducts);
    }



}
