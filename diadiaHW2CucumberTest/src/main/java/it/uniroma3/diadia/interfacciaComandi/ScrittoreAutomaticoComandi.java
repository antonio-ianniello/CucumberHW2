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
		this.comandiInseriti.add(messaggio);
		
	}
	
	
	
	
	
	//getters and setters for the list

	public List<String> getComandiInseriti() {
		return comandiInseriti;
	}

	public void setComandiInseriti(List<String> comandiInseriti) {
		this.comandiInseriti = comandiInseriti;
	}


	
	
	
	

}
