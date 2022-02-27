Feature:Search car rental system
  As a user
  I want a system to search a car available
  So that i can choose a car to rental to use on my journey

  @UserStory=00003
  Scenario Outline:
    When the user put car description
      |  pickUpLocation  |  checkInDay  |  checkInMonthYear  |  checkOutDay  |  checkOutMonthYear  |  carSize  |
      | <pickUpLocation> | <checkInDay> | <checkInMonthYear> | <checkOutDay> | <checkOutMonthYear> | <carSize> |
    Then must visualize cars list result

    Examples:
      | pickUpLocation                | checkInDay | checkInMonthYear | checkOutDay | checkOutMonthYear | carSize |
      | Medellín, Antioquia, Colombia | 26         | May 2022         | 28          | May 2022          | Medium  |