Feature:Search attractions system
  As a user
  I want a system to search attractions
  So that i can find places to go to on my journey

  @UserStory-Manual=00004
  Scenario Outline:
    When the user put a city
      |  city  |  date  |  time  |  tickets  |
      | <city> | <date> | <time> | <tickets> |
    Then must visualize attraction results for that city

    Examples:
      | city     |  date        |  time     |  tickets  |
      | New York |  02/05/2022  |  02:00PM  |  2        |