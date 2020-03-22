package diadiaHW2CucumberTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import it.uniroma3.diadia.interfacciaComandi.InterfacciaUtente;

public class StringheIO implements InterfacciaUtente{

	
	
	private String comandoAttuale;
	
	private List<String> comandiDigitati;
	
	private String stringaOutput;
	
	
	
	public StringheIO() {
		comandoAttuale = new String();
		comandiDigitati = new ArrayList<String>();
		stringaOutput = new String();
	}
	
	
	
	//mostra messaggio spostato direttamente in scrittore? MOLTO PROBABILE
	
	//cercare dei nomi 
		public void mostraMessaggio(String messaggio) {
			
			//prima l' output era la console, adesso una stringa memorizzata 
			stringaOutput = messaggio;
			
			
		}

		
		public String prendiIstruzione() {
			//debbo costruire io i comandi per il testing
			costruisciIstruzione("vai","est");			
			
			
			//spostata la responsabilità in costruisciIscrizione
			//this.comandoAttuale = istruzione;		//giusto? se ho due paramentri
			//this.comandiDigitati.add(comandoAttuale);
			
			return comandoAttuale;
			
			
		}
		
		
		public void chiudiScanner() {
			System.out.print("Fine Testing");
		}
		
	


		//costruisce le istruzioni per il testin richiamdo delle funzioni in sequenza
		public void costruisciIstruzione(String parametro1,String parametro2) {
			if(parametro2==null) {
				this.comandoAttuale= parametro1;
				this.getComandiDigitati().add(parametro1);
			}
			else{
				//senno' vuol dire che il comando ha due parametri
				this.comandoAttuale= parametro2;
				this.getComandiDigitati().add(parametro1);
				this.getComandiDigitati().add(parametro2);
			}
		}
		

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