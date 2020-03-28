package diadiaHW2CucumberTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import it.uniroma3.diadia.interfacciaComandi.IO;

public class IOString implements IO{

	
	
	private String nomeIstruzione;
	private String nomeParametro;
	
	private List<String> comandiDigitati;
	
	
	private String riga;
	
	public IOString() {
		nomeIstruzione = new String();
		nomeParametro = new String();
		comandiDigitati = new ArrayList<String>();
		this.riga = new String();
		
	}
	
	
	
	
	
	//cercare dei nomi 
		public void mostraMessaggio(String messaggio) {
			
			//prima l' output era la console, adesso una stringa memorizzata 
		//	stringaOutput = messaggio;
			}

		
		
		//debbo costruire io i comandi per il testing, qui vanno tutti i comandi che devo simulare
		public String leggiRiga() {
			
			
		//	return nomeIstruzione+" "+nomeParametro;
			return riga;
			
		}
		
		
		
	

		//costruisce le istruzioni per il testin richiamdo delle funzioni in sequenza
		public String costruisciIstruzione(String riga) {
			
			if(riga.contains(" ")) {
			String[] parole = riga.split(" ");
			
			
			
			if(parole[0]!=null && parole[1]==null) {
				this.nomeIstruzione = parole[0];
			}
			else {
				this.nomeIstruzione = parole[0];
				this.nomeParametro = parole[1];
			}
			}
			
			
			
			/*
			Scanner scannerDiParole = new Scanner(riga);

			// prima parola: nome del comando
			if (scannerDiParole.hasNext())
				this.nomeIstruzione = scannerDiParole.next(); 

			// seconda parola: eventuale parametro
			if (scannerDiParole.hasNext())
				this.nomeParametro = scannerDiParole.next();
			scannerDiParole.close();
			
				//this.nomeIstruzione= parametro1;
				//this.getComandiDigitati().add(parametro1);
			*/
		
			return riga;
		
			
		}
		



		public List<String> getComandiDigitati() {
			return comandiDigitati;
		}



		public void setComandiDigitati(List<String> comandiDigitati) {
			this.comandiDigitati = comandiDigitati;
		}


		//aggiunti 


		public String getNomeIstruzione() {
			
			return this.nomeIstruzione;
		}


		public String getNomeParamaetro() {
			
			return this.nomeParametro;
		}


		public void setNomeParametro(String nomeParametro) {
			this.nomeParametro = nomeParametro;
		}


		public void setNomeIstruzione(String nomeIstruzione) {
			this.nomeIstruzione = nomeIstruzione;
		}


		//metodo richiamato per creare l' intera stringa
		public void setInteraIstruzione(String s) {
			this.riga = s;
			costruisciIstruzione(riga);
		}







		




	
	




	
		
		
		
}