#Author:IANNIELLO ANTONIO
@HW2
Feature: HomeWork 2 Testing
  Voglio usare questo template per testare il codice inerente all' homework 2

	Scenario: HW2 prova del comando aiuto
  Given Ho iniziato la partita
  When ho digitato "aiuto"
  And il programma ha stampato"vai,aiuto,fine,prendi,posa,guarda"
  When ho digitato "fine"
  And la partita e finita
  Then il programma ha stampato "vai " e "aiuto " e "fine " e "prendi " e "posa " e "guarda "   
  ##Risultato atteso-->"attenzione vai aiuto e i vari comandi hanno uno spazio a fianco
  ##solo per gli homework dove aiuto sono più stringhe e non una singola

  @Hw2
  @Hw3
  Scenario: HW2 prova del comando fine
  Given Ho iniziato la partita
  When ho digitato "fine"
  And il programma ha stampato"Grazie di aver giocato!"
  And la partita e finita
  Then il programma ha stampato "Grazie di aver giocato!"
  ##Risultato atteso-->"Grazie di aver giocato"
  
  @Hw2
  @Hw3
  Scenario: Homework 2 caso digita vai est
  Given Ho iniziato la partita
  When ho digitato "vai est"
  And il programma ha stampato"Aula N11"
  When ho digitato "fine"
  And la partita e finita
  Then il "1" messaggio stampato e "Sei in Aula N11"
  And il programma ha stampato "Grazie di aver giocato!"
  ##Risultato atteso-->"Aula N11"
  
  @Hw2
  @Hw3
  Scenario: Homewor 2 caso digita vai ovest
  Given Ho iniziato la partita
  When ho digitato "vai ovest"
  And il programma ha stampato"Sei in Laboratorio Campus"
  When ho digitato "fine"
  And la partita e finita
  Then il "1" messaggio stampato e "Sei in Laboratorio Campus"
  And il programma ha stampato "Grazie di aver giocato!"
  
  @Hw2
  @Hw3
  Scenario:Homeworl 2 caso digita vai nord
  Given Ho iniziato la partita
  When ho digitato "vai nord"
  And il programma ha stampato"Sei in Biblioteca"
  When ho digitato "fine"
  And la partita e finita
  Then il "1" messaggio stampato e "Sei in Biblioteca"
  And il programma ha stampato "Hai vinto congratulazioni" 
  ##Appena vado a nord vinco, quindi il then mi ritorna subito la fine
  
  @Hw2  
  @Hw3
  Scenario:Homeworl 2 caso digita vai ovest 2 volte
  Given Ho iniziato la partita
  When ho digitato "vai ovest"
  And il programma ha stampato"Sei in Laboratorio Campus"
  When ho digitato "vai ovest"
  And il programma ha stampato"Sei in Aula N11"
  When ho digitato "fine"
  And la partita e finita
  Then il "1" messaggio stampato e "Sei in Laboratorio Campus"
  And il "2" messaggio stampato e "Sei in Aula N11"
  And il programma ha stampato "Grazie di aver giocato!"
  
  
  @Hw2
  @Hw3
  Scenario:Homeworl 2 caso stanza bloccata
  Given Ho iniziato la partita
  When ho digitato "vai est"
  And il programma ha stampato"Sei in Aula N11"
  When ho digitato "vai sud"
  And il programma ha stampato"Sei in Bloccata"
  When ho digitato "vai nord"
  And il programma ha stampato"Sei in Bloccata"
  When ho digitato "fine"
  And la partita e finita
  Then il "1" messaggio stampato e "Sei in Aula N11"
  And il "2" messaggio stampato e "Sei in Bloccata"
  And il "3" messaggio stampato e "Sei in Bloccata"
  And il programma ha stampato "Grazie di aver giocato!"
  ##se non hai la chiave rimani in bloccata
  
  @Hw2  
  @Hw3
  Scenario:Homeworl 2 caso stanza bloccata con chiave
  Given Ho iniziato la partita
  When ho digitato "prendi chiave"
  And il programma ha stampato"oggetto messo nella borsa correttamente!"
 	When ho digitato "vai est"
 	And il programma ha stampato"Sei in Aula N11"
  When ho digitato "vai sud"
  And il programma ha stampato"Sei in Bloccata"
  When ho digitato "posa chiave"
  And il programma ha stampato"L' oggetto:chiave è stato posato correttamente"
  When ho digitato "vai nord"
  And il programma ha stampato"Sei in Aula N11"
  When ho digitato "fine"
  And la partita e finita
  Then il "1" messaggio stampato e "oggetto messo nella borsa correttamente!"
  And il "2" messaggio stampato e "Sei in Aula N11"
  And il "3" messaggio stampato e "Sei in Bloccata"
  ##And il "4" messaggio stampato e " L' oggetto:chiave è stato posato correttamente"
  And il "5" messaggio stampato e "Sei in Aula N11"
  And il programma ha stampato "Grazie di aver giocato!" 
  
