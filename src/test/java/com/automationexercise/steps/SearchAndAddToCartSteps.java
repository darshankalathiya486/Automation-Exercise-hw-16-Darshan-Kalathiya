package com.automationexercise.steps;

import com.automationexercise.pages.CartPage;
import com.automationexercise.pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class SearchAndAddToCartSteps {

    @And("I hovers over the first Jeans product")
    public void iHoversOverTheFirstJeansProduct() {
        new ProductPage().mouseHoverOnSoftStretchJeans();
    }

    @And("I hovers over the second Jeans product")
    public void iHoversOverTheSecondJeansProduct() {
        new ProductPage().mouseHoverOnRegularFitJeans();
    }


    @Then("I verifies that the products are visible in the cart")
    public void iVerifiesThatTheProductsAreVisibleInTheCart() {
        Assert.assertEquals(new CartPage().verifyTheCardProduct(),2);
    }


    @And("I verifies that those products are visible in the cart after login as well")
    public void iVerifiesThatThoseProductsAreVisibleInTheCartAfterLoginAsWell() {
        Assert.assertEquals(new CartPage().verifyTheCardProduct(),2);
    }
}


