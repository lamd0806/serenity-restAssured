Feature: Search planets
  As integrator I want to be able to search all planets information using different criteria

Scenario: Each planet has a name
  When I ask for the number 1 planet
  Then I should see that the planet name is Tatooine