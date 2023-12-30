package com.automationexercise.steps;

import com.automationexercise.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Objects;

public class RegistrationSteps {
    @Given("I am in Homepage")
    public void iAmInHomepage() {
    }

    @When("I clicks on the Signup and Login button")
    public void iClicksOnTheSignupAndLoginButton() {
        new HomePage().clickOnSignupAndLoginButton();
    }

    @And("I verifies that New User Signup! is visible")
    public void iVerifiesThatNewUserSignupIsVisible() {
        String expectedText = "New User Signup!";
        String actualText = new LoginPage().verifyNewUserSignupText();
        Assert.assertEquals(actualText,expectedText);
    }

    @And("I enters the name {string}")
    public void iEntersTheName(String name) {
        new LoginPage().enterNameINField(name);
    }

    @And("I enters email {string}")
    public void iEntersEmail(String email) {
        new LoginPage().enterEmailInField(email);
    }

    @And("I clicks the Signup button")
    public void iClicksTheSignupButton() {
        new LoginPage().clickOnSignupButton();
    }

    @And("I verifies that ENTER ACCOUNT INFORMATION is visible")
    public void iVerifiesThatENTERACCOUNTINFORMATIONIsVisible() {
        String expectedText1 = "ENTER ACCOUNT INFORMATION";
        String actualText1 = new SignupPage().verifyEnterAccountInformation();
        Assert.assertEquals(actualText1,expectedText1);
    }

    @And("I click On title {string}")
    public void iClickOnTitle(String title) {
        if (Objects.equals(title, "Mr.")){
            new SignupPage().selectTitleMr();
        }else if(Objects.equals(title, "Mrs.")) {
            new SignupPage().selectTitleMrs();
        }else {
            System.out.println("select wrong Title");
        }
    }

    @And("I enter Password {string}")
    public void iEnterPassword(String password) {
        new SignupPage().enterPassword(password);
    }

    @And("I enter day {string}")
    public void iEnterDay(String day) {
        new SignupPage().selectDay(day);
    }

    @And("I enter month {string}")
    public void iEnterMonth(String month) {
        new SignupPage().selectMonth(month);
    }

    @And("I enter year {string}")
    public void iEnterYear(String year) {
        new SignupPage().selectYear(year);
    }

    @And("I selects the checkbox Sign up for our newsletter!")
    public void iSelectsTheCheckboxSignUpForOurNewsletter() {
        new SignupPage().clickOnSignUForOurNewsletterCheckBox();
    }

    @And("I selects the checkbox Receive special offers from our partners!")
    public void iSelectsTheCheckboxReceiveSpecialOffersFromOurPartners() {
        new SignupPage().clickOnReceiveSpecialOffersFromOurPartnersCheckBox();
    }

    @And("I fills My personal details firstname {string}, lastname {string}, company {string}, address {string}, addressTwo {string}, country {string}, state {string}, city {string}, zipcode {string}, mobileNumber {string}")
    public void iFillsMyPersonalDetailsFirstnameLastnameCompanyAddressAddressTwoCountryStateCityZipcodeMobileNumber(String fName, String lName, String companyName, String address, String address2, String country, String state, String city, String zipcode, String mobileNumber) {
        new SignupPage().fillYourPersonalDetails(fName, lName, companyName, address, address2, country, state, city, zipcode, mobileNumber);
    }

    @And("I clicks the Create Account button")
    public void iClicksTheCreateAccountButton() {
        new SignupPage().clickOnCreateAccountButton();
    }


    @Then("I verifies that ACCOUNT CREATED! is visible")
    public void iVerifiesThatACCOUNTCREATEDIsVisible() {
        String expectedText2 = "ACCOUNT CREATED!";
        String actualText2 = new AccountCreatePage().verifyTheAccountCreatedText();
        Assert.assertEquals(actualText2,expectedText2);

    }

    @And("I clicks the Continue button")
    public void iClicksTheContinueButton() {
        new AccountCreatePage().clickOnContinueButton();
    }

    @And("I verifies that Logged in as username {string} is visible")
    public void iVerifiesThatLoggedInAsUsernameIsVisible(String username) {
        String expectedText3 = "Logged in as " + username;
        String actualText3 = new HomePage().verifyTheLoggedInAsUserNameText();
        Assert.assertEquals(actualText3,expectedText3);
    }

    @And("I clicks the Delete Account button")
    public void iClicksTheDeleteAccountButton() {
        new HomePage().clickOnDeleteAccountLink();
    }

    @And("I verifies that ACCOUNT DELETED! is visible")
    public void iVerifiesThatACCOUNTDELETEDIsVisible() {
        String expectedText4 = "ACCOUNT DELETED!";
        String actualText4 = new DeleteAccountPage().verifyTheAccountDeletedText();
        Assert.assertEquals(actualText4,expectedText4);
    }

    @And("I clicks the  delete account Continue button")
    public void iClicksTheDeleteAccountContinueButton() {
        new DeleteAccountPage().clickOnDeleteContinueButton();
    }
}


