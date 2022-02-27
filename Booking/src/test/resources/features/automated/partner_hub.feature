Feature:Search partner help system
  As a user
  I want a system to search about partner doubt
  So that i can know what to do on a specify situation

  @UserStory=00005
  Scenario Outline:
    When the user put the doubt
      |  searchDoubt  |  descriptionPost  |
      | <searchDoubt> | <descriptionPost> |
    Then must visualize the partner result

    Examples:
      | searchDoubt                        | descriptionPost                                                                                                                          |
      | How can I set up a damage deposit? | A damage deposit is a set amount that a guest pays either before or on arrival, which is refunded if there is no damage to the property. |