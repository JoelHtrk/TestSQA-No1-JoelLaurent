Feature: OpenTokopedia
  Scenario: Success to Open Tokopedia
    Given open web url "https://www.tokopedia.com/"
    Then Should succes login and redirected to homepage
