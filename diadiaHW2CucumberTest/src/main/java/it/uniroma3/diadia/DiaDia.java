package it.uniroma3.diadia;





import it.uniroma3.diadia.comandi.Comando;
import it.uniroma3.diadia.comandi.FabbricaDiComandiFisarmonica;
import it.uniroma3.diadia.interfacciaComandi.InterfacciaUtenteConsole;



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
	
	private InterfacciaUtenteConsole IO;
	

	public DiaDia() {
		this.partita = new Partita();
		this.IO = new InterfacciaUtenteConsole();
		
	}

	public void gioca() {
		String istruzione; 
		
		
		

		this.IO.mostraMessaggioScrittore(MESSAGGIO_BENVENUTO);
		
		do		
			istruzione = IO.prendiIstruzione();
		while (!processaIstruzione(istruzione));
		IO.chiudiScanner();
	}   


	/**
	 * Processa una istruzione 
	 *
	 * @return true se l'istruzione e' eseguita e il gioco continua, false altrimenti
	 */
	private boolean processaIstruzione(String istruzione) {
		Comando comandoDaEseguire;
		FabbricaDiComandiFisarmonica factory = new FabbricaDiComandiFisarmonica();
	comandoDaEseguire= factory.costruisciComando(istruzione);
	comandoDaEseguire.esegui(this.partita);
	
	if(this.partita.vinta())
		IO.mostraMessaggio("Hai vinto congratulazioni");
	
	if(!this.partita.getGiocatore().giocatoreIsVivo())
		IO.mostraMessaggio("Hai esaurito i Cfu");
	
	return this.partita.isFinita();
	
	}
		



	public static void main(String[] argc) {
		DiaDia gioco = new DiaDia();
		gioco.gioca();
	}
}