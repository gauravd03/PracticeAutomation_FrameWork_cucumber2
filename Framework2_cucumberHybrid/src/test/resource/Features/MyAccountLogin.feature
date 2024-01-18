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
Feature: Verify login feature

	Background: 
	Given user should be on "https://practice.automationtesting.in/"
    When  user click on my account

	#passing data using scenario outline
  @tag1
  Scenario Outline: login with valid creadential
    And 	user enter valid username <username>
    And 	user enter valid password  <password>
    And   user click on login button
    Then  user should successfully get logged in 
    
    Examples:
    |username     |password        |
    |gauragh@gmail.com|Gaurav@434  |
    |sauravs@gmail.com|Saurav@53   |
    	
    
    #passing data using properties file
    Scenario: login with invalid creadential
    And user enter invalid username
    And user enter invalid password
    And user click on login button
    Then user should successfully get error message
    
    
    #passing data through Excel file
    Scenario: Login with valid username and invalid password
    When user enters valid username 
    And user enters invalid password
    And user clicks on login button
    Then user should receive an error message
    

  