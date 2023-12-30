package com.automationexercise.steps;

import com.automationexercise.pages.ProductPage;
import com.automationexercise.pages.TShirtSearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ProductSearchSteps {
    @And("I enters a product name {string} in the search input")
    public void iEntersAProductNameInTheSearchInput(String name) {
        new ProductPage().searchProductName(name);
    }

    @And("I click on Search button")
    public void iClickOnSearchButton() {
        new ProductPage().clickOnSearchButton();
    }

    @Then("I verifies that SEARCHED PRODUCTS is visible")
    public void iVerifiesThatSEARCHEDPRODUCTSIsVisible() {
        Assert.assertEquals(new TShirtSearchPage().verifyTheSearchedProductsText(),"SEARCHED PRODUCTS");
    }

    @And("I verifies that all the products related to the search are visible")
    public void iVerifiesThatAllTheProductsRelatedToTheSearchAreVisible() {
        new TShirtSearchPage().verifyTheProductIsAsPerTheSearch();
    }
}

