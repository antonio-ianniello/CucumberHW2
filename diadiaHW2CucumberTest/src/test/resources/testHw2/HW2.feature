#Author:IANNIELLO ANTONIO
@tag
Feature: HomeWork 2 Testing
  Voglio usare questo template per testare il codice inerente all' homework 2

  @tag1
  Scenario: HW2 prova del comando fine
  Given Ho iniziato il gioco
  When ho digitato il comando "fine"
  Then il risultato della esecuzione dovrebbe contenere "Grazie di aver giocato"
  ##Risultato atteso-->"Grazie di aver giocato"
 
	@tag2
	Scenario: HW2 prova del comando aiuto
  Given Ho iniziato il gioco
  When ho digitato il comando "aiuto"
  Then il risultato della nostra esecuzione dovrebbe contenere "vai" e "prendi" e "posa" e "guarda" e "aiuto"
  ##Risultato atteso-->"vai" e "prendi" e "posa" e "guarda" e "aiuto"
  
  @tag3
  Scenario: Homework 2 caso digita vai est
  Given Ho iniziato il gioco
  When ho digitato il comando "vai est"
  Then il risultato della esecuzione dovrebbe contenere "Aula N11"
  ##Risultato atteso-->"Aula N11"
     
  @tag3
  Scenario: Homewor 2 caso digita vai ovest
  Given Ho iniziato il gioco
  When ho digitato il comando "vai ovest"
  Then il risultato della esecuzione dovrebbe contenere "Laboratorio Campus"