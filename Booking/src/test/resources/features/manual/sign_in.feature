Feature:Authentication system
  As a user
  I want a authenticated on the system
  So that i can sign in in the system

  @UserStory-Manual=00002
  Scenario:Authenticated with outlook on the system
    When the user authenticated with outlook credentials
    Then must visualize the home page

  @UserStory-Manual=00003
  Scenario:Authenticated with gmail on the system
    When the user authenticated with gmail credentials
    Then must visualize the home page