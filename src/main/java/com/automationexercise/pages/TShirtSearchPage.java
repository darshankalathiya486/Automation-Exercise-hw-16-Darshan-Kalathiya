package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.testng.AssertJUnit.assertTrue;

public class TShirtSearchPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Searched Products']")
    WebElement searchedProductsText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='productinfo text-center']//p")
    List<WebElement> productName;

    public String verifyTheSearchedProductsText(){
        return getTextFromElement(searchedProductsText);
    }

    public void verifyTheProductIsAsPerTheSearch(){
        for (int i=0; i<productName.size(); i++){
            assertTrue(productName.get(i).getText().contains("Jeans"));
        }
    }
}
