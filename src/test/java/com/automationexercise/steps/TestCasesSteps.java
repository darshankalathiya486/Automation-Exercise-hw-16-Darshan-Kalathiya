package com.automationexercise.steps;

import com.automationexercise.pages.TestCasesPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TestCasesSteps {
    @When("I clicks on the Test Cases button")
    public void iClicksOnTheTestCasesButton() {
        new TestCasesPage().clickOnTestCasesButton();
    }

    @Then("I verifies that they are navigated to the test cases page successfully")
    public void iVerifiesThatTheyAreNavigatedToTheTestCasesPageSuccessfully() {
        String expectedText = "TEST CASES";
        String actualText = new TestCasesPage().verifyTheTestCasesPage();
        Assert.assertEquals(actualText,expectedText);
    }
}
