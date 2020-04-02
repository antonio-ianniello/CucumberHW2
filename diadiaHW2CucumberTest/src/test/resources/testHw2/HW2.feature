#Author:IANNIELLO ANTONIO
@tag
Feature: HomeWork 2 Testing
  Voglio usare questo template per testare il codice inerente all' homework 2

  @tag1
  Scenario: HW2 prova del comando fine
  Given Ho iniziato il gioco
  When ho digitato il comando "fine"
  And avere aspettato la fine della simulazione
  Then il risultato della esecuzione fine dovrebbe contenere "Grazie di aver giocato!"
  ##Risultato atteso-->"Grazie di aver giocato"
 
	@tag2
	Scenario: HW2 prova del comando aiuto
  Given Ho iniziato il gioco
  When ho digitato il comando "aiuto"
  And avere aspettato la fine della simulazione
  Then il risultato della nostra esecuzione dovrebbe contenere "vai" e "prendi" e "posa" e "guarda" e "aiuto"
  ##Risultato atteso-->"vai" e "prendi" e "posa" e "guarda" e "aiuto"
  
  @tag3
  Scenario: Homework 2 caso digita vai est
  Given Ho iniziato il gioco
  When ho digitato il comando "vai est"
  And avere aspettato la fine della simulazione
  Then il risultato della esecuzione dovrebbe contenere "Aula N11"
  ##Risultato atteso-->"Aula N11"
     
  @tag3
  Scenario: Homewor 2 caso digita vai ovest
  Given Ho iniziato il gioco
  When ho digitato il comando "vai ovest"
  And avere aspettato la fine della simulazione
  Then il risultato della esecuzione dovrebbe contenere "Laboratorio Campus"
  
  @tag4
  Scenario:Homeworl 2 caso digita vai nord
  Given Ho iniziato il gioco
  When ho digitato il comando "vai nord"
  And avere aspettato la fine della simulazione
  Then il risultato della esecuzione dovrebbe contenere "Biblioteca"
  
    
  @tag5
  Scenario:Homeworl 2 caso digita vai ovest 2 volte
  Given Ho iniziato il gioco
  When ho digitato il comando "vai ovest"
  And ho digitato il comando "vai ovest" 
  And avere aspettato la fine della simulazione
  Then il risultato della esecuzione dovrebbe contenere "Aula N11"
  
 @tag6
  Scenario:Homeworl 2 caso stanza bloccata
  Given Ho iniziato il gioco
  When ho digitato il comando "vai est"
  And ho digitato il comando "vai sud"
  And ho digitato il comando "vai nord" 
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
  And avere aspettato la fine della simulazione
  Then il risultato della esecuzione dovrebbe contenere "Aula N11"

  