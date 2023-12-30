@regression
Feature: Subscribe to Newsletter

  @author_Darshan_Kalathiya @sanity @smoke
  Scenario: Subscribe to the newsletter
    Given I am in Homepage
    When I clicks on the Cart button
    And I is on the Cart page
    And I scrolls down to the footer
    Then I verifies the presence of the text SUBSCRIPTION
    And I enters an emailAddress "rahul56@gmail.com" in the input
    And I click on arrow button
    And I verifies that the success message You have been successfully subscribed! is visible