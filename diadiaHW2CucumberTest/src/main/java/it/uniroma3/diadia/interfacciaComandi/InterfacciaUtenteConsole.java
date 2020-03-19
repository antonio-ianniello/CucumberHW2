package it.uniroma3.diadia.interfacciaComandi;

import java.util.Scanner;

public class InterfacciaUtenteConsole implements InterfacciaUtente{
	
	
	private Scanner scannerDiLinee;
	private ScrittoreAutomaticoComandi scrittore;
	
	
	public InterfacciaUtenteConsole () {
		this.scrittore = new ScrittoreAutomaticoComandi();
	}
	

	public void mostraMessaggioScrittore(String messaggio) {
		scrittore.mostraMessaggioScrittore(messaggio);
		
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

//aggiunti per lo scrittore
	public Scanner getScannerDiLinee() {
		return scannerDiLinee;
	}


	public void setScannerDiLinee(Scanner scannerDiLinee) {
		this.scannerDiLinee = scannerDiLinee;
	}


	
	
	

}
