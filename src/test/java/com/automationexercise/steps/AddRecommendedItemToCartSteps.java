package com.automationexercise.steps;

import com.automationexercise.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AddRecommendedItemToCartSteps {
    @And("I scrolls to the bottom of the page")
    public void iScrollsToTheBottomOfThePage() {
        new HomePage().scrollToElementToRecommendedItems();
    }

    @Then("I verifies RECOMMENDED ITEMS are visible")
    public void iVerifiesRECOMMENDEDITEMSAreVisible() {
        Assert.assertEquals(new HomePage().verifyTheRecommendedItemsText(),"RECOMMENDED ITEMS");
    }


    @When("I clicks on Add To Cart on a Recommended product")
    public void iClicksOnAddToCartOnARecommendedProduct() {
        new HomePage().clickOnAddToCartRecommendedProduct();
    }

    @And("I clicks on View Cart button")
    public void iClicksOnViewCartButton() {
        new HomePage().clickOnViewCartButtonInRecommendedItems();
    }

    @Then("I verifies that the product is displayed in the cart page")
    public void iVerifiesThatTheProductIsDisplayedInTheCartPage() {
        new HomePage().verifyTheRecommendedProductIsDisplay();
    }


}

