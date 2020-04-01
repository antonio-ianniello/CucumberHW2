package it.uniroma3.diadia.comandi;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.interfacciaComandi.IO;

/**
 * comando "Posa"
 * 
 * rimuove l' attrezzo passato come parametro
 */
public class ComandoPosa implements Comando {
	private String attrezzo;
	private IO ioConsole;
	public void esegui(Partita partita) {
		
		boolean posato;
		if(partita.getGiocatore().getBorsa().hasAttrezzo(attrezzo)) {
			partita.getLabirinto().getStanzaCorrente().addAttrezzo(partita.getGiocatore().getBorsa().getAttrezzo(attrezzo));	//aggiunhgo in stanza
			posato=partita.getLabirinto().getStanzaCorrente().hasAttrezzo(attrezzo);
			if(posato) {
				partita.getGiocatore().getBorsa().removeAttrezzo(attrezzo);

				this.ioConsole.mostraMessaggio("L' oggetto:"+attrezzo+ " è stato posato correttamente\n");

			}
		}
		else {
			this.ioConsole.mostraMessaggio(attrezzo+ "  non in borsa cosa fai? lol\n");

		}
	}
	public void setParametro(String parametro) {
		this.attrezzo=parametro;
	}

	public void setIO(IO tipoconsole) {
		this.ioConsole = tipoconsole;
		
	}
	public IO getIO() {
		return this.ioConsole;
	}
}

