@regression
Feature: Verify ScrollUp Functionality

  @author_Darshan_Kalathiya @sanity @smoke
  Scenario: Verify ScrollUp Functionality on the Website
    Given I am in Homepage
    When I scrolls down to the footer
    Then I verifies the presence of the text SUBSCRIPTION
    And I scroll up
    And I should see the message "Full-Fledged practice website for Automation Engineers"