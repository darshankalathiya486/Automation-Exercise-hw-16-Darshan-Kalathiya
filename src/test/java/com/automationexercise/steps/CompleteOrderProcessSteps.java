package com.automationexercise.steps;

import com.automationexercise.pages.PaymentPage;
import io.cucumber.java.en.And;

public class CompleteOrderProcessSteps {
    @And("I click on download invoice after order success")
    public void iClickOnDownloadInvoiceAfterOrderSuccess() {
        new PaymentPage().clickOnDownloadInvoiceButtonAfterOrderSuccessMessage();
    }

    @And("I click on continue button after order success")
    public void iClickOnContinueButtonAfterOrderSuccess() {
        new PaymentPage().clickOnContinueButtonAfterOrderSuccessMessage();
    }
}
