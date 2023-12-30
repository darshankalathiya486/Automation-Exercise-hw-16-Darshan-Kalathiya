@regression
Feature: User Registration and Account Management

  @author_Darshan_Kalathiya @sanity @smoke
  Scenario: Register a new user, log in, and delete the account
    Given I am in Homepage
    When I clicks on the Signup and Login button
    And I verifies that New User Signup! is visible
    And I enters the name "Meet"
    And I enters email "Meet12345@gmail.com"
    And I clicks the Signup button
    And I verifies that ENTER ACCOUNT INFORMATION is visible
    And I click On title "Mr."
    And I enter Password "123456"
    And I enter day "23"
    And I enter month "April"
    And I enter year "2016"
    And I selects the checkbox Sign up for our newsletter!
    And I selects the checkbox Receive special offers from our partners!
    And I fills My personal details firstname "Meet", lastname "Patel", company "B And B Bearing", address "33, Harrow", addressTwo "Harrow Road", country "India", state "Gujarat", city "Surat", zipcode "50001", mobileNumber "6645295673"
    And I clicks the Create Account button
    Then I verifies that ACCOUNT CREATED! is visible
    And I clicks the Continue button
    And I verifies that Logged in as username "Meet" is visible
    And I clicks the Delete Account button
    And I verifies that ACCOUNT DELETED! is visible
    And I clicks the  delete account Continue button