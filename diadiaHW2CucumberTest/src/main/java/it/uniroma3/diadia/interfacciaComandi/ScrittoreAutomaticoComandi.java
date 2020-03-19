package it.uniroma3.diadia.interfacciaComandi;

import java.util.ArrayList;
import java.util.List;

public class ScrittoreAutomaticoComandi {

	//per tenere traccia dei comandi digitati
	private List<String> comandiInseriti;
	
	public ScrittoreAutomaticoComandi() {
		this.comandiInseriti = new ArrayList<String>();
	}
	
	public void mostraMessaggioScrittore(String messaggio) {
		System.out.print(messaggio);
		this.comandiInseriti.add(messaggio);		//inserisce ogni stringa...Esempio:  vai-nord-guarda-fine (4 stringhe)
		
		
	}
	
	
	
	//QUESTE FUNZIONI VANNO QUI O IN CUCUMBER? RIFLETTERCI SU
	
	//getters and setters for the list

	public List<String> getComandiInseriti() {
		return comandiInseriti;
	}

	public void setComandiInseriti(List<String> comandiInseriti) {
		this.comandiInseriti = comandiInseriti;
	}

	
	public String getComandoInserito(int index){
		return this.comandiInseriti.get(index);
	}
	
	//non dovrebbe funzionare per comandi con due parametri , 
	//NON MI PIACE AFFATTO, se ho vai nord--> potrebbe diventare vai usa ovvero un comando inutile
	
	public void setComandoInserito(String comando_singolo,int index) {
		this.comandiInseriti.set(index, comando_singolo);
	}
	
	

	
	
	
	

}
