package com.automationexercise.steps;

import com.automationexercise.pages.CartPage;
import com.automationexercise.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class NewsletterSubscriptionSteps {
    @When("I clicks on the Cart button")
    public void iClicksOnTheCartButton() {
        new HomePage().clickOnCartLink();
    }

    @And("I is on the Cart page")
    public void iIsOnTheCartPage() {
        Assert.assertEquals(new CartPage().verifyTheShoppingCartText(),"Shopping Cart");
    }
}
