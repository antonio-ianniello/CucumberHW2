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

	@When("^ho digitato il comando finale \"([^\"]*)\"$")
	public void avendo_digitato_il_comando_finale(String riga) throws Throwable {		
		helper.getMyInterfacciaUtente().addRigaSingola(riga);
		helper.getMyInterfacciaUtente().addRigaSingola("fine");		//problema, quando inserisco più comandi
	}

	@When("^ho digitato il comando non finale \"([^\"]*)\"$")
	public void ho_digitato_il_comando_non_finale(String riga) throws Throwable {
		helper.getMyInterfacciaUtente().addRigaSingola(riga);
		
	}
	
	@When("^avere aspettato la fine della simulazione$")
	public void avere_aspettato_la_fine_della_simulazione() throws Throwable {
		this.helper.getMyDiaDia();
		System.out.println(helper.getMyInterfacciaUtente().getRighe());
	}


	@Then("^il risultato della esecuzione fine dovrebbe contenere \"([^\"]*)\"$")
	public void il_risultato_della_esecuzione_fine_dovrebbe_contenere(String stringaOutput) throws Throwable {
		System.out.println(helper.getMyInterfacciaUtente().getMessaggi());
		assertTrue(this.helper.getMyInterfacciaUtente().getUltimoMessaggio().contains(stringaOutput));		
	}

	@Then("^il risultato della esecuzione dovrebbe contenere \"([^\"]*)\"$")
	public void il_risultato_della_esecuzione_dovrebbe_contenere(String stringaOutput) throws Throwable {
		System.out.println(helper.getMyInterfacciaUtente().getMessaggi());
		assertTrue(this.helper.getMyInterfacciaUtente().getPenultimoMessaggio().contains(stringaOutput));		//penultimo messaggio		
	}

	@Then("^il risultato della nostra esecuzione dovrebbe contenere \"([^\"]*)\" e \"([^\"]*)\" e \"([^\"]*)\" e \"([^\"]*)\" e \"([^\"]*)\"$")
	public void il_risultato_della_nostra_esecuzione_dovrebbe_contenere_e_e_e_e(String cmd1, String cmd2, String cmd3, String cmd4, String cmd5) throws Throwable {
		System.out.println(helper.getMyInterfacciaUtente().getMessaggi());

		assertTrue(this.helper.getMyInterfacciaUtente().getPenultimoMessaggio().contains(cmd1));
		assertTrue(this.helper.getMyInterfacciaUtente().getPenultimoMessaggio().contains(cmd2));
		assertTrue(this.helper.getMyInterfacciaUtente().getPenultimoMessaggio().contains(cmd3));
		assertTrue(this.helper.getMyInterfacciaUtente().getPenultimoMessaggio().contains(cmd4));
		assertTrue(this.helper.getMyInterfacciaUtente().getPenultimoMessaggio().contains(cmd5));
	}
}
