@regression
Feature: Remove Product from Cart

  @author_Darshan_Kalathiya @sanity @smoke
  Scenario: Remove a product from the cart
    Given I am in Homepage
    When I clicks on the Products button
    And I verifies that they are navigated to the ALL PRODUCTS page successfully
    And I hovers over the first product
    And I click on Add to cart link
    And I clicks Continue Shopping button
    And I clicks on the Cart button
    And I is on the Cart page
    And I clicks X button corresponding to a particular product
    Then I verifies that the product is removed from the cart