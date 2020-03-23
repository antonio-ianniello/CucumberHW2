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
Feature: Hw2
  I want to use this template for my feature file

  @tag1
  Scenario: Homework 2 caso si prema help
    Given I am in "Atrio"
    And I start the game
    When I digit command1 "help" and command2"null"
    
    Then I am in the "Atrio" and i have digitated "help" and "null"
    
    
    ##I start the game è importante perchè crea gli oggetti stringa del comando e dei comandi che mi servono per la testabilità
    @tag2
    Scenario: Homework 2 caso digita vai est
    Given I am in "Atrio"
    And I start the game
    When I digit command1 "vai" and command2"est"
    Then I am in the "n10" and i have digitated "vai" and "est"
    
    

