Feature: As a user i have be able to resgister so that i can see home screen
@Register
  Scenario: As a user i can register and i can see home screen
    Given user on dashboard
    When user click logout
    And user click link regist
    And user input name
    And user input email
    And user input password
    And user click resgister button
    Then user direct to home page