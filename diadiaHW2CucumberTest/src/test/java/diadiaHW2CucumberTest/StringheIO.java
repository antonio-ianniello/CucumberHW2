package diadiaHW2CucumberTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import it.uniroma3.diadia.interfacciaComandi.InterfacciaUtente;

public class StringheIO implements InterfacciaUtente{

	
	
	private String nomeComando;
	private String nomeParametro;
	
	private List<String> comandiDigitati;
	
	//private String stringaOutput;					non mi serve al fine del testing
	
	
	
	public StringheIO() {
		nomeComando = new String();
		nomeParametro = new String();
		comandiDigitati = new ArrayList<String>();
		//stringaOutput = new String();
	}
	
	
	
	
	
	//cercare dei nomi 
		public void mostraMessaggio(String messaggio) {
			
			//prima l' output era la console, adesso una stringa memorizzata 
			//stringaOutput = messaggio;
			}

		
		public String prendiIstruzione() {
			//debbo costruire io i comandi per il testing
			costruisciIstruzione("vai","est");			
			
			return nomeComando;
			
			
		}
		
		
		public void chiudiScanner() {
			System.out.print("Fine Testing");
		}
		
	


		//costruisce le istruzioni per il testin richiamdo delle funzioni in sequenza
		public void costruisciIstruzione(String parametro1,String parametro2) {
			if(parametro2==null) {
				this.nomeComando= parametro1;
				this.nomeParametro=null;
				this.getComandiDigitati().add(parametro1);
			}
			else{
				//senno' vuol dire che il comando ha due parametri
				this.nomeComando= parametro1;
				this.nomeParametro= parametro2;
				this.getComandiDigitati().add(parametro1);
				this.getComandiDigitati().add(parametro2);
			}
		}
		

		public String getNomeComando() {
			return nomeComando;
		}



		public void setNomeComando(String comandoAttuale) {
			this.nomeComando = comandoAttuale;
		}
		
		

		public String getParametroComando() {
			return nomeParametro;
		}



		public void setParametroComando(String parametroAttuale) {
			this.nomeParametro = parametroAttuale;
		}





		public List<String> getComandiDigitati() {
			return comandiDigitati;
		}



		public void setComandiDigitati(List<String> comandiDigitati) {
			this.comandiDigitati = comandiDigitati;
		}
		
	


	
		
		
		
}