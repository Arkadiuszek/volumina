@PublioLoginScenario
Feature: feature to test login functionality

  @PublioLoginTest
  Scenario: Check login is successful with valid credentials

    Given user is on login page
    When user enters valid email and password
    And click on login button
    Then user is logged in and home page appears