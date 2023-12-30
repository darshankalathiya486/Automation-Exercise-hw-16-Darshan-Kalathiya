@regression
Feature: Navigate and Verify Brands

  @author_Darshan_Kalathiya @sanity @smoke
  Scenario: Navigate to a brand and verify products
    Given I am in Homepage
    When I clicks on the Products button
    Then I verifies that Brands are visible on the left sidebar
    When I clicks on any brand name
    Then I verifies that the user is navigated to the brand page
    When I clicks on any other brand link on the left sidebar
    Then I verifies that the user is navigated to that brand page
