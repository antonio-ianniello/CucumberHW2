package diadiaHW2CucumberTest;
import java.util.ArrayList;
import java.util.List;

import it.uniroma3.diadia.interfacciaComandi.IO;

public class TestableIO implements IO{

	private RigaLetta rigaCorrente;
	private List<RigaLetta> righe;	
	private int indiceRigaLetta=0;
	private List<String> messaggiIniziali ;

	public TestableIO() {
		this.rigaCorrente = new RigaLetta();
		this.righe = new ArrayList<RigaLetta>();
		this.messaggiIniziali= new ArrayList<String>();
	}

	public void mostraMessaggio(String messaggio) {
		if(this.indiceRigaLetta==0)
			this.setMessaggioIninziale(messaggio);
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
		
		if(this.messaggiIniziali.size()>0)
			messaggi.add(this.getMessaggioIninziale().toString());
		for(RigaLetta r: this.righe) {
			messaggi.addAll(r.getMessaggi());
		}
		return messaggi;
	}

	public TestableIO addMessaggio(String messaggio) {

		this.rigaCorrente.getMessaggi().add(messaggio);		
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


	//aggiunti
	public RigaLetta getRigaCorrente() {
		return rigaCorrente;
	}

	public void setRigaCorrente(RigaLetta rigaCorrente) {
		this.rigaCorrente = rigaCorrente;
	}

	public List<String> getMessaggioIninziale() {
		return this.messaggiIniziali;
	}	

	private void setMessaggioIninziale(String messaggioIniziale) {
		this.messaggiIniziali.add(messaggioIniziale);
		
	}
}