Feature: Search function
  Scenario: Validate search behaviour by product type
    Given I am on tesco home page
    When I enter "Chocolate" as a product type in serch box
    And I click on search button
    Then I should be able to see all the results for "Chocolate"