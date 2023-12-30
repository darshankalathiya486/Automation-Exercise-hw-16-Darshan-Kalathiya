package com.automationexercise.steps;

import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.ProductDetailsPage;
import com.automationexercise.pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ProductVerificationSteps {
    @When("I clicks on the Products button")
    public void iClicksOnTheProductsButton() {
        new HomePage().clickOnProductLink();
    }

    @And("I verifies that they are navigated to the ALL PRODUCTS page successfully")
    public void iVerifiesThatTheyAreNavigatedToTheALLPRODUCTSPageSuccessfully() {
        Assert.assertEquals(new ProductPage().verifyTheAllProductText(),"ALL PRODUCTS");
    }

    @And("I verifies that the products list is visible")
    public void iVerifiesThatTheProductsListIsVisible() {
        new ProductPage().verifyProductsListVisibility();
    }

    @And("I clicks on View Product of the first product")
    public void iClicksOnViewProductOfTheFirstProduct() {
        new ProductPage().clickOnFirstProductName();
    }

    @And("I verifies that product details are visible productName {string}, category {string}, price {string}, availability {string}, condition {string}, brand {string}")
    public void iVerifiesThatProductDetailsAreVisibleProductNameCategoryPriceAvailabilityConditionBrand(String productName, String category, String price, String availability, String condition, String brand) {
        Assert.assertEquals(new ProductDetailsPage().verifyProductName(),productName);
        Assert.assertEquals(new ProductDetailsPage().verifyCategory(),category);
        Assert.assertEquals(new ProductDetailsPage().verifyPrice(),price);
        Assert.assertEquals(new ProductDetailsPage().verifyAvailability(),availability);
        Assert.assertEquals(new ProductDetailsPage().verifyTheCondition(),condition);
        Assert.assertEquals(new ProductDetailsPage().verifyTheBrand(),brand);
    }


}


