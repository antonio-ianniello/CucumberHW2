package diadiaHW2CucumberTest;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import it.uniroma3.diadia.DiaDia;

public class StepDefinition {	
		
	TestableIO interfaccia;
	DiaDia dia ;

	@Given("^Ho iniziato la partita$")
	public void ho_iniziato_la_partita() throws Throwable {
		interfaccia = new TestableIO();
	}

	@When("^ho digitato \"([^\"]*)\"$")
	public void ho_digitato(String riga) throws Throwable {
		this.getMyInterfacciaUtente().addRigaSingola(riga);
	}

	@When("^il programma ha stampato\"([^\"]*)\"$")
	public void il_programma_ha_stampato(String messaggio_stampato) throws Throwable {
		//vuoto a questo punto il messaggio non è in lista
	}

	@When("^la partita e finita$")
	public void la_partita_e_finita() throws Throwable {
		this.dia = new DiaDia(interfaccia);
		this.dia.gioca();
		System.out.println("\n RIGHE INPUT SONO: \n"+this.getMyInterfacciaUtente().getRighe());
	}

	@Then("^il programma ha stampato \"([^\"]*)\" e \"([^\"]*)\" e \"([^\"]*)\" e \"([^\"]*)\" e \"([^\"]*)\" e \"([^\"]*)\"$")
	public void il_programma_ha_stampato_e_e_e_e_e(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("\n MESSAGGI OUTPUT SONO: \n"+this.getMyInterfacciaUtente().getMessaggi());
		assertTrue(this.getMyInterfacciaUtente().getMessaggi().contains(arg1));	
		assertTrue(this.getMyInterfacciaUtente().getMessaggi().contains(arg2));
		assertTrue(this.getMyInterfacciaUtente().getMessaggi().contains(arg3));
		assertTrue(this.getMyInterfacciaUtente().getMessaggi().contains(arg4));
		assertTrue(this.getMyInterfacciaUtente().getMessaggi().contains(arg5));
		assertTrue(this.getMyInterfacciaUtente().getMessaggi().contains(arg6));
	}

	@Then("^il programma ha stampato \"([^\"]*)\"$")
	public void il_programma_ha_stampato1(String stringaOutput) throws Throwable {	
		System.out.println("\n MESSAGGI OUTPUT SONO: \n"+this.getMyInterfacciaUtente().getMessaggi());
		assertTrue(this.getMyInterfacciaUtente().getMessaggi().contains(stringaOutput));

	}

	@Then("^il \"([^\"]*)\" messaggio stampato e \"([^\"]*)\"$")
	public void il_messaggio_stampato_e(int indice, String messaggio) throws Throwable {
		assertEquals(true,this.getMyInterfacciaUtente().getMessaggioAtIndex(indice).contains(messaggio));
	}
	

	public TestableIO getMyInterfacciaUtente() {
		return this.interfaccia;
	}
}