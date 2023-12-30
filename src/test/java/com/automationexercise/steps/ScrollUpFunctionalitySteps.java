package com.automationexercise.steps;

import com.automationexercise.pages.HomePage;
import io.cucumber.java.en.And;

public class ScrollUpFunctionalitySteps {
    @And("I scroll up")
    public void iScrollUp() {
        new HomePage().scrollUp();
    }
}
