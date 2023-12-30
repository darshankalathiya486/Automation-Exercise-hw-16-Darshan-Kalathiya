@regression
Feature: User Login and Logout

  @author_Darshan_Kalathiya @sanity @smoke
  Scenario: Log in and log out
    Given I am in Homepage
    When I clicks on the Signup and Login button
    And I verifies that Login to your account is visible
    And I enters the correct emailAddress "sumit123@gmail.com" and password "123456"
    And I clicks the Login button
    Then I verifies that Logged in as username "Meet" is visible
    And I clicks the Logout button
    And I verifies that the user is navigated to the login page
