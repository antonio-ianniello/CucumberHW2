#Author: IANNIELLO ANTONIO

@tag
Feature: Title of your feature
  I want to use this template for my feature file

   ##questi scenari sotto servono per capire se il labirinto sia corretto

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
    