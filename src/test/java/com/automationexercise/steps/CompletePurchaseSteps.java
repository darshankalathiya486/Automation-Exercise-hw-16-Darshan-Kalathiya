package com.automationexercise.steps;

import com.automationexercise.pages.CartPage;
import com.automationexercise.pages.CheckOutPage;
import com.automationexercise.pages.PaymentDonePage;
import com.automationexercise.pages.PaymentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CompletePurchaseSteps {
    @And("I clicks Proceed To Checkout")
    public void iClicksProceedToCheckout() {
        new CartPage().clickOnProceedTOCheckout();
    }

    @And("I clicks Register and Login button")
    public void iClicksRegisterAndLoginButton() {
        new CartPage().clickOnRegisterAndLoginButton();
    }

    @Then("I verifies add details {string} and order {string}")
    public void iVerifiesAddDetailsAndOrder(String details, String order) {
        Assert.assertEquals(new CheckOutPage().verifyTheAddressDetailsText(),details);
        Assert.assertEquals(new CheckOutPage().verifyTheReviewYourOrderText(),order);
    }

    @And("I enters a description {string} in the comment text area")
    public void iEntersADescriptionInTheCommentTextArea(String comment) {
        new CheckOutPage().enterMessageInTextArea(comment);
    }

    @And("I click On Place Order")
    public void iClickOnPlaceOrder() {
        new CheckOutPage().clickOnPlaceOrderButton();
    }

    @And("I enters payment details nameOnCard {string}, cardNumber {string}, cvc {string}, expireMonth {string}, expireYear {string}")
    public void iEntersPaymentDetailsNameOnCardCardNumberCvcExpireMonthExpireYear(String name, String number, String cvc, String month, String year) {
        new PaymentPage().enterPaymentDetailsOnField(name, number, cvc, month, year);
    }

    @And("I clicks Pay and Confirm Order button")
    public void iClicksPayAndConfirmOrderButton() {
        new PaymentPage().clickOnPayAndConfirmOrderButton();
    }

    @And("I verifies the success message {string}")
    public void iVerifiesTheSuccessMessage(String message) {
        Assert.assertEquals(new PaymentDonePage().verifyTheOrderPlacedMessage(),message);
    }
}

