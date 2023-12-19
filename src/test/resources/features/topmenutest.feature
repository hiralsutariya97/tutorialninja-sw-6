@regression
Feature: Top menu test Feature
  In Order to test top menu of home page
  As a User
  I have to click and verify all option of top menu

  Background: User is on home page
    Given I am on homepage

    @sanity @smoke
      Scenario: User should navigate to Desktops page successfully
      When I click on Desktops tab
      And I call selectMenu and pass all desktop "Show AllDesktops"
      And I should navigate to desktop page
      Then I should get desktop text ike "Desktops"

      @sanity
      Scenario: User should navigate to Laptops and Notebooks page successfully
        When I click on Laptop and Notebooks tab
        And I call selectMenu and pass all laptop and notebook "Show AllLaptops & Notebooks"
        And I should navigate to laptop and notebook page
        Then I should get laptop and notebook text like "Laptops & Notebooks"

        Scenario: User should navigate to Components page successfully
          When I click on Components tab
          And I call selectMenu and pass all components "Show AllComponents"
          And I should navigate to Components page
          Then I should get components like "Components"
