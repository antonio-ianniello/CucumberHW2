package it.uniroma3.diadia.comandi;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.interfacciaComandi.IO;

/**
 * Comando "Fine".
 */
public class ComandoFine implements Comando {

	private IO ioConsole;
	public void esegui(Partita partita) {
		this.ioConsole.mostraMessaggio("Grazie di aver giocato!");
		partita.setFinita();
		
	}
	public void setParametro(String parametro) {

	}

	public void setIO(IO tipoconsole) {
		this.ioConsole = tipoconsole;
	}
	public IO getIO() {
		return this.ioConsole;
	}
}

