@regression
Feature: Complete Purchase Flow with Existing Account

  @author_Darshan_Kalathiya @sanity @smoke
  Scenario: Complete the purchase flow with existing account
    Given I am in Homepage
    When I clicks on the Signup and Login button
    And I verifies that Login to your account is visible
    And I enters the correct emailAddress "kartik987@gmail.com" and password "123456"
    And I clicks the Login button
    Then I verifies that Logged in as username "kartik" is visible
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
    And I enters payment details nameOnCard "Kartik Patel", cardNumber "5555 5555 5555 4444", cvc "567", expireMonth "06", expireYear "2028"
    And I clicks Pay and Confirm Order button
    And I verifies the success message "Congratulations! Your order has been confirmed!"
    And I clicks the Delete Account button
    And I verifies that ACCOUNT DELETED! is visible
    And I clicks the  delete account Continue button