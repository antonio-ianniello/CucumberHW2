package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.Partita;

/**
 * comando "Prendi"
 * @param attrezzo
 */
public class ComandoPrendi implements Comando{
	String attrezzo;
	public void esegui(Partita partita) {

		//stringa attrezzo
		boolean presa;
		if(partita.getLabirinto().getStanzaCorrente().hasAttrezzo(attrezzo)){
			presa=partita.getGiocatore().getBorsa().addAttrezzo(partita.getLabirinto().getStanzaCorrente().getAttrezzo(attrezzo));
			if(presa) {
				partita.getLabirinto().getStanzaCorrente().removeAttrezzo(partita.getLabirinto().getStanzaCorrente().getAttrezzo(attrezzo));
				System.out.println("oggetto messo nella borsa correttamente!\n");

			}

			else 
				System.out.println("Borsa piena o oggetto troppo pesante\n");
		}
		else 
			System.out.println(attrezzo + " non è in stanza");
	}


	public void setParametro(String parametro) {
		this.attrezzo= parametro;
	}


	
}

