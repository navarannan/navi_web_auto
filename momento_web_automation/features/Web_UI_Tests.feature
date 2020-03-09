Feature: Web UI tests for Cotton On E-Commerce site

  As a guest user to Cotton On Website
  I can search a product and add the product to cart
  And successfully place a click and collect order

  Background:
    Given I navigate to home page of Cotton On Website

  Scenario: User is able to search a product and purchase a product
    And I search for "Jeans" on the home page search box
    And I add any Jeans to the cart
    And I place a click and collect order as user "Navi"
#    Then I see the Order Confirmation Page with order number


