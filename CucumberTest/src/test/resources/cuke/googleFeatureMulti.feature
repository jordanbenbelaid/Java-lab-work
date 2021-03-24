
Feature: Search with Google


Scenario Outline: Title of your scenario outline
    Given I can open Google
    When I search for <animal>
    Then <animal> should be returned

Examples: 
      | animal  |
      | kittens |
      | puppies |
