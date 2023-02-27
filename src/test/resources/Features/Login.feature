Feature: Test the Indexpage  functionality

 @sai
  Scenario: Verify user is able to Navigated to Loginpage
    Given User open the browser
    And User should be on Indexpage
    When User should click on login button
    Then user should be on Loginpage
