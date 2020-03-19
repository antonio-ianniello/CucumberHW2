package it.uniroma3.diadia.comandi;



import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Stanza;
/**
 * Cerca di andare in una direzione. Se c'e' una stanza ci entra 
 * e ne stampa il nome, altrimenti stampa un messaggio di errore
 */
public class ComandoVai implements Comando {
	private String direzione;

	/**
	 * esecuzione del comando
	 */
	
	public void esegui(Partita partita) {
		Stanza stanzaCorrente= partita.getLabirinto().getStanzaCorrente();
		Stanza prossimaStanza= null;

		if(this.direzione == null) {
			System.out.println("Dove vuoi andare? \n"
					+"Devi specificare una direzione ");
		}



		prossimaStanza=stanzaCorrente.getStanzaAdiacente(this.direzione);

		if(prossimaStanza==null) {
			System.out.println("Direzione inesistente");
		}
		else {

		partita.getLabirinto().setStanzaCorrente(prossimaStanza);
		System.out.println("Sei in "+partita.getLabirinto().getStanzaCorrente().getNome());
		partita.getGiocatore().setCfu(partita.getGiocatore().getCfu()-1);

		}
	}
	
	
	
	public void setParametro(String parametro) {
		this.direzione= parametro;
	}
}
