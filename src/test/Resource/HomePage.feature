Feature: HomePage

  Scenario: SignIn Button
    Given User is on the Homepage
    When User clicks on signin button
    Then User should be able to divert to signin page

    @smoke
  Scenario: SearchBox Functionality

    Given User is on the Homepage
    When User types Biscuit in searchbox and clicks magnifyingglass
    Then User should be able to get all the biscuit products

      @MultipleSearch
      Scenario Outline: Search For Multipleproducts

        Given User is on the Homepage
        When User search for "<products>"
        Then User should be able to see result as per search

        Examples:
          | products |  |
          | crisps   |  |
          | cakes    |  |