package diadiaHW2CucumberTest;
import java.util.ArrayList;
import java.util.List;
import it.uniroma3.diadia.interfacciaComandi.IO;

public class TestableIO implements IO{
	private List<String> righe;
	private List<String> messaggi;
	private String rigaAttuale;
	private int index=0;

	public TestableIO() {
		this.righe = new ArrayList<String>();
		this.messaggi = new ArrayList<String>();
		this.rigaAttuale = new String();		
	}

	public void mostraMessaggio(String messaggio) {
		this.addMessaggio(messaggio);
	}

	public String leggiRiga() {			
		this.rigaAttuale = this.righe.get(index);
		this.index++;
		return rigaAttuale;
	}

	public List<String> getRighe() {
		return this.righe;
	}

	public List<String> getMessaggi() {
		return this.messaggi;
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
		this.righe.add(riga);
		return this;
	}

	public String getUltimoMessaggio() {
		return this.getMessaggi().get(this.messaggi.size()-1);
	}

	public String getMessaggioAtIndex(int index) {
		return this.getMessaggi().get(index);
	}
}