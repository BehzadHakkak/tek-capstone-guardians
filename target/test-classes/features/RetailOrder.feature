@asd
Feature: Retail Order Page

Background:
    Given User is on Retail website
    When User click on Sign in option
    And User enter email 'mohammadKhanJan@gmail.com' and password 'Abc@1234'
    And User click on login button
    Then User should be logged in into Account
    
@asd
Scenario: Verify User can add an item to cart
    When User changes the category to "Smart Home"
    And User searches for an item "kasa outdoor smart plug"
    And User clicks on Search icon
    And User clicks on item
    And User selects quantity "2"
    And User clicks add to Cart button
    Then the cart icon quantity should change to "2"

Scenario: Verify User can place an order with Shipping address and payment Method on file
    When User changes the category for second to 'Electronics'
    And User searches for an item for second 'Apex Legends'
    And User clicks on Search icon
    And User clicks on item for second
    And User selects quantity for second "5"
    And User clicks add to Cart button for second
    Then the cart icon quantity should change to "7" for second
    And User clicks on Cart option
    And User clicks on Proceed to Checkout button
    And User clicks on Place Your Order
    Then a message should be displayed for order "Order Placed Successfully"

# Note: For the below scenarios, you need to first have orders in place. At least one order must be present

Scenario: Verify User can cancel the order
    When User clicks on Orders section for cancelation
    And User clicks on first order in list for cancelation
    And User clicks on Cancel The Order button for cancelation
    And User selects the cancelation Reason "Bought wrong item"
    And User clicks on Cancel Order button
    Then a cancellation message should be displayed "Your Order Has Been Cancelled"

Scenario: Verify User can Return the order
    When User clicks on Orders section for Return
    And User clicks on first order in list for Return
    And User clicks on Return Items button for Return
    And Slect The Item if not Slected
    And User selects the Return Reason "Item damaged"
    And User selects the drop-off service "FedEx"
    And User clicks on Return Order button
    Then a Return message should be displayed "Return was successfull"

Scenario: Verify User can write a review on order placed
    When User clicks on Orders section for review
    And User clicks on first order in list for review
    And User clicks on Review button for review
    And User writes Review headline "headline value" and "review text"
    And User clicks Add your Review button
    Then a review message should be displayed "Your review was added successfully"
