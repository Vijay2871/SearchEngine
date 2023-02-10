Feature: Search Engine check for keywords

  @Smoke
  Scenario Outline: User must have to see the keyword search result

    Given I launched the browser
    When I search the "<keywords>"
    Then I get the wikipedia results for the "<keywords>"
    Examples:
      | keywords         |
     |SoftwareTesting|
      |NZ FLAG|
