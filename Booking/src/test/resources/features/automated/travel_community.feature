Feature:Search post on communities system
  As a user
  I want a system to search post about a place
  So that i can know what to do on my journey

  @UserStory=00004
  Scenario Outline:
    When the user search post opinions for a country
      |  country  |  search  |
      | <country> | <search> |
    Then must visualize post results

    Examples:
      | country   | search             |
      | Argentina | Valor del Alquiler |