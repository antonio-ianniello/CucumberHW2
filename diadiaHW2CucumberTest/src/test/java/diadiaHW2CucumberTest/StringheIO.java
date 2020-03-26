package diadiaHW2CucumberTest;

import java.util.ArrayList;
import java.util.List;

import it.uniroma3.diadia.interfacciaComandi.InterfacciaUtente;

public class StringheIO implements InterfacciaUtente{

	
	
	private String nomeIstruzione;
	private String nomeParametro;
	
	private List<String> comandiDigitati;
	
	
	
	
	public StringheIO() {
		nomeIstruzione = new String();
		nomeParametro = new String();
		comandiDigitati = new ArrayList<String>();
		
	}
	
	
	
	
	
	//cercare dei nomi 
		public void mostraMessaggio(String messaggio) {
			
			//prima l' output era la console, adesso una stringa memorizzata 
		//	stringaOutput = messaggio;
			}

		
		
		//debbo costruire io i comandi per il testing, qui vanno tutti i comandi che devo simulare
		public String leggiIstruzione() {
			
			//costruisciIstruzioneConParametro("vai","est");			//non serve, gli di i comandi dal test		
			
			return nomeIstruzione;
			
			
		}
		
		
		public void fineRevisione() {
			System.out.print("Fine Testing");
		}
		
	


		//costruisce le istruzioni per il testin richiamdo delle funzioni in sequenza
		public void costruisciIstruzione(String parametro1) {
		
				this.nomeIstruzione= parametro1;
				this.getComandiDigitati().add(parametro1);
		
		}
		
		/*		non serve 
		public void costruisciIstruzioneConParametro(String parametro1,String parametro2) {
			if(parametro2==null) {
				this.nomeIstruzione= parametro1;
				this.nomeParametro=null;
				this.getComandiDigitati().add(parametro1);
			}
			else{
				//senno' vuol dire che il comando ha due parametri
				this.nomeIstruzione= parametro1;
				this.nomeParametro= parametro2;
				this.getComandiDigitati().add(parametro1);
				this.getComandiDigitati().add(parametro2);
			}
		}

*/



		public List<String> getComandiDigitati() {
			return comandiDigitati;
		}



		public void setComandiDigitati(List<String> comandiDigitati) {
			this.comandiDigitati = comandiDigitati;
		}


		//aggiunti da rivedrere


		public String getNomeIstruzione() {
			// TODO Auto-generated method stub
			return this.nomeIstruzione;
		}





		public String getNomeParamaetro() {
			// TODO Auto-generated method stub
			return this.nomeParametro;
		}




		public void setNomeParametro(String nomeParametro) {
			this.nomeParametro = nomeParametro;
		}





		public void setNomeIstruzione(String nomeIstruzione) {
			this.nomeIstruzione = nomeIstruzione;
		}





		




	
	




	
		
		
		
}