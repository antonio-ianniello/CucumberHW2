package diadiaHW2CucumberTest;
import static org.junit.Assert.assertTrue;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {	
	DominioHelper helper;		

	@Given("^Ho iniziato il gioco$")
	public void ho_iniziato_il_gioco() throws Throwable {
		helper = new DominioHelper();
	}

	@When("^ho digitato il comando \"([^\"]*)\"$")
	public void ho_digitato_il_comando(String riga) throws Throwable {
		helper.getMyInterfacciaUtente().addRigaSingola(riga);
	}
	
	@When("^avere aspettato la fine della simulazione$")
	public void avere_aspettato_la_fine_della_simulazione() throws Throwable {	
		this.helper.getMyDiaDia();
		System.out.println("\n RIGHE INPUT SONO: \n"+helper.getMyInterfacciaUtente().getRighe());		
	}

	@Then("^il risultato della esecuzione dovrebbe contenere \"([^\"]*)\"$")
	public void il_risultato_della_esecuzione_dovrebbe_contenere(String stringaOutput) throws Throwable {
		System.out.println("\n MESSAGGI OUTPUT SONO: \n"+helper.getMyInterfacciaUtente().getMessaggi());
		assertTrue(this.helper.getMyInterfacciaUtente().getMessaggi().contains(stringaOutput));		//penultimo messaggio		
	}

	@Then("^il risultato della nostra esecuzione dovrebbe contenere \"([^\"]*)\" e \"([^\"]*)\" e \"([^\"]*)\" e \"([^\"]*)\" e \"([^\"]*)\" e \"([^\"]*)\"$")
	public void il_risultato_della_nostra_esecuzione_dovrebbe_contenere_e_e_e_e_e(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
	    System.out.println("\n MESSAGGI OUTPUT SONO: \n"+helper.getMyInterfacciaUtente().getMessaggi());		    
		assertTrue(this.helper.getMyInterfacciaUtente().getMessaggi().contains(arg1));	
		assertTrue(this.helper.getMyInterfacciaUtente().getMessaggi().contains(arg2));
		assertTrue(this.helper.getMyInterfacciaUtente().getMessaggi().contains(arg3));
		assertTrue(this.helper.getMyInterfacciaUtente().getMessaggi().contains(arg4));
		assertTrue(this.helper.getMyInterfacciaUtente().getMessaggi().contains(arg5));
		assertTrue(this.helper.getMyInterfacciaUtente().getMessaggi().contains(arg6));
	}
}