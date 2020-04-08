package it.uniroma3.diadia.comandi;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.interfacciaComandi.IO;

/**
 * comando "Prendi"
 * @param attrezzo
 */
public class ComandoPrendi implements Comando{
	String attrezzo;
	private IO ioConsole;
	public void esegui(Partita partita) {

		//stringa attrezzo
		boolean presa;
		if(partita.getLabirinto().getStanzaCorrente().hasAttrezzo(attrezzo)){
			presa=partita.getGiocatore().getBorsa().addAttrezzo(partita.getLabirinto().getStanzaCorrente().getAttrezzo(attrezzo));
			if(presa) {
				partita.getLabirinto().getStanzaCorrente().removeAttrezzo(partita.getLabirinto().getStanzaCorrente().getAttrezzo(attrezzo));
				this.ioConsole.mostraMessaggio("oggetto messo nella borsa correttamente!");

			}

			else 
				this.ioConsole.mostraMessaggio("Borsa piena o oggetto troppo pesante");
		}
		else 
			this.ioConsole.mostraMessaggio(attrezzo + " non è in stanza");
	}


	public void setParametro(String parametro) {
		this.attrezzo= parametro;
	}

	public void setIO(IO tipoconsole) {
		this.ioConsole = tipoconsole;		
	}

	public IO getIO() {
		return this.ioConsole;
	}

}

