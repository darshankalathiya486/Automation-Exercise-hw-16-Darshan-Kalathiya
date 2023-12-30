@regression
Feature: Navigation to Test Cases Page

  @author_Darshan_Kalathiya @sanity @smoke
  Scenario: Navigate to Test Cases Page
    Given I am in Homepage
    When I clicks on the Test Cases button
    Then I verifies that they are navigated to the test cases page successfully
