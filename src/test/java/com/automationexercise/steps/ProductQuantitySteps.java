package com.automationexercise.steps;

import com.automationexercise.pages.CartPage;
import com.automationexercise.pages.ProductDetailsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ProductQuantitySteps {
    @When("I increases the quantity {string}")
    public void iIncreasesTheQuantity(String qua) {
        new ProductDetailsPage().enterQuantityInField(qua);
    }

    @And("I clicks the Add to cart button")
    public void iClicksTheAddToCartButton() {
        new ProductDetailsPage().clickOnAddToCartButton();
    }

    @And("I clicks the View Cart button")
    public void iClicksTheViewCartButton() {
        new ProductDetailsPage().clickOnViewCardLink();
    }

    @Then("I verifies the product {string} and quantity {string} of  product in the Cart")
    public void iVerifiesTheProductAndQuantityOfProductInTheCart(String product, String quantity) {
        Assert.assertEquals(new CartPage().verifyFirstProductName(),product);
        Assert.assertEquals(new CartPage().verifyThirdProductQuantity(),quantity);
    }
}

