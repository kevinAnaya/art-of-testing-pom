Feature: complete the form
  as user enter the page and complete the form

  Scenario: complete form
    Given the user enter the home page
    When the user enther the txtbox
    And the user click in the button
    And the user double click in the second button
    And the user select radio button
    And the user select checkbox
    And the user select dropdown
    And the user generate alert
    And the user generate confirm alert
    Then the user finish process
