package it.uniroma3.diadia.interfacciaComandi;

import java.util.Scanner;

public class InterfacciaUtenteConsole implements InterfacciaUtente{
	
	
	Scanner scannerDiLinee;

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
