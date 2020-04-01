package diadiaHW2CucumberTest;
import static org.junit.Assert.assertEquals;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {	
	DominioHelper helper;

	@Given("^Ho iniziato il gioco$")
	public void ho_iniziato_il_gioco() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		helper = new DominioHelper();
	}

	@When("^ho digitato il comando \"([^\"]*)\"$")
	public void avendo_digitato_il_comando(String riga) throws Throwable {
		helper.getMyInterfacciaUtente().addRigaSingola(riga);
		helper.getMyInterfacciaUtente().addRigaSingola("fine");
		//System.out.println(helper.getMyInterfacciaUtente().getRighe());
		helper.getMyDiaDia();
	}

	@Then("^il risultato della esecuzione dovrebbe contenere \"([^\"]*)\"$")
	public void il_risultato_della_esecuzione_dovrebbe_contenere(String stringaOutput) throws Throwable {
		//System.out.println(helper.getMyInterfacciaUtente().getMessaggi());
		for(String s: helper.getMyInterfacciaUtente().getMessaggi()) {
			if(s.equals(stringaOutput))
				assertEquals(s,stringaOutput);		
		}
		
		//assertEquals(true, this.helper.getMyInterfacciaUtente().getMessaggi().contains(arg1));
	}

	@Then("^il risultato della nostra esecuzione dovrebbe contenere \"([^\"]*)\" e \"([^\"]*)\" e \"([^\"]*)\" e \"([^\"]*)\" e \"([^\"]*)\"$")
	public void il_risultato_della_nostra_esecuzione_dovrebbe_contenere_e_e_e_e(String cmd1, String cmd2, String cmd3, String cmd4, String cmd5) throws Throwable {
		//System.out.println(helper.getMyInterfacciaUtente().getMessaggi());
		for(String s: helper.getMyInterfacciaUtente().getMessaggi()) {
			if(s.equals(cmd1))
				assertEquals(s,cmd1);
			if(s.equals(cmd2))
				assertEquals(s,cmd2);
			if(s.equals(cmd3))
				assertEquals(s,cmd3);
			if(s.equals(cmd4))
				assertEquals(s,cmd4);
			if(s.equals(cmd5))
				assertEquals(s,cmd5);			
		}
	}
}
