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
Feature: Title of your feature
  I want to use this template for my feature file
  
  ##nuovoScenario
@tag1
  Scenario: Homework 2 caso si prema help
    Given I am in Atrio
    And I start the game
    When I digit command1 "aiuto" and command2""
    
    Then I am in the Atrio and the output of string is "vai,aiuto,prendi,posa,guarda"
   ##questi scenari sotto servono per capire se il labirinto sia corretto
    @tag2
    Scenario: Homework 2 caso digita vai est
    Given I am in "Atrio"
    And I start the game
    When I digit command1 "vai" and command2"est"
    Then I am in the "Aula N11" and i have digitated "vai" and "est"
    
    @tag3
    Scenario: Homewor 2 caso digita vai ovest
    Given I am in "Atrio"
    And I start the game
    When I digit command1 "vai" and command2"ovest"
    
    Then I am in the "Laboratorio Campus" and i have digitated "vai" and "ovest"
    
     @tag4
    Scenario:Homeworl 2 caso digita vai nord
    Given I am in "Atrio"
    And I start the game
    When I digit command1 "vai" and command2"nord"
    
    Then I am in the "Biblioteca" and i have digitated "vai" and "nord"
    
    
    @tag5
    Scenario:Homeworl 2 caso digita vai ovest 2 volte
    Given I am in "Atrio"
    And I start the game
    When I digit command1 "vai" and command2"ovest"
    And I digit command1 "vai" and command2"ovest"    
    Then I am in the "Aula N11" and i have digitated "vai" and "ovest"
    
    
    @tag6
    Scenario:Homeworl 2 caso stanza bloccata
    Given I am in "Atrio"
    And I start the game
    When I digit command1 "vai" and command2"est"
    And I digit command1 "vai" and command2"sud"  
    Then I am in the "Bloccata" and i have digitated "vai" and "sud"
    
    When I digit command1 "vai" and command2"nord"   
    Then I am in the "Bloccata" and i have digitated "vai" and "nord"
    
     @tag7
    Scenario:Homeworl 2 caso stanza bloccata con chiave
    Given I am in "Atrio"
    And I start the game
    When I digit command1 "prendi" and command2"chiave"
    And I digit command1 "vai" and command2"est"  
    And I digit command1 "vai" and command2"sud"  
    Then I am in the "Bloccata" and i have digitated "vai" and "sud"
    
    When I digit command1 "posa" and command2"chiave"
    And I digit command1 "vai" and command2"nord"   
    Then I am in the "Aula N11" and i have digitated "vai" and "nord"
    
    
    
    
     @tag8
    Scenario:Homeworl 2 caso stanza buia
    Given I am in "Atrio"
    And I start the game
    When I digit command1 "vai" and command2"est"
    And I digit command1 "vai" and command2"nord"  
    Then I am in the "Buia" and i have digitated "vai" and "nord"
    
    When I digit command1 "guarda" and command2"null"
  ##Then discuterne con il prof
    