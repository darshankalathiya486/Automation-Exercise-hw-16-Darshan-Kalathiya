package com.automationexercise.steps;

import com.automationexercise.pages.SignupPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class SignupWithAllreadyRegisteredEmailSteps {
    @Then("I verifies that the error Email Address already exists! is visible")
    public void iVerifiesThatTheErrorEmailAddressAlreadyExistsIsVisible() {
        String expectedText = "Email Address already exist!";
        String actualText = new SignupPage().verifyTheEmailAddressAlreadyExistText();
        Assert.assertEquals(actualText,expectedText);

    }
}
