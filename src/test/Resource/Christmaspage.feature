Feature: Christmas Product range

  Background:

    Given User is on the Homepage
    When User types Biscuit in searchbox and clicks magnifyingglass
    Then User should be able to get all the biscuit products
    Given User is on the result page
    When User clicks on christmas button
    Then User should be able to see all the christmas products

    Scenario: Click on one of the christmas biscuit

      Given User is on the webpage where user can see all the christmas products
      When User clicks on add to basket button for mince pies
      Then User should be able to add the product into the basket
