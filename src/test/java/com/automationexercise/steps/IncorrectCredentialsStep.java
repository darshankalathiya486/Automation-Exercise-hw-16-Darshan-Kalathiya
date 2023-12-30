package com.automationexercise.steps;

import com.automationexercise.pages.LoginPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class IncorrectCredentialsStep {
    @Then("I verifies that the error Your email or password is incorrect! is visible")
    public void iVerifiesThatTheErrorYourEmailOrPasswordIsIncorrectIsVisible() {
        String expectedText = "Your email or password is incorrect!";
        String actualText = new LoginPage().verifyTheYourEmailAndPasswordIsIncorrect();
        Assert.assertEquals(actualText,expectedText);
    }
}

