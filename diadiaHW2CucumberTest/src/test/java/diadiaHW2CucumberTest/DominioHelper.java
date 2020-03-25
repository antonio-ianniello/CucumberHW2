package diadiaHW2CucumberTest;

import it.uniroma3.diadia.DiaDia;
import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.comandi.FabbricaDiComandiFisarmonica;

public class DominioHelper {
	
	
	private DiaDia dia;
	private StringheIO interfaccia;
	private FabbricaDiComandiFisarmonica fabbrica;
	
	
	public DominioHelper() {
		interfaccia= new StringheIO();
		fabbrica = new FabbricaDiComandiFisarmonica(interfaccia);
	}


	//instanzia diadia per il test
	public DiaDia getMyDiaDia() {
		if(dia==null) {		
		//interfaccia o ce lo butto direttamente come new StringheIO? bho poi si vede
		dia = new DiaDia(interfaccia);
		
		}
		
		return dia;

	}
	
	
	public StringheIO getMyInterfacciaUtente() {
		return this.interfaccia;
	}
	
	public void processa(String istruzioneSingola) {
		this.dia.processaIstruzione(istruzioneSingola);
	}
	
	
	//metodi per semplificare la lettura dei test 
	public Stanza getMyStanzaCorrente() {
		return this.getMyDiaDia().getPartita().getLabirinto().getStanzaCorrente();
	}
	
	
	public FabbricaDiComandiFisarmonica myFabbrica() {
		return this.fabbrica;
	}
	
	
	
	
	
}
