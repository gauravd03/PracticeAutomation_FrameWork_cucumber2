#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Verify Register functionality
  

  @tag1
  Scenario: Register with creadential
    Given user should be on "https://practice.automationtesting.in/" web page
    When  user click on MyAccount tab
    And   user enter register email "gaurav@gmail.com"
    And 	user enter password  "Gaurav@123"
    And   user click on register
    Then  user should successfully get registered
    
