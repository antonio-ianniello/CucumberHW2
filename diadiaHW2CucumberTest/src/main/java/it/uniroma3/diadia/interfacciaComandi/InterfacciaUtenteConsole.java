package it.uniroma3.diadia.interfacciaComandi;

import java.util.Scanner;

public class InterfacciaUtenteConsole implements InterfacciaUtente{
	
	
	private Scanner scannerDiLinee;
	private ScrittoreAutomaticoComandi scrittore;
	
	
	public InterfacciaUtenteConsole () {
		this.scrittore = new ScrittoreAutomaticoComandi();
	}
	
//mostra messaggio spostato direttamente in scrittore? MOLTO PROBABILE
	public void mostraMessaggio(String messaggio) {
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

	public ScrittoreAutomaticoComandi getScrittore() {
		return scrittore;
	}

	public void setScrittore(ScrittoreAutomaticoComandi scrittore) {
		this.scrittore = scrittore;
	}
	
	public ScrittoreAutomaticoComandi getScrittoreAutomatico() {
		return this.scrittore;
	}
	
	
	

	
	

	
	
	

}
