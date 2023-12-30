package com.automationexercise.steps;

import com.automationexercise.pages.ContactUsPage;
import com.automationexercise.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ContactUsFormSteps {
    @When("I clicks on the Contact Us button")
    public void iClicksOnTheContactUsButton() {
        new HomePage().clickOnContactUsLink();
    }

    @And("I verifies that GET IN TOUCH is visible")
    public void iVerifiesThatGETINTOUCHIsVisible() {
        String expectedText = "GET IN TOUCH";
        String actualText = new ContactUsPage().verifyTheGetInTouchText();
        Assert.assertEquals(actualText,expectedText);
    }

    @And("I enters a name {string}, email {string}, subject{string}, and message{string}")
    public void iEntersANameEmailSubjectAndMessage(String name, String email, String sub, String message) {
        new ContactUsPage().enterGetInTouchDetails(name, email, sub, message);
    }

    @And("I clicks the Submit button")
    public void iClicksTheSubmitButton() {
        new ContactUsPage().clickOnSubmitButton();
    }

    @And("I clicks the OK button in the confirmation dialog")
    public void iClicksTheOKButtonInTheConfirmationDialog() {
        new ContactUsPage().confirmationDialog();
    }

    @Then("I verifies that the success message Success! Your details have been submitted successfully is visible")
    public void iVerifiesThatTheSuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible() {
        String expectedText1 = "Success! Your details have been submitted successfully.";
        String actualText1 = new ContactUsPage().verifyTheSuccessMessageText();
        Assert.assertEquals(actualText1,expectedText1);
    }

    @And("I clicks the Home button")
    public void iClicksTheHomeButton() {
        new ContactUsPage().clickOnHomeButton();
    }

    @And("I verifies that they have landed on the home page successfully")
    public void iVerifiesThatTheyHaveLandedOnTheHomePageSuccessfully() {
        String expectedText2 = "AutomationExercise";
        String actualText2 = new ContactUsPage().verifyTheHomePage();
        Assert.assertEquals(actualText2,expectedText2);
    }

}
