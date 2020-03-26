package it.uniroma3.diadia.interfacciaComandi;

import java.util.Scanner;

import it.uniroma3.diadia.comandi.ComandoNonValido;


public class IOConsole implements IO {
	
	
	
	
	private Scanner scannerDiLinee;
	

	

//mostra messaggio spostato direttamente in scrittore? MOLTO PROBABILE
	public void mostraMessaggio(String messaggio) {
		System.out.print(messaggio);
		
		
	}

	
	public String leggiRiga() {
		String istruzione;
		scannerDiLinee = new Scanner(System.in);
		
		istruzione = scannerDiLinee.nextLine();
		
		return istruzione;
	}
	
	
	

	
	//aggiunti
	//metodo richiamato dalla farbbcia del comando per impostare i parametri 
	/*public void costruisciIstruzione(String istruzione) {
		
		Scanner scannerDiParole= new Scanner(istruzione);
		
		
		




		if(scannerDiParole.hasNext())
			nomeIstruzione= scannerDiParole.next();

		if(scannerDiParole.hasNext())
			nomeParametro= scannerDiParole.next();
		scannerDiParole.close();
		
		
		
	}
*/


	
	

}
