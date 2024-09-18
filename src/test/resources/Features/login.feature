Feature: Login Page of ShoutAboutUs page

  Scenario: login is successful with valid credentials
    Given I am  on the login page
    When I have entered the username and password
    And I accept terms and conditions
    And I click on login button
    Then I am navigated to the home page
