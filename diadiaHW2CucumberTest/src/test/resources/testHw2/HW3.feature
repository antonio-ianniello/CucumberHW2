#Author: IANNIELLO ANTONIO

@tag
Feature: Hw3 feature
  I want to use this template for my feature file

    @Hw3
    Scenario:Homeworl 2 caso stanza buia
    Given I am in "Atrio"
    And I start the game
    When I digit command1 "vai" and command2"est"
    And I digit command1 "vai" and command2"nord"  
    Then I am in the "Buia" and i have digitated "vai" and "nord"
    
    When I digit command1 "guarda" and command2"null"
  ##Then discuterne con il prof
    