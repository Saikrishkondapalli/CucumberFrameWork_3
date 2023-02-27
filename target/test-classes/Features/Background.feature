Feature: User is on Homepage

  Background: 
    Given open the loginpage
    And Enter the credenrtails
    Then open the home

  @sai
  Scenario: verify the all the basic functionalities
    Given verify the Newarrivals
    And verify the MyAccount

  @sai
  Scenario: verify the napbar
    Given verify BooksRequest functionality
    And close the browser
