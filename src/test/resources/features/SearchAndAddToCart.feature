@regression
Feature: Search and Add Products to Cart

  @author_Darshan_Kalathiya @sanity @smoke
  Scenario: Search for products, add to cart, and verify in Cart Page
    Given I am in Homepage
    When I clicks on the Products button
    And I verifies that they are navigated to the ALL PRODUCTS page successfully
    And I enters a product name "Jeans" in the search input
    And I click on Search button
    And I verifies that SEARCHED PRODUCTS is visible
    And I verifies that all the products related to the search are visible
    And I hovers over the first Jeans product
    And I click on Add to cart link
    And I clicks Continue Shopping button
    And I hovers over the second Jeans product
    And I click on second product Add to cart link
    And I clicks View Cart button
    Then I verifies that the products are visible in the cart
    And I clicks on the Signup and Login button
    And I verifies that Login to your account is visible
    And I enters the correct emailAddress "sumit123@gmail.com" and password "123456"
    And I clicks the Login button
    And I clicks on the Cart button
    And I verifies that those products are visible in the cart after login as well