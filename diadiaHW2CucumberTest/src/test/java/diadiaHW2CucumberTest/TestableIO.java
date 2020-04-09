package diadiaHW2CucumberTest;
import java.util.ArrayList;
import java.util.List;

import it.uniroma3.diadia.interfacciaComandi.IO;

public class TestableIO implements IO{

	private RigaLetta rigaAttuale;
	private List<RigaLetta> righe;	
	private int indiceRigaLetta=0;


	public TestableIO() {
		this.rigaAttuale = new RigaLetta();
		this.righe = new ArrayList<RigaLetta>();
	}

	public void mostraMessaggio(String messaggio) {
		this.addMessaggio(messaggio);
	}

	public String leggiRiga() {
		this.rigaAttuale = this.righe.get(indiceRigaLetta);
		this.indiceRigaLetta++;		
		return rigaAttuale.getRiga();
	}

	public List<RigaLetta> getRighe() {
		return this.righe;
	}

	public List<String> getMessaggi() {
		List<String> messaggi = new ArrayList<String>();

		for(RigaLetta r: this.righe) {
			messaggi.addAll(r.getMessaggi());
		}
		return messaggi;
	}

	public TestableIO addMessaggio(String messaggio) {	
		this.rigaAttuale.getMessaggi().add(messaggio);
		return this;
	}

	public TestableIO addRigaSingola(String riga) {	
		RigaLetta nuovaRiga = new RigaLetta(riga);
		this.righe.add(nuovaRiga);
		return this;
	}

	public List<String> getMessaggiAtRiga(int numeroRiga) {
		return  this.righe.get(numeroRiga-1).getMessaggi();
	}

	public List<String> getMessaggiFinali(){

		return this.getRighe().get(indiceRigaLetta-1).getMessaggi();
	}
}