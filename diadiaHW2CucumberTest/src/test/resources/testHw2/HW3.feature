#Author: IANNIELLO ANTONIO

@tag
Feature: Title of your feature
  I want to use this template for my feature file
  
  @tag3
  Scenario: Homework 2 caso digita vai est
  Given Ho iniziato il gioco
  When ho digitato il comando "vai est"
  And ho digitato il comando "aiuto"
  And ho digitato il comando "fine"
  And avere aspettato la fine della simulazione
  Then il risultato della esecuzione dovrebbe contenere "Aula N11"
  ##Risultato atteso-->"Aula N11"
     
  @tag3
  Scenario: Homewor 2 caso digita vai ovest
  Given Ho iniziato il gioco
  When ho digitato il comando "vai ovest"
  And ho digitato il comando "aiuto"
  And ho digitato il comando "fine"
  And avere aspettato la fine della simulazione
  Then il risultato della esecuzione dovrebbe contenere "Sei in Laboratorio Campus"
  
  @tag4
  Scenario:Homeworl 2 caso digita vai nord
  Given Ho iniziato il gioco
  When ho digitato il comando "vai nord"
  And ho digitato il comando "aiuto"
  And ho digitato il comando "fine"
  And avere aspettato la fine della simulazione
  Then il risultato della esecuzione dovrebbe contenere "Sei in Biblioteca"
  
    
  @tag5
  Scenario:Homeworl 2 caso digita vai ovest 2 volte
  Given Ho iniziato il gioco
  When ho digitato il comando "vai ovest"
  And ho digitato il comando "vai ovest"
  And ho digitato il comando "aiuto" 
  And ho digitato il comando "fine"
  And avere aspettato la fine della simulazione
  Then il risultato della esecuzione dovrebbe contenere "Aula N11"
  
 @tag6
  Scenario:Homeworl 2 caso stanza bloccata
  Given Ho iniziato il gioco
  When ho digitato il comando "vai est"
  And ho digitato il comando "vai sud"
  And ho digitato il comando "vai nord"
  And ho digitato il comando "aiuto" 
  And ho digitato il comando "fine"
  And avere aspettato la fine della simulazione
  Then il risultato della esecuzione dovrebbe contenere "Bloccata"
  ##se non hai la chiave rimani in bloccata
  
  @tag7
  Scenario:Homeworl 2 caso stanza bloccata con chiave
  Given Ho iniziato il gioco
  When ho digitato il comando "prendi chiave"
 	And ho digitato il comando "vai est"
  And ho digitato il comando "vai sud"
  And ho digitato il comando "posa chiave"
  And ho digitato il comando "vai nord"
  And ho digitato il comando "aiuto"
  And ho digitato il comando "fine"
  And avere aspettato la fine della simulazione
  Then il risultato della esecuzione dovrebbe contenere "Aula N11"  
  
  
   ##questi scenari sotto sono quelli vecchi 
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
    