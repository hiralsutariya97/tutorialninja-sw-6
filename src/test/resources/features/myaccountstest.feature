@regression
Feature: My account test
  In Order to test My account step by step
  As a User
  I should verify different scenarios for account creation

  Background: User is on home page
    Given I am on homepage

  @sanity @smoke
  Scenario: User should navigate to register page successfully
    When I click on my account link
    And I call the method select my account option and pass parameter "Register"
    And I should navigate to register page
    Then I get a register text "Register Account"

  @sanity
  Scenario: User should navigate to login page successfully
    When I click on my account link
    And I call the method select my account option and pass parameter "Login"
    Then I get a login page text "Returning Customer"

  Scenario: User should Register account successfully
    When I click on my account link
    And I call the method select my account option and pass parameter "Register"
    And I enter first name
    And I enter last name
    And I enter email
    And I enter telephone
    And I enter password
    And I enter confirm password
    And I select yes radio button for subscription
    And I click on privacy policy check box
    And I click on continue
    And I  get account creation message "Your Account Has Been Created!"
    And I click on click after account creation message
    And I click on my account link
    And I call the method select my account option and pass parameter "Logout"
    Then I get a logout text "Logout"
    Then I click on continue logOut button

    Scenario: User should navigate to login and logout successfully
      When I click on my account link
      And I call the method select my account option and pass parameter "Login"
      And I enter email address
      And I enter password to login
      And I click on login button
      And I navigate to my account
      And I get a account text "My Account"
      And I click on my account link
      And I call the method select my account option and pass parameter "Logout"
      Then I get a logout text "Logout"
      Then I click on continue logOut button
