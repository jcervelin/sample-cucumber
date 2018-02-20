Feature: the user can be retrieved
  Scenario: client makes call to GET /users with id 1
    When the client calls /users/1
    Then the client receives user with the name John