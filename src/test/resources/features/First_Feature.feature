Feature: Internet Heroku Application

  Background:
    Given User launches Internet Heroku App
    Then User verifies heading as "Welcome to the-internet"
    And User verifies sub-heading as "Available Examples"

  Scenario: Form Authentication - Successful
    When User clicks on "Form Authentication" link
    Then User verifies heading as "Login Page"
    When User enters valid username and password
    And User clicks on "Login" button
    Then User verifies alert message as "You logged into a secure area!"
    And User verifies heading as "Secure Area"

  Scenario: Form Authentication - Successful
    When User clicks on "Form Authentication" link
    Then User verifies heading as "Login Page"
    When User enters invalid username and password
    And User clicks on "Login" button
    Then User verifies alert message as "Your username is invalid"



