package com.automationexercise.steps;

import com.automationexercise.pages.ProductPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class NavigateAndVerifyBrandsSteps {
    @Then("I verifies that Brands are visible on the left sidebar")
    public void iVerifiesThatBrandsAreVisibleOnTheLeftSidebar() {
        Assert.assertEquals(new ProductPage().verifyBrandsTetx(),"BRANDS");
    }

    @When("I clicks on any brand name")
    public void iClicksOnAnyBrandName() {
        new ProductPage().clickOnPoloBrand();
    }

    @Then("I verifies that the user is navigated to the brand page")
    public void iVerifiesThatTheUserIsNavigatedToTheBrandPage() {
        Assert.assertEquals(new ProductPage().verifyThePoloBrandPage(),"BRAND - POLO PRODUCTS");
    }

    @When("I clicks on any other brand link on the left sidebar")
    public void iClicksOnAnyOtherBrandLinkOnTheLeftSidebar() {
        new ProductPage().clickOnHAndMBrand();
    }

    @Then("I verifies that the user is navigated to that brand page")
    public void iVerifiesThatTheUserIsNavigatedToThatBrandPage() {
        Assert.assertEquals(new ProductPage().verifyTheHAndMBrandPage(),"BRAND - H&M PRODUCTS");
    }
}
