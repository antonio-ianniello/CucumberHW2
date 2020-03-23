package diadiaHW2CucumberTest;

import it.uniroma3.diadia.DiaDia;
import it.uniroma3.diadia.interfacciaComandi.InterfacciaUtente;

public class DominioHelper {
	
	
	private DiaDia dia;
	private StringheIO interfaccia;
	private FabbricaDiComandiAutomatici fabbrica;


	//instanzia diadia per il test
	public DiaDia getMyDiaDia() {
		if(dia==null) {
		interfaccia= new StringheIO();
		fabbrica = new FabbricaDiComandiAutomatici();
		
		//interfaccia o ce lo butto direttamente come new StringheIO? bho poi si vede
		dia = new DiaDia(interfaccia,fabbrica);
		//dia.gioca();			//mi fa partire il gioco, serve o devo solo iniettare il test? più provabilmente la seconda opzione
		}
		
		return dia;

	}
	
	
	public StringheIO getMyInterfacciaUtente() {
		return this.interfaccia;
	}
	
	public void processa(String istruzioneSingola) {
		this.dia.processaIstruzione(istruzioneSingola);
	}
	
	
	
	
	
}
