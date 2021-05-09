@tag
Feature: Calculator

  Scenario: Calculate
    Given Two input values, 6 and 2, and the operand /
    When I do the calculation
    Then I expect the final result 3

  Scenario Outline: add two numbers
    Given Two input values, <first> and <second>, and the operand <opt>
    When I do the calculation
    Then I expect the final result <result>

    Examples:
      | first | second | opt | result |
      | 6 | 2 | / | 3 |
      | 6 | 2 | ^ | 36 |
      | 12 | 6 | / | 2 |
      | 3 | 4 | ^ | 81 |
      | -6 | 3 | / | -2 |
      | -2 | 3 | ^ | -8 |