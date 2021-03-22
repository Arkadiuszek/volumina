@PublioLoginScenario
Feature: feature to test page functionality

  @PublioLoginTest
  Scenario: add book to cart as logged user

    Given user is on login page
    When user logs in
    And user search for some books
    And user adds books in cart
    Then user goes to cart