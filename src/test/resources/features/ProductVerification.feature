@regression
Feature: Product Details Verification

  @author_Darshan_Kalathiya @sanity @smoke
  Scenario: Verify navigation to Product Detail Page
    Given I am in Homepage
    When I clicks on the Products button
    And I verifies that they are navigated to the ALL PRODUCTS page successfully
    And I verifies that the products list is visible
    And I clicks on View Product of the first product
    And I verifies that product details are visible productName "Blue Top", category "Category: Women > Tops", price "Rs. 500", availability "Availability: In Stock", condition "Condition: New", brand "Brand: Polo"

