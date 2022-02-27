Feature:Search airport taxis system
  As a user
  I want a system to search airport taxis
  So that i can find taxi for my stay on my journey

  @UserStory-Manual=00005
  Scenario Outline:
    When the user put the travel information
      |  typeService  |  pickUpLocation  |  Destination  |  checkInDate  |  checkInTime  |  numberPassengers  |
      | <typeService> | <pickUpLocation> | <Destination> | <checkInDate> | <checkInTime> | <numberPassengers> |
    Then must visualize the taxi results

    Examples:
      |  typeService  | pickUpLocation        | Destination                 | checkInDate | checkInTime  | numberPassengers  |
      |  One-way      | Olaya Herrera Airport | Hotel Dann Carlton Medellín | 05/04/2022  | 14:00        |         2         |