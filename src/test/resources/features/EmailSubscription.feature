@regression
Feature: Email Subscription

  @author_Darshan_Kalathiya @sanity @smoke
  Scenario: Subscribe to email updates
    Given I am in Homepage
    When I scrolls down to the footer
    And I verifies the presence of the text SUBSCRIPTION
    And I enters an emailAddress "rahul56@gmail.com" in the input
    And I click on arrow button
    Then I verifies that the success message You have been successfully subscribed! is visible
