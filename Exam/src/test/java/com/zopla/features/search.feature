Feature: Search functionality
  Scenario: Validate search behaviour by search area
    Given I am on the zoopla application home page
    When I click on for sale button
    And I enter "pl46as" as a post code in search box
    And I click on search button
    Then I should be able to see all for sale houses in the area