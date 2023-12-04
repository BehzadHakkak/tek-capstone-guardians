@Mohammad
Feature: Retail Account Page

Background:
    Given User is on Retail website
    When User click on Sign in option
    And User enter email 'mohammadKhanJan@gmail.com' and password 'Abc@1234'
    And User click on login button
    Then User should be logged in into Account
    
 @krim
Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'SalkimahGul' and Phone '4819543221'
    And User click on Update button
    Then user profile information should be updated
    
 @acnt
Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
    |cardNumber|nameOnCard|expirationMonth|expirationYear|securityCode|
    |1235867292876543|SaliamanGul|12|2024|132|
    And User click on Add your card button
    Then a message should be displayed "Payment Method added sucessfully"
    

Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on the card for Editing
    And User click on Edit option of card section
    And user edit information with below data
    |cardNumber|nameOnCard|expirationMonth|expirationYear|securityCode|
    |3281510437745424    | borarsulaiman    |12          |2025         |786      |
    And user click on Update Your Card button
    Then a payment update message should be displayed"Payment Method updated Successfully"
    
@acount
Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
     And User click on the card for removing
    And User click on remove option of card section
    Then payment details should be removed

   @acnt
Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And user fill new address form with below information
    |country|fullName|phoneNumber|streetAddress|apt       |city     | state |zipCode   |
     |countryValue|fullnameValue|PhoneValue|stAddress|aptValue|cityValue|stateValue|zipCodeValue|
    And User click Add Your Address button
    Then an add message should be displayed "Address Added Successfully"

#edit Address

Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And user fill new address form with below information
    |country|fullName|phoneNumber|streetAddress|apt       |city     | state |zipCode   |
    |countryValue|fullnameValue|PhoneValue|stAddress|aptValue|cityValue|stateValue|zipCodeValue|
    And User click update Your Address button
    Then an update message should be displayed "Address Updated Successfully"

#address removed

Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed
