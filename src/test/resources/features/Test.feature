@Web
Feature: Test capabilities

  @critical
  Scenario: Google open
    Given I open the browser
    When I navigate to "https://www.google.com"
    Then I see the search bar

  @critical
  Scenario: Google GE
    Given I open the browser
    When I navigate to "https://www.ge.com"
    Then I see the search bar

    @trivial
    Scenario: Failing test
      Given I open the browser
      When I navigate to "https://www.google.com"
      Then I see my Facebook friends

  @trivial @skipped
  Scenario: Skipped test
    Given I open the browser