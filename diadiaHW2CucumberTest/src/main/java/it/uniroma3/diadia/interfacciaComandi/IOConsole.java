package it.uniroma3.diadia.interfacciaComandi;

import java.util.Scanner;

import it.uniroma3.diadia.comandi.ComandoNonValido;


public class IOConsole implements InterfacciaUtente {
	
	private String nomeIstruzione;
	private String nomeParametro;
	
	
	private Scanner scannerDiLinee;
	
	
	public IOConsole() {
		nomeIstruzione= new String();
		nomeParametro = new String();
	}
	

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
	
	
	public void fineRevisione() {
		scannerDiLinee.close();
	}

	
	//aggiunti
	//metodo richiamato dalla farbbcia del comando per impostare i parametri 
	public void costruisciIstruzione(String istruzione) {
		
		Scanner scannerDiParole= new Scanner(istruzione);
		
		
		




		if(scannerDiParole.hasNext())
			nomeIstruzione= scannerDiParole.next();

		if(scannerDiParole.hasNext())
			nomeParametro= scannerDiParole.next();
		scannerDiParole.close();
		
		
		
	}


	public String getNomeIstruzione() {
		// TODO Auto-generated method stub
		return this.nomeIstruzione;
		
	}


	public String getNomeParamaetro() {
		// TODO Auto-generated method stub
		return this.nomeParametro;
	}
	
	

}
