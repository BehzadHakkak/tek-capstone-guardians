@Regression
Feature: Sign in Feature
​
Scenario: Verify user can sign in into Retail Application
    Given User is on Retail website
    When User click on Sign in option
    And User enter email 'mohammadKhanJan@gmail.com' and password 'Abc@1234'
    And User click on login button
    Then User should be logged in into Account
    
    
Scenario: Verify user can create an account into Retail Website
    Given User is on retail website
    When User click on Sign in option
    And User click on Create New Account button
    And User fill the signUp information with below data
    | name | email | password | confirmPassword |
    | student| mohammadDDDpppDD@tekschool.us | Asdfg123456@ | Asdfg123456@ |
    And User click on SignUp button
    Then User should be logged into account page