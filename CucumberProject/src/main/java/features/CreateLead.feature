Feature: CreateLead functionality of Leaftaps application

Background:
  And Enter the username as 'Demosalesmanager'
  And Enter the password as 'crmsfa'
  When Click on Login button
  Then It should be logged in

Scenario Outline: CreateLead with multiple data
  When Click on the CRMSFA link
  And Click on the Leads Link
  And Click on the CreateLead link
  Given Enter the companyname as "<company>"
  And Enter the firstname as "<firstName>"
  And Enter the lastname as "<lastName>"
  When Click on the CreateLead button
  Then Lead should be created

Examples:
  | company   | firstName | lastName |
  | TestLeaf  | Chitra    | S        |