Feature:Register authentication system
  As a user
  I want a system to register my client information
  So that i can sign in in the system

  @UserStory-Manual=00001
  Scenario:Register email on the system
    When the user put the email and password
    And go to email for verification email
    Then must get an confirmation email system and can sign in the system
