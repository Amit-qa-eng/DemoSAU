Feature: Agency Page Navigation Functionality

  Background: Successful login and navigation to the home page
    Given I am on the login page of ShoutAboutUS
    When I enter the username  and password
    And I accept the terms and conditions
    And I click on the login button
    Then I should be navigated to the home page of SuperAdmin
    And I select the ResponseScribe option from the dropdown menu
    Then I should be navigated to the Welcome page Dashboard of Agency ResponseScribe

  Scenario: Manage Account Link
    When I click on the manage account link
    Then I should be navigated to the Account Management page

  Scenario: Manage Location Link
    When I click on the Manage Location link
    Then I should be navigated to the Location Management page

  Scenario: Manage Users Link
    When I click on the Manage Users link
    Then I should be navigated to the User Management page

  Scenario: Manage Account2 Link
    When I click on the Manage Account2 link
    Then I should be navigated to the Account Management page again

  Scenario: Add New Account Link
    When I click on click here of addNewAccount link
    Then I should be navigated to the Create ResponseScribe Account page

  Scenario: Add an Agency Link
    When I click on click here of addAgency link
    Then I should be navigated to the Create Agency Account page
