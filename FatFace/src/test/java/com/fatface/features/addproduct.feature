Feature: Add product functionality

  Scenario: Add product in shopping basket

    Given I am on fatface home page
    When I click on women menu
    And I click on dresses
    And I click on short dresses
    And I add Danica Jersey Wrap Dress in the shopping bag
    And I click on shopping bag
    Then I should be able to see the product in the shopping basket