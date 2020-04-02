package diadiaHW2CucumberTest;
import java.util.ArrayList;
import java.util.List;

import it.uniroma3.diadia.interfacciaComandi.IO;

public class TestableIO implements IO{
	private List<String> righe;
	private List<String> messaggi;
	private String rigaAttuale;
	//private String messaggioAttuale;

	public TestableIO() {
		this.righe = new ArrayList<String>();
		this.messaggi = new ArrayList<String>();
		this.rigaAttuale = new String();
		//this.messaggioAttuale = new String();
	}

	public void mostraMessaggio(String messaggio) {
		this.addMessaggio(messaggio);
	}

	public String leggiRiga() {			
		return rigaAttuale;
	}

	public List<String> getRighe() {
		return righe;
	}

	public List<String> getMessaggi() {
		return messaggi;
	}
	
	public TestableIO addMessaggio(String messaggio) {
		this.messaggi.add(messaggio);
		return this;
		
	}
/*
	public TestableIO addRiga(String... riga) {			//purtroppo dovrei usare List<String> in java come parametro e DataTable in cucumber
		this.rigaAttuale= riga[0];
		this.righe.addAll(Arrays.asList(riga));
		return this;
	}
*/
	public TestableIO addRigaSingola(String riga) {
		this.rigaAttuale = riga;
		this.righe.add(riga);
		return this;
	}

	public String getUltimaRiga(){		
		return righe.get(righe.size()-1);		
	}

	//attenzione, c' è il problema del comando fine da inserire all' ultimo
	public String getUltimoMessaggio(){		
		return messaggi.get(messaggi.size()-1);

	}
	

	public String getPenultimoMessaggio() {
		
		return this.messaggi.get(messaggi.size()-2);
	}
}