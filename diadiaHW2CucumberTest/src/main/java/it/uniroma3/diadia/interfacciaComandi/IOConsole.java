package it.uniroma3.diadia.interfacciaComandi;

import java.util.Scanner;


public class IOConsole implements InterfacciaUtente {
	
	
	private Scanner scannerDiLinee;

//mostra messaggio spostato direttamente in scrittore? MOLTO PROBABILE
	public void mostraMessaggio(String messaggio) {
		System.out.print(messaggio);
		
		
	}

	
	public String prendiIstruzione() {
		String istruzione;
		scannerDiLinee = new Scanner(System.in);
		
		istruzione = scannerDiLinee.nextLine();
		
		return istruzione;
	}
	
	
	public void chiudiScanner() {
		scannerDiLinee.close();
	}

	
	

}
