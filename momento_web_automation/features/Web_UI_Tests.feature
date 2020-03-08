Feature: Web UI tests for Cotton On E-Commerce site

  Background:
    Given I navigate to home page of Cotton On Website

  Scenario: User is able to enter search keyword on homepage and purchase a product
    And I search for "Jeans" on the home page search box
    And I add any Jeans to the cart
    And I place a click and collect order as user "Navi"
#    Then I see the Thankyou page with order number


