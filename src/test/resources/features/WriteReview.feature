@regression
Feature: Write a Product Review

  @author_Darshan_Kalathiya @sanity @smoke
  Scenario: Write a review for a product
    Given I am in Homepage
    When I clicks on the Products button
    And I verifies that they are navigated to the ALL PRODUCTS page successfully
    And I verifies that the products list is visible
    And I clicks on View Product of the first product
    And I scrolls down to the  write your review footer
    Then I verifies title "WRITE YOUR REVIEW" is visible
    And I enters name "Raj", email "raj258@gmailcom", and review "Blue Top"
    And I clicks the Submit product detail submit button
    And I verifies the submit message "Thank you for your review."