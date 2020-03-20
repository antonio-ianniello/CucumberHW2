package diadiaHW2CucumberTest;

import java.util.List;
import java.util.Scanner;

import it.uniroma3.diadia.interfacciaComandi.InterfacciaUtente;

public class StringheIO implements InterfacciaUtente{

	private Scanner scannerDiLinee;
	
	private String comandoAttuale;
	
	private List<String> comandiDigitati;
	
	
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
		
		
		//funzioni da aggiungere all' interfaccia per favorire il testing 
		public void aggiungiIstruzione() {
			
			
			
		}
		
}