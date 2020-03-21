package diadiaHW2CucumberTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import it.uniroma3.diadia.interfacciaComandi.InterfacciaUtente;

public class StringheIO implements InterfacciaUtente{

	private Scanner scannerDiLinee;
	
	private String comandoAttuale;
	
	private List<String> comandiDigitati;
	
	
	
	public StringheIO() {
		comandoAttuale = new String();
		comandiDigitati = new ArrayList<String>();
	}
	
	
	
	//mostra messaggio spostato direttamente in scrittore? MOLTO PROBABILE
	
	//cercare dei nomi 
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
		public void aggiungiIstruzione(String istruzione) {
			comandoAttuale = istruzione;		//giusto? se ho due paramentri
			comandiDigitati.add(comandoAttuale);
	
			
		}

//getters and setters for easy cucumber testing

		public String getComandoAttuale() {
			return comandoAttuale;
		}



		public void setComandoAttuale(String comandoAttuale) {
			this.comandoAttuale = comandoAttuale;
		}



		public List<String> getComandiDigitati() {
			return comandiDigitati;
		}



		public void setComandiDigitati(List<String> comandiDigitati) {
			this.comandiDigitati = comandiDigitati;
		}
		
		
		
		
}