Feature:Search stays system
  As a user
  I want a system to search a stay place
  So that i can choose a place to stay on my journey

  @UserStory=00001
  Scenario Outline:
    When the user put stay option
      |  place  |  checkInDay  |  checkInMonthYear  |  checkOutDay  |  checkOutMonthYear  |  adults  |  children  |  rooms  |  ageChildren  |
      | <place> | <checkInDay> | <checkInMonthYear> | <checkOutDay> | <checkOutMonthYear> | <adults> | <children> | <rooms> | <ageChildren> |
    Then must visualize stays list result

    Examples:
      | place                                      | checkInDay | checkInMonthYear | checkOutDay | checkOutMonthYear | adults | children | rooms | ageChildren |
      | Cartagena de Indias, Colombia              | 26         | March 2022       | 28          | March 2022        |   2    |    3     |   1   |   8,14,16   |
      | Nueva York, New York State, Estados Unidos | 10         | May 2022         | 20          | May 2022          |   1    |    0     |   1   |             |