@regression
Feature: Verify Scroll Functionality

  @author_Darshan_Kalathiya @sanity @smoke
  Scenario: Verify Scroll Functionality on the Website
    Given I am in Homepage
    When I scrolls down to the footer
    Then I verifies the presence of the text SUBSCRIPTION
    And I click on arrow up button at bottom right corner
    And I should see the message "Full-Fledged practice website for Automation Engineers"