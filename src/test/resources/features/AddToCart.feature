@regression
Feature: Add Products to Cart

  @author_Darshan_Kalathiya @sanity @smoke
  Scenario: Add products to cart and verify details
    Given I am in Homepage
    When I clicks on the Products button
    And I verifies that they are navigated to the ALL PRODUCTS page successfully
    And I hovers over the first product
    And I click on Add to cart link
    And I clicks Continue Shopping button
    And I hovers over the second product
    And I click on second product Add to cart link
    And I clicks View Cart button
    Then I verifies that firstProduct "Blue Top" and secondProduct "Men Tshirt" are added to the Cart
    And I verifies the price "Rs. 500", quantity "1", and total "Rs. 500" of  product in the Cart
    And I verifies the SecondPrice "Rs. 400", SecondQuantity "1", and SecondTotal "Rs. 400" of  product in the Cart