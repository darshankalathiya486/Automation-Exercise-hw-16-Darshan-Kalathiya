package com.automationexercise.steps;

import com.automationexercise.pages.CartPage;
import com.automationexercise.pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class addToCartSteps {
    @And("I hovers over the first product")
    public void iHoversOverTheFirstProduct() {
        new ProductPage().mouseHoverOnFirstProduct();
    }

    @And("I click on Add to cart link")
    public void iClickOnAddToCartLink() {
        new ProductPage().clickOnFirstProductAddToCart();
    }

    @And("I clicks Continue Shopping button")
    public void iClicksContinueShoppingButton(){
        new ProductPage().clickOnContinueShoppingButton();
    }

    @And("I hovers over the second product")
    public void iHoversOverTheSecondProduct() {
        new ProductPage().mouseHoverOnSecondProduct();
    }

    @And("I click on second product Add to cart link")
    public void iClickOnSecondProductAddToCartLink() throws InterruptedException {
        Thread.sleep(2000);
        new ProductPage().clickOnSecondProductAddToCart();
    }

    @And("I clicks View Cart button")
    public void iClicksViewCartButton() {
        new ProductPage().clickOnViewCart();
    }

    @Then("I verifies that firstProduct {string} and secondProduct {string} are added to the Cart")
    public void iVerifiesThatFirstProductAndSecondProductAreAddedToTheCart(String firstProduct, String secondProduct) {
        Assert.assertEquals(new CartPage().verifyFirstProductName(),firstProduct);
        Assert.assertEquals(new CartPage().verifySecondProductName(),secondProduct);
    }

    @And("I verifies the price {string}, quantity {string}, and total {string} of  product in the Cart")
    public void iVerifiesThePriceQuantityAndTotalOfProductInTheCart(String price, String quantity, String total) {
        Assert.assertEquals(new CartPage().verifyFirstProductPrice(),price);
        Assert.assertEquals(new CartPage().verifyFirstProuctQuantity(),quantity);
        Assert.assertEquals(new CartPage().verifyFirstProductTotal(),total);
    }

    @And("I verifies the SecondPrice {string}, SecondQuantity {string}, and SecondTotal {string} of  product in the Cart")
    public void iVerifiesTheSecondPriceSecondQuantityAndSecondTotalOfProductInTheCart(String SecondPrice, String SecondQuantity, String SecondTotal) {
        Assert.assertEquals(new CartPage().verifySecondProductPrice(),SecondPrice);
        Assert.assertEquals(new CartPage().verifySecondProductQuantity(),SecondQuantity);
        Assert.assertEquals(new CartPage().verifySecondProductTotal(),SecondTotal);
    }
}
