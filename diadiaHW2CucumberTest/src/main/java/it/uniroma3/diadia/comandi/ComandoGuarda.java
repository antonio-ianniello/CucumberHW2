package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.interfacciaComandi.IO;

public class ComandoGuarda implements Comando{
	
	private IO ioConsole;
	public void esegui(Partita partita ) {
		this.ioConsole.mostraMessaggio(partita.getLabirinto().getStanzaCorrente().getDescrizione());
		this.ioConsole.mostraMessaggio(partita.getGiocatore().getBorsa().toString());
		this.ioConsole.mostraMessaggio(partita.getGiocatore().getDescrizione());	
	}
	
	public void setParametro(String stanza) {
		
	}

	public void setIO(IO tipoconsole) {
		this.ioConsole = tipoconsole;		
	}
	public IO getIO() {
		return this.ioConsole;
	}

}
