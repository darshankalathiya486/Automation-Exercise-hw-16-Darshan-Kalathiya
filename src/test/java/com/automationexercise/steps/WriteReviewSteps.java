package com.automationexercise.steps;

import com.automationexercise.pages.ProductDetailsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class WriteReviewSteps {

    @And("I scrolls down to the  write your review footer")
    public void iScrollsDownToTheWriteYourReviewFooter() {
        new ProductDetailsPage().scrollToElement();
    }

    @Then("I verifies title {string} is visible")
    public void iVerifiesTitleIsVisible(String title) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(new ProductDetailsPage().verifyTheWriteYourReviewText(),title);
    }

    @And("I enters name {string}, email {string}, and review {string}")
    public void iEntersNameEmailAndReview(String name, String email, String review) {
        new ProductDetailsPage().enterDetails(name, email, review);
    }

    @And("I clicks the Submit product detail submit button")
    public void iClicksTheSubmitProductDetailSubmitButton() {
        new ProductDetailsPage().clickOnSubmitButton();
    }


    @And("I verifies the submit message {string}")
    public void iVerifiesTheSubmitMessage(String message) {
        Assert.assertEquals(new ProductDetailsPage().verifyTheSubmitMessageText(),message);
    }
}

