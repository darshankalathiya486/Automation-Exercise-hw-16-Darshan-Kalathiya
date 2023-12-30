@regression
Feature: Add Product to Cart and Verify Quantity

  @author_Darshan_Kalathiya @sanity @smoke
  Scenario: Add a product to cart and verify the quantity
    Given I am in Homepage
    When I clicks on the Products button
    And I verifies that they are navigated to the ALL PRODUCTS page successfully
    And I verifies that the products list is visible
    And I clicks on View Product of the first product
    And I verifies that product details are visible productName "Blue Top", category "Category: Women > Tops", price "Rs. 500", availability "Availability: In Stock", condition "Condition: New", brand "Brand: Polo"
    And I increases the quantity "4"
    And I clicks the Add to cart button
    And I clicks the View Cart button
    Then I verifies the product "Blue Top" and quantity "4" of  product in the Cart