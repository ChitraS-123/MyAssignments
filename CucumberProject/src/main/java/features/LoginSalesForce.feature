Feature: Salesforce Account Creation

  Scenario: Create a new account in Salesforce
    Given I launch the Salesforce login page
    When I log in with valid credentials
    And I click the toggle menu button
    And I click view All and select Sales from App Launcher
    And I click on the Accounts tab
    And I click on the New button
    And I enter "Chitra" as account name
    And I select Ownership as Public
    Then I click save and verify the Account name