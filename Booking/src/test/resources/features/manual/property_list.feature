Feature:property list system
  As a user
  I want a system to create my listing
  So that i can i can get all security and help from the page

  @UserStory-Manual=00006
  Scenario Outline:
    Given the user sign in
    When list the information journey
      |  stay  |  bed  |  breakfast  |
      | <stay> | <bed> | <breakfast> |
    Then must visualize the information register

    Examples:
      |  stay  | bed | breakfast |
      |  hotel | bed | breakfast |