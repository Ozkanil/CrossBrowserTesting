@plant_calculator
Feature: Calculator test
  @calculator_positive
  Scenario Outline: Calculator positive test

    Given user clicks click me button and then clicks now click me button
    Then user verifies that tree plant calculator page is opened
    And user enters the number of seeds planted "<number>"
    And user enters name "<name>"
    And user enters the time of plant hour "<hour>" and minute "<minute>"
    And user selects tree type "<type>"
    And user clicks submit button
    Then user verifies that the result is visible and correct

    Examples:
      |number|name|hour|minute|type|
      |10     |Can |13  |10    |1   |


  @calculator_alternative
  Scenario Outline: Calculator alternative test

    Given user clicks click me button and then clicks now click me button
    Then user verifies that tree plant calculator page is opened
    And user enters the number of seeds planted "<number>"
    And user enters name "<name>"
    And user enters the time of plant hour "<hour>" and minute "<minute>"
    And user selects tree type "<type>"
    And user clicks alternative calculator button
    And user clicks submit button
    Then user verifies that the alternative calculation result is visible and correct

    Examples:
      |number|name|hour|minute|type|
      |10    |Can |15  |45    |1   |

  @calculator_negative
  Scenario: Calculator negative test

    Given user clicks click me button and then clicks now click me button
    Then user verifies that tree plant calculator page is opened
    And user clicks submit button
    Then user verifies that error messages are visible


