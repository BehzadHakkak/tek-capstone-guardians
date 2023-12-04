Feature: login Test
​
  @smoke
  Scenario: Login test scenarios
    Given login as tek user to retail app with username "mohammadKhanJan@gmail.com" and password "Abc@1234"
    Then assert application title "React App"