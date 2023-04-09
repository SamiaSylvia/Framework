Feature: Feature to test login functionality

  Scenario Outline: Check login is successful with valid ccredentials
  
  
    Given user is on login page
    When user enters <username> and <password>
    And clicks on login button
    Then user is navigated to the home page
Examples: 
|Username| |Password|
|Samia Sylvia| |Samiullah1234!|