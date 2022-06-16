@all
Feature: TC01

  Scenario: Register User
    Given Navigate to url
    Then Verify that home page is visible successfully
    Then Click on Signup Login button
    Then Verify New User Signup is visible
    Then Fill details: Title, Name, Email, Password, Date of birth
    Then Select checkbox Sign up for our newsletter
    And  Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    And Click Create Account button
    And Verify that ACCOUNT CREATED is visible
    And Click Continue button
    And  Verify that Logged in as username is visible
    And Click Delete Account button


