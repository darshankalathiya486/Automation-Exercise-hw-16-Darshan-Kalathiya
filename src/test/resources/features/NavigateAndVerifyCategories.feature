@regression
Feature: Navigate and Verify Categories

  @author_Darshan_Kalathiya @sanity @smoke
  Scenario: Navigate to Women category and sub-category
    Given I am in Homepage
    When I verifies that categories are visible on the left sidebar
    And I clicks on Women category
    And I clicks on any category link under Women category, for example: Dress
    Then I confirms the text "WOMEN - TOPS PRODUCTS"
    And I clicks on any sub-category link of Men category on the left sidebar
    And I clicks on any category link under Men category, for example: Jeans
    And I verifies that the user is navigated to that category page