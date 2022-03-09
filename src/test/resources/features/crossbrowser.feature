@plant_calculator_cross
Feature: Calculator test
  @calculator_chrome
  Scenario Outline: Calculator positive test

    Given user is on the application_url with chrome
    Given user clicks click me button and then clicks now click me button
    Then user verifies that tree plant calculator page is opened
    And user enters the number of seeds planted "<number>"
    And user enters name "<name>"
    And user enters the time of plant hour "<hour>" and minute "<minute>"
    And user selects tree type "<type>"
    And user clicks submit button
    Then user verifies that the result is visible and correct
    And user quits remote driver

    Examples:
      |number|name|hour|minute|type|
      |10     |Can |13  |10    |1   |


  @calculator_firefox
  Scenario Outline: Calculator positive test

    Given user is on the application_url with firefox
    Given user clicks click me button and then clicks now click me button
    Then user verifies that tree plant calculator page is opened
    And user enters the number of seeds planted "<number>"
    And user enters name "<name>"
    And user enters the time of plant hour "<hour>" and minute "<minute>"
    And user selects tree type "<type>"
    And user clicks submit button
    Then user verifies that the result is visible and correct
    And user quits remote driver

    Examples:
      |number|name|hour|minute|type|
      |10     |Can |13  |10    |1   |