Feature: Name Generator

  Scenario: Generate First and Middle Name
    Given I am on the name generator
    When I generate name
    Then I get 2 names

  Scenario: Generate Witch Name
    Given I am on the name generator
    And I select a category of witch
    When I generate name
    Then I get 2 names

  @Debug
  Scenario: Generate Random First Name with Set Last Name
    Given I am on the name generator
    And I input Brown as the surname
    When I generate name
    Then I get a surname of Brown

  Scenario: Generate Random First Name and Random Last Name
    Given I am on the name generator
    And I select random surname
    When I generate name
    Then I get 3 names

  Scenario: Generate Random Name with Life Story
    Given I am on the name generator
    And I select generate life story
    When I generate name
    Then I get life story details