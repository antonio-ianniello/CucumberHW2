#Author:IANNIELLO ANTONIO
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
  Scenario: HW2 prova del comando fine
  Given Ho iniziato il gioco
  And avendo digitato il comando "fine"
  Then il risultato dell' esecuzione fine dovrebbe contenere "Grazie di aver giocato"
 
## risultato atteso per secondo homework -->vai aiuto fine prendi posa guarda 

	@tag2
	Scenario: HW2 prova del comando aiuto
  Given Ho iniziato il gioco
  And avendo digitato il comando "aiuto"
  Then il risultato della nostra esecuzione dovrebbe contenere "vai" e "prendi" e "posa" e "guarda" e "aiuto"