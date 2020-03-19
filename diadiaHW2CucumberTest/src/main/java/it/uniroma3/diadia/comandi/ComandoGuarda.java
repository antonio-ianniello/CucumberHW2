package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.Partita;

public class ComandoGuarda implements Comando{
	
	public void esegui(Partita partita ) {
		System.out.println(partita.getLabirinto().getStanzaCorrente().getDescrizione());
		System.out.println(partita.getGiocatore().getBorsa().toString());
		System.out.println(partita.getGiocatore().getDescrizione());	
	}
	
	public void setParametro(String stanza) {
		
	}
}
