
Feature: Search with Google

Scenario: Search Google for kittens

Given I can open Google
When I search for kittens
Then kittens should be returned
