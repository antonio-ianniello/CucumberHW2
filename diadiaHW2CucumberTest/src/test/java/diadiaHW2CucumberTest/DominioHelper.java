package diadiaHW2CucumberTest;

import it.uniroma3.diadia.DiaDia;
import it.uniroma3.diadia.interfacciaComandi.ScrittoreAutomaticoComandi;

public class DominioHelper {
	
	
	private DiaDia dia;


	
	public DiaDia getMyDiaDia() {
		if(dia==null) {
	
		dia = new DiaDia(new StringheIO());
		}
		
		return dia;

	}
	
	
	
	
	
}
