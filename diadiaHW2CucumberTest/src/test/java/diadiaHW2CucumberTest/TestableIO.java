package diadiaHW2CucumberTest;
import java.util.ArrayList;
import java.util.List;

import it.uniroma3.diadia.interfacciaComandi.IO;

public class TestableIO implements IO{

	private RigaLetta rigaCorrente;
	private List<RigaLetta> righe;	
	private int indiceRigaLetta=0;


	public TestableIO() {
		this.rigaCorrente = null;
		this.righe = new ArrayList<RigaLetta>();
	}

	public void mostraMessaggio(String messaggio) {
		this.addMessaggio(messaggio);
	}

	public String leggiRiga() {
		this.rigaCorrente = this.righe.get(indiceRigaLetta);
		this.indiceRigaLetta++;		
		return rigaCorrente.getRiga();
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
		if(this.rigaCorrente==null) {
		this.getMessaggioIninziale();
		}
		this.rigaCorrente.getMessaggi().add(messaggio);
		return this;
	}

	public TestableIO addRigaSingola(String riga) {	
		RigaLetta nuovaRiga = new RigaLetta(riga);
		this.righe.add(nuovaRiga);
		return this;
	}

	public List<String> getMessaggiAtRiga(int numeroRiga) {
		return  this.righe.get(numeroRiga).getMessaggi();
	}

	public List<String> getMessaggiFinali(){
		return this.getRighe().get(indiceRigaLetta-1).getMessaggi();
	}


	//aggiunti
	public RigaLetta getRigaCorrente() {
		return rigaCorrente;
	}

	public void setRigaCorrente(RigaLetta rigaCorrente) {
		this.rigaCorrente = rigaCorrente;
	}

	public TestableIO getMessaggioIninziale() {
		this.rigaCorrente = new RigaLetta("fittizia");
		this.righe.add(0, rigaCorrente);
		
		return this;
	}


}