@PublioLoginScenario
Feature: feature to test login functionality

  @PublioLoginTest
  Scenario: Check login is successful with valid credentials

    Given user is on login page
    When user logs in
    And user search for some books
    And user adds books in cart
    Then user goes to cart