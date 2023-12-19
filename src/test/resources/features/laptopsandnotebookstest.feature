@regression
Feature: Laptop and Notebook test
  In Order to test Laptop and Notebook test step by step
  As a User
  I should verify different scenarios for Laptop and Notebook page

  Background: User is on homepage
    Given I am on homepage

  @sanity @smoke
  Scenario: User should verify products price display high to low successfully
    When I click on Laptop and Notebooks tab
    And I call selectMenu and pass all laptop and notebook "Show AllLaptops & Notebooks"
    And I should navigate to laptop and notebook page
    And I click on sort by price "Price (High > Low)"
    Then I can see the product price will be arrange in high to low order

  @sanity
  Scenario: User should place the order successfully
    When I click on currency dropdown
    And I click on £pound Sterling
    And I click on Laptop and Notebooks tab
    And I call selectMenu and pass all laptop and notebook "Show AllLaptops & Notebooks"
    And I should navigate to laptop and notebook page
    And I click on sort by price "Price (High > Low)"
    And I click on macbook
    And I get a text macbook "MacBook"
    And I click on the add to cart button
    And I get a message for macbook is Success: You have added MacBook to your shopping cart!
    And I click on shopping cart display into the success message for macbook
    And I get a shopping cart text "Shopping Cart  (0.00kg)"
    And I get a macbook product name "MacBook"
    And I change the qty to "2"
    And I click on update tab
    And I get a modify cart message Success: You have modified your shopping cart!
    And I get a price for macbook "£737.45"
    And I click on check out button
    And I get a checkout text is "Checkout"
    And I get new customer text is "New Customer"
    And I click on guest checkout button
    And I click on continue button
    And I fill all mandatory fields
    And I click on continue button for guest
    And I add comment about order in text area
    And I check the terms and conditions
    And I click on continue button for payment method
    Then I get a warning message Warning: Payment method required!


