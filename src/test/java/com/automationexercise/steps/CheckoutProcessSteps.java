package com.automationexercise.steps;

import com.automationexercise.pages.CheckOutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CheckoutProcessSteps {
    @Then("I verifies that the delivery address is the same as the address filled at the time of account registration")
    public void iVerifiesThatTheDeliveryAddressIsTheSameAsTheAddressFilledAtTheTimeOfAccountRegistration() {
        Assert.assertEquals(new CheckOutPage().verifyTheAddressText(),"harrow");
    }

    @And("I verifies that the billing address is the same as the address filled at the time of account registration")
    public void iVerifiesThatTheBillingAddressIsTheSameAsTheAddressFilledAtTheTimeOfAccountRegistration() {
        Assert.assertEquals(new CheckOutPage().verifyTheAddressText(),"harrow");
    }
}
