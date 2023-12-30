@regression
Feature: Add Recommended Item to Cart

  @author_Darshan_Kalathiya @sanity @smoke
  Scenario: Add a Recommended Item to Cart
    Given I am in Homepage
    And I scrolls to the bottom of the page
    Then I verifies RECOMMENDED ITEMS are visible
    When I clicks on Add To Cart on a Recommended product
    And I clicks on View Cart button
    Then I verifies that the product is displayed in the cart page
