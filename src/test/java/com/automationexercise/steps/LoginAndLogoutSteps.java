package com.automationexercise.steps;

import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.LoginPage;
import io.cucumber.java.en.And;
import org.testng.Assert;

public class LoginAndLogoutSteps {
    @And("I clicks the Logout button")
    public void iClicksTheLogoutButton() {
        new HomePage().clickOnLogoutLink();
    }

    @And("I verifies that the user is navigated to the login page")
    public void iVerifiesThatTheUserIsNavigatedToTheLoginPage() {
        String expectedText = "Login to your account";
        String actualText = new LoginPage().verifyLoginToYourAccountText();
        Assert.assertEquals(actualText,expectedText);
    }
}
