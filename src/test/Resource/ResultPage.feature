Feature: Result Page

  Background:
    Given User is on the Homepage
    When User types Biscuit in searchbox and clicks magnifyingglass
    Then User should be able to get all the biscuit products

    @smoke
    Scenario: Christmas Button
      Given User is on the result page
      When User clicks on christmas button
      Then User should be able to see all the christmas products
