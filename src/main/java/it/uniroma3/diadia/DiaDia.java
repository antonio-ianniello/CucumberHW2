package it.uniroma3.diadia;
import it.uniroma3.diadia.comandi.Comando;
import it.uniroma3.diadia.comandi.FabbricaDiComandi;
import it.uniroma3.diadia.comandi.FabbricaDiComandiFisarmonica;
import it.uniroma3.diadia.interfacciaComandi.IO;
import it.uniroma3.diadia.interfacciaComandi.IOConsole;

/**
 * Classe principale di diadia, un semplice gioco di ruolo ambientato al dia.
 * Per giocare crea un'istanza di questa classe e invoca il letodo gioca
 *
 * Questa e' la classe principale crea e istanzia tutte le altre
 *
 * @author  docente di POO 
 *         (da un'idea di Michael Kolling and David J. Barnes) 
 *         
 *         Studente I.ANTONIO
 *          
 * @version 15/04/2018 3.01 
 */

public class DiaDia {

	static final private String MESSAGGIO_BENVENUTO = ""+
			"Ti trovi nell'Universita', ma oggi e' diversa dal solito...\n" +
			"Meglio andare al piu' presto in biblioteca a studiare. Ma dov'e'?\n"+
			"I locali sono popolati da strani personaggi, " +
			"alcuni amici, altri... chissa!\n"+
			"Ci sono attrezzi che potrebbero servirti nell'impresa:\n"+
			"puoi raccoglierli, usarli, posarli quando ti sembrano inutili\n" +
			"o regalarli se pensi che possano ingraziarti qualcuno.\n\n"+
			"Per conoscere le istruzioni usa il comando 'aiuto'.";
	private Partita partita;
	private IO IO;
	private FabbricaDiComandi factory;

	public DiaDia(IO interfaccia) {
		this.IO = interfaccia;
		this.partita = new Partita();
		this.factory=new FabbricaDiComandiFisarmonica(interfaccia);
	}

	public void gioca() {
		String istruzione; 
		this.IO.mostraMessaggio(MESSAGGIO_BENVENUTO);
		do		
			istruzione = IO.leggiRiga();
		while (!processaIstruzione(istruzione));

	}   
	/**
	 * Processa una istruzione 
	 *
	 * @return true se l'istruzione e' eseguita e il gioco continua, false altrimenti
	 */

	//public per forza per il testing
	private boolean processaIstruzione(String istruzione) {
		Comando comandoDaEseguire;
		comandoDaEseguire= factory.costruisciComando(istruzione);
		comandoDaEseguire.esegui(this.partita);

		if(this.partita.vinta())
			IO.mostraMessaggio("Hai vinto ");

		if(!this.partita.getGiocatore().giocatoreIsVivo())
			IO.mostraMessaggio("Hai esaurito i Cfu");
		
		return this.partita.isFinita();
		
	}


	public static void main(String[] argc) {

		DiaDia gioco = new DiaDia(new IOConsole());
		gioco.gioca();
	}

	
}