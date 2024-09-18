Feature: Agency Resources page Navigation Functionality

  Background: Successful login and navigation to the home page
    Given I am on the login page of ShoutAboutUS
    When I enter the username  and password
    And I accept the terms and conditions
    And I click on the login button
    Then I should be navigated to the home page of SuperAdmin
    And I select the ResponseScribe option from the dropdown menu
    Then I should be navigated to the Welcome page Dashboard of Agency ResponseScribe

  Scenario: Agency Resources link
    When I click on  Agency Resources button
    Then I  should be naviagted to Tools & Resources  page
