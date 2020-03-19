package it.uniroma3.diadia;



import java.util.Scanner;

import it.uniroma3.diadia.comandi.Comando;
import it.uniroma3.diadia.comandi.FabbricaDiComandiFisarmonica;



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
	
	private Partita partita;
	

	public DiaDia() {
		this.partita = new Partita();
		
	}

	public void gioca() {
		String istruzione; 
		Scanner scannerDiLinee;
		
		

		System.out.println(this.partita.getLabirinto().getMessaggioBenvenuto());
		scannerDiLinee = new Scanner(System.in);		
		do		
			istruzione = scannerDiLinee.nextLine();
		while (!processaIstruzione(istruzione));
		scannerDiLinee.close();
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
		System.out.println("Hai vinto congratulazioni");
	
	if(!this.partita.getGiocatore().giocatoreIsVivo())
		System.out.println("Hai esaurito i Cfu");
	
	return this.partita.isFinita();
	
	}
		



	public static void main(String[] argc) {
		DiaDia gioco = new DiaDia();
		gioco.gioca();
	}
}