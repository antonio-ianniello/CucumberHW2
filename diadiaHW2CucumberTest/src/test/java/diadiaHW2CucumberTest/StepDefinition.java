package diadiaHW2CucumberTest;
import static org.junit.Assert.assertTrue;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {	
	DominioHelper helper;	

	@Given("^Ho iniziato la partita$")
	public void ho_iniziato_la_partita() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		helper = new DominioHelper();
	}

	@When("^ho digitato \"([^\"]*)\"$")
	public void ho_digitato(String riga) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		helper.getMyInterfacciaUtente().addRigaSingola(riga);
	}

	@When("^il programma ha stampato\"([^\"]*)\"$")
	public void il_programma_ha_stampato(String messaggio_stampato) throws Throwable {
		//vuoto a questo punto il messaggio non è in lista
	}

	@When("^la partita e finita$")
	public void la_partita_e_finita() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		this.helper.getMyDiaDia();
		System.out.println("\n RIGHE INPUT SONO: \n"+helper.getMyInterfacciaUtente().getRighe());
	}

	@Then("^il programma ha stampato \"([^\"]*)\" e \"([^\"]*)\" e \"([^\"]*)\" e \"([^\"]*)\" e \"([^\"]*)\" e \"([^\"]*)\"$")
	public void il_programma_ha_stampato_e_e_e_e_e(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("\n MESSAGGI OUTPUT SONO: \n"+helper.getMyInterfacciaUtente().getMessaggi());
		assertTrue(this.helper.getMyInterfacciaUtente().getMessaggi().contains(arg1));	
		assertTrue(this.helper.getMyInterfacciaUtente().getMessaggi().contains(arg2));
		assertTrue(this.helper.getMyInterfacciaUtente().getMessaggi().contains(arg3));
		assertTrue(this.helper.getMyInterfacciaUtente().getMessaggi().contains(arg4));
		assertTrue(this.helper.getMyInterfacciaUtente().getMessaggi().contains(arg5));
		assertTrue(this.helper.getMyInterfacciaUtente().getMessaggi().contains(arg6));
	}

	@Then("^il programma ha stampato \"([^\"]*)\"$")
	public void il_programma_ha_stampato1(String stringaOutput) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("\n MESSAGGI OUTPUT SONO: \n"+helper.getMyInterfacciaUtente().getMessaggi());
		assertTrue(this.helper.getMyInterfacciaUtente().getMessaggi().contains(stringaOutput));

	}

	@Then("^il \"([^\"]*)\" messaggio stampato e \"([^\"]*)\"$")
	public void il_messaggio_stampato_e(int indice, String messaggio) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		assertTrue(this.helper.getMyInterfacciaUtente().getMessaggioAtIndex(indice).contains(messaggio));
	}
}