Feature: Availability

  @Ping
  Scenario: Checking if the service is alive
    Given I perform a GET to "/ping" end point
    Then the response at the json path "ping" includes "LS Search Service Alive!"