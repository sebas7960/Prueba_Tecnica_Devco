Feature:Search flights system
  As a user
  I want a system to search a flight
  So that i can choose a play to go on my journey

  @UserStory=00002
  Scenario Outline:
    When the user put flight option
      |  flightType  |  personNumber  |  flightMode  |  from  |  to  |  checkInDay  |  checkInMonthYear  |  checkOutDay  |  checkOutMonthYear  |
      | <flightType> | <personNumber> | <flightMode> | <from> | <to> | <checkInDay> | <checkInMonthYear> | <checkOutDay> | <checkOutMonthYear> |
    Then must visualize flight list result

    Examples:
      | flightType | personNumber  | flightMode | from                            | to                            | checkInDay | checkInMonthYear | checkOutDay | checkOutMonthYear |
      | Round-trip | 2,3           | First      | New York, United States (NYC)   | London, Ontario, Canada (YXU) | 26         | May 2022         | 28          | May 2022          |