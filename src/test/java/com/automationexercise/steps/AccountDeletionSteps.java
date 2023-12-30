package com.automationexercise.steps;

import com.automationexercise.pages.LoginPage;
import io.cucumber.java.en.And;
import org.testng.Assert;

public class AccountDeletionSteps {
    @And("I verifies that Login to your account is visible")
    public void iVerifiesThatLoginToYourAccountIsVisible() {
        String expectedText = "Login to your account";
        String actualText = new LoginPage().verifyLoginToYourAccountText();
        Assert.assertEquals(actualText,expectedText);
    }

    @And("I enters the correct emailAddress {string} and password {string}")
    public void iEntersTheCorrectEmailAddressAndPassword(String email, String password) {
        new LoginPage().validEmailAndPassword(email,password);
    }

    @And("I clicks the Login button")
    public void iClicksTheLoginButton() {
        new LoginPage().clickOnLoginButton();
    }
}
