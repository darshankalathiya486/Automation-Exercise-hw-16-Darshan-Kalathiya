package com.automationexercise.steps;

import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.ProductsCategoryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class NavigateAndVerifyCategoriesSteps {
    @When("I verifies that categories are visible on the left sidebar")
    public void iVerifiesThatCategoriesAreVisibleOnTheLeftSidebar() {
        Assert.assertEquals(new HomePage().verifyTheCategoryText(),"CATEGORY");
    }

    @And("I clicks on Women category")
    public void iClicksOnWomenCategory() {
        new HomePage().clickOnWomanCategory();
    }

    @And("I clicks on any category link under Women category, for example: Dress")
    public void iClicksOnAnyCategoryLinkUnderWomenCategoryForExampleDress() {
        new HomePage().clickOnWomenTopsCategory();
    }

    @Then("I confirms the text {string}")
    public void iConfirmsTheText(String text) {
        Assert.assertEquals(new ProductsCategoryPage().verifyTheWomenTopsProducts(),text);
    }

    @And("I clicks on any sub-category link of Men category on the left sidebar")
    public void iClicksOnAnySubCategoryLinkOfMenCategoryOnTheLeftSidebar() {
        new HomePage().clickOnMenCategory();
    }

    @And("I clicks on any category link under Men category, for example: Jeans")
    public void iClicksOnAnyCategoryLinkUnderMenCategoryForExampleJeans() {
        new HomePage().clickOnMenJeansCategory();
    }

    @And("I verifies that the user is navigated to that category page")
    public void iVerifiesThatTheUserIsNavigatedToThatCategoryPage() {
        Assert.assertEquals(new ProductsCategoryPage().verifyTheMenJeansProducts(),"MEN - JEANS PRODUCTS");
    }


}

