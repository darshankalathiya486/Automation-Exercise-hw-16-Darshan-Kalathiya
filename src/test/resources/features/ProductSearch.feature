@regression
Feature: Product Search

  @author_Darshan_Kalathiya @sanity @smoke
  Scenario: Search for products
    Given I am in Homepage
    When I clicks on the Products button
    And I verifies that they are navigated to the ALL PRODUCTS page successfully
    And I enters a product name "Jeans" in the search input
    And I click on Search button
    Then I verifies that SEARCHED PRODUCTS is visible
    And I verifies that all the products related to the search are visible
