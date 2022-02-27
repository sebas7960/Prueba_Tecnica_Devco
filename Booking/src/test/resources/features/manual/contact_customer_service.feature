Feature:Search contact customer service system
  As a user
  I want a system to put my problem with booking services
  So that i can get booking solutions for my problem

  @UserStory-Manual=00005
  Scenario Outline:
    When the user put the ticket problem
      |  confirmationNumber  |  pin  |
      | <confirmationNumber> | <pin> |
    Then must visualize a number of record

    Examples:
      |  confirmationNumber  | pin  |
      |  1233456789          | 2134 |