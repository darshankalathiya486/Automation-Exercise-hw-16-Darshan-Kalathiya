package com.automationexercise.steps;

import com.automationexercise.pages.HomePage;
import io.cucumber.java.en.And;
import org.testng.Assert;

public class ScrollFunctionalitySteps {
    @And("I click on arrow up button at bottom right corner")
    public void iClickOnArrowUpButtonAtBottomRightCorner() {
        new HomePage().clickOnBottomRightArrowButton();
    }

    @And("I should see the message {string}")
    public void iShouldSeeTheMessage(String expectedText) {
        Assert.assertEquals(new HomePage().getFullFledgedText(), expectedText);
    }
}
