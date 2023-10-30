Feature: As a user i have be able to login so that i can see home screen
@login
  Scenario: As a user i can login with valid credential
  Given user on dashboard for login
  When user click logout for login
  And user on login page for login
  And user click email field
  And user input valid email
  And user click password field
  And user input invalid password
  And user click login button
  Then user can see hompegae and list products