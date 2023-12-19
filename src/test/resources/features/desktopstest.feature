@regression
Feature: Desktop page test cases
  In order to test Desktop step by step
  As a User
  I should verify different scenarios in desktop page

  Background: User is on homepage
    Given I am on homepage

  @author_heeraj @smoke @sanity
  Scenario: User should verify product arrange in alphabetical order
    When I click on Desktops tab
    And I call selectMenu and pass all desktop "Show AllDesktops"
    And I click on sort by position Z to A "Name (Z - A)"
    Then I can see the product will be arrange in descending order


  Scenario Outline: User should verify that product added to shopping cart successFully
    When I click on currency dropdown
    And I click on £pound Sterling
    And I click on Desktops tab
    And I call selectMenu and pass all desktop "Show AllDesktops"
    And I click on sort by position A to Z "Name (A - Z)"
    And I select the product "<product>"
    And I get the text product "<product>"
    And I enter qty oe using select class
    And I click on add to crt button
    And I get the message Success: You have added "<product>" to your shopping cart!
    And I click on shopping cart display into the success message
#    Then I get a text "Shopping Cart"
    Then I get the product name "<product>"
    Then I get the model name "<model>"
    Then I get the price "<price>"

    Examples:
      | product      | model      | price   |
      | HTC          | Product 1  | £74.73  |
      | iPhone       | product 11 | £75.46  |
      | iPod Classic | product 20 | £74.73  |
      | MacBook      | Product 16 | £368.73 |
      | MacBook Air  | Product 17 | £736.23 |
      | Sony VAIO    | Product 19 | £736.23 |

