package com.automationexercise.steps;

import com.automationexercise.pages.CartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class RemoveProductFromCartSteps {
    @And("I clicks X button corresponding to a particular product")
    public void iClicksXButtonCorrespondingToAParticularProduct() {
        new CartPage().clickOnCrossButton();
    }

    @Then("I verifies that the product is removed from the cart")
    public void iVerifiesThatTheProductIsRemovedFromTheCart() throws InterruptedException {

        Thread.sleep(2000);
        Assert.assertEquals(new CartPage().verifyTheCartIsEmpty(),"Cart is empty!");
    }
}
