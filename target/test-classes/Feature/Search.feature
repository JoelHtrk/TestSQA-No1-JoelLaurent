Feature: Search item pada tokopedia item
  Scenario: Validate tokopedia searching is working
    Given User open browser
    And User on tokopedia homepage
    When User search handphone on search box
    Then User navigated to handphone result page
