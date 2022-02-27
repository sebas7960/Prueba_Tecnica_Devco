Feature:subscribe system
  As a user
  I want a system to subscribe my email
  So that i can get notifications for specials deals

  @UserStory-Manual=00007
  Scenario:
    Given the user put the email and password
    And go to email for verification email
    When subscribe with a verify email
    Then must visualize new messages on the email with special deals