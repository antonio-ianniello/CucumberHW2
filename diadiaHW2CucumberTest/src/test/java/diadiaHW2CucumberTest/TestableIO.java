package diadiaHW2CucumberTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import it.uniroma3.diadia.interfacciaComandi.IO;

public class TestableIO implements IO{
	private List<String> righe;
	private List<String> messaggi;
	private String rigaAttuale;

	public TestableIO() {
		this.righe = new ArrayList<String>();
		this.messaggi = new ArrayList<String>();
		this.rigaAttuale = new String();
	}
//output,lo salviamo nella lista messaggi
	public void mostraMessaggio(String messaggio) {
		this.messaggi.add(messaggio);
	}
//metodo IO ogni volta che richiamo leggi riga si dovrebbe aggiornare
	public String leggiRiga() {
		
		
		System.out.println("\nQueste sono le righe immesse"+righe);
		
		return rigaAttuale;
	}

	public List<String> getRighe() {
		return righe;
	}

	public List<String> getMessaggi() {
		return messaggi;
	}
	
	public TestableIO addRiga(String... riga) {
		this.rigaAttuale= riga[0];
		this.righe.addAll(Arrays.asList(riga));
		return this;
	}
	
	public TestableIO addRigaSingola(String riga) {
		this.rigaAttuale = riga;
		this.righe.add(riga);
		return this;
	}
	
	public String getUltimaRiga(){		
		return righe.get(righe.size()-1);
		
	}
	
	public String getUltimoMessaggio(){		
		return messaggi.get(messaggi.size()-1);
		
	}

}