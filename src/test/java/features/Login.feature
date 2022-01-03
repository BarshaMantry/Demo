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

Feature: Application Login


Scenario: Home page Default Login
Given User is on Landing Page
When User login into application with username "jin" and password "1234"
Then Home page is populated
And Cards are Displayed are "true"


Scenario: Home page Default Login
Given User is on Landing Page
When User login into application with username "john" and password "4321"
Then Home page is populated
And Cards are Displayed "false"

Scenario: Home page Default Login
Given User is on Landing Page
When User login into application with username "barsha" and password "1456"
Then Home page is populated
And Cards are Displayed "false"

Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
