@regression
Feature: Complete Purchase Flow with Account Creation

  @author_Darshan_Kalathiya @sanity @smoke
  Scenario: Complete the purchase flow with account creation
    Given I am in Homepage
    When I clicks on the Signup and Login button
    And I enters the name "Dhrumit"
    And I enters email "Dhrumit12345@gmail.com"
    And I clicks the Signup button
    And I verifies that ENTER ACCOUNT INFORMATION is visible
    And I click On title "Mr."
    And I enter Password "123456"
    And I enter day "23"
    And I enter month "April"
    And I enter year "2016"
    And I selects the checkbox Sign up for our newsletter!
    And I selects the checkbox Receive special offers from our partners!
    And I fills My personal details firstname "Dhrumit", lastname "Patel", company "B And B Bearing", address "33, Harrow", addressTwo "Harrow Road", country "India", state "Gujarat", city "Surat", zipcode "50001", mobileNumber "6645295673"
    And I clicks the Create Account button
    And I verifies that ACCOUNT CREATED! is visible
    And I clicks the Continue button
    And I verifies that Logged in as username "Dhrumit" is visible
    And I clicks on the Products button
    And I verifies that they are navigated to the ALL PRODUCTS page successfully
    And I hovers over the first product
    And I click on Add to cart link
    And I clicks Continue Shopping button
    And I clicks on the Cart button
    And I is on the Cart page
    And I clicks Proceed To Checkout
    Then I verifies add details "Address Details" and order "Review Your Order"
    And I enters a description "Good" in the comment text area
    And I click On Place Order
    And I enters payment details nameOnCard "Dhrumit Patel", cardNumber "5555 5555 5555 4444", cvc "567", expireMonth "06", expireYear "2028"
    And I clicks Pay and Confirm Order button
    And I verifies the success message "Congratulations! Your order has been confirmed!"
    And I clicks the Delete Account button
    And I verifies that ACCOUNT DELETED! is visible
    And I clicks the  delete account Continue button