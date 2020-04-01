package diadiaHW2CucumberTest;
import it.uniroma3.diadia.DiaDia;

public class DominioHelper {
	private DiaDia dia;
	private TestableIO interfaccia;


	public DominioHelper() {
		interfaccia= new TestableIO();
		}

	public DiaDia getMyDiaDia() {
		if(dia==null) {		
			this.dia = new DiaDia(interfaccia);
			this.dia.gioca();
		}
		return dia;
	}

	public TestableIO getMyInterfacciaUtente() {
		return this.interfaccia;
	}

}
