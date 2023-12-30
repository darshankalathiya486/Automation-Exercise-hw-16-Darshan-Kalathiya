@regression
Feature: User Login with Incorrect Credentials

  @author_Darshan_Kalathiya @sanity @smoke
  Scenario: Log in with incorrect credentials
    Given I am in Homepage
    When I clicks on the Signup and Login button
    And I verifies that Login to your account is visible
    And I enters the correct emailAddress "sumit1234@gmail.com" and password "123456"
    And I clicks the Login button
    Then I verifies that the error Your email or password is incorrect! is visible