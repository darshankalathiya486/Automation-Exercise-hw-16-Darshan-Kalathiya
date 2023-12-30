@regression
Feature: User Signup with Already Registered Email

  @author_Darshan_Kalathiya @sanity @smoke
  Scenario: Attempt to sign up with an already registered email
    Given I am in Homepage
    When I clicks on the Signup and Login button
    And I verifies that New User Signup! is visible
    And I enters the name "Meet"
    And I enters email "sumit123@gmail.com"
    And I clicks the Signup button
    Then I verifies that the error Email Address already exists! is visible