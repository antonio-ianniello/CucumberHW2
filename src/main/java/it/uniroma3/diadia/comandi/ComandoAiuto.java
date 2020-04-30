package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.interfacciaComandi.IO;


public class ComandoAiuto implements Comando {
	private static final String[] elencoComandi = {"vai", "aiuto", "fine","prendi","posa","guarda"};
	private IO ioConsole;
	
	
	public void esegui(Partita partita) {
		for(int i=0;i < elencoComandi.length;i++) {
			ioConsole.mostraMessaggio(elencoComandi[i]+" ");
		}
		//this.ioConsole.mostraMessaggio();
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
	



