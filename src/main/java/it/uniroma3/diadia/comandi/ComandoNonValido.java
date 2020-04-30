package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.interfacciaComandi.IO;

public class ComandoNonValido implements Comando {
	private IO ioConsole;
	public void esegui(Partita partita) {
		this.ioConsole.mostraMessaggio("Comando sconosciuto riprova sarai più fortunato /n");		
	}
	
	public void setParametro(String parametro)  {
		
	}

	public void setIO(IO tipoconsole) {
		this.ioConsole = tipoconsole;		
	}
	public IO getIO() {
		return this.ioConsole;
	}


}
