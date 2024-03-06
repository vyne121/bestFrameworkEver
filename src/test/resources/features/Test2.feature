@Web
Feature: Test capabilities2

  @critical
  Scenario: Google open2
    Given I open the browser
    When I navigate to "https://www.google.com"
    Then I see the search bar

  @trivial
  Scenario: Failing test2
    Given I open the browser
    When I navigate to "https://www.google.com"
    Then I see my Facebook friends

  @trivial @skipped
  Scenario: Skipped test2
    Given I open the browser

  @trivial
  Scenario: Throw exception intentionally2
    Given I throw an exception