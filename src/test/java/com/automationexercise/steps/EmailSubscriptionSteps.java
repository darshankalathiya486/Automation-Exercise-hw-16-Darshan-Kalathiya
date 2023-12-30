package com.automationexercise.steps;

import com.automationexercise.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class EmailSubscriptionSteps {
    @When("I scrolls down to the footer")
    public void iScrollsDownToTheFooter() {
        new HomePage().scrollToElement();
    }

    @And("I verifies the presence of the text SUBSCRIPTION")
    public void iVerifiesThePresenceOfTheTextSUBSCRIPTION() {
        Assert.assertEquals(new HomePage().verifyTheSubscriptionText(),"SUBSCRIPTION");
    }

    @And("I enters an emailAddress {string} in the input")
    public void iEntersAnEmailAddressInTheInput(String email) {
        new HomePage().enterEmailAddressInField(email);
    }

    @And("I click on arrow button")
    public void iClickOnArrowButton() {
        new HomePage().clickOnArrowButton();
    }

    @Then("I verifies that the success message You have been successfully subscribed! is visible")
    public void iVerifiesThatTheSuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible() {
        Assert.assertEquals(new HomePage().verifyTheSuccessAlertText(),"You have been successfully subscribed!");
    }



}


