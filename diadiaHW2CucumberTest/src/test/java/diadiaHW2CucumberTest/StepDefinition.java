package diadiaHW2CucumberTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import it.uniroma3.diadia.ambienti.StanzaBuia;

public class StepDefinition {
	/*DominioHelper helper;
	String comando;
	List <String> comandi;
	
	
	@Given("^I am in atrio$")
	public void i_am_in_atrio() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	helper = new DominioHelper();
	helper.getMyDiaDia();		
	}

	@Given("^I start the game$")
	public void i_start_the_game() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    comando = new String();
	    comandi = new ArrayList<String>();
	}

	@When("^digit command(\\d+)\"([^\"]*)\"$")
	public void digit_command(int arg1, String aiuto) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
	comando = aiuto;
	helper.getMyInterfacciaUtente().setComandoAttuale(comando);
	}

	@Then("^I am in the atrio and i have digitated \"([^\"]*)\"$")
	public void i_am_in_the_and_i_have_digitated(String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(comando,helper.getMyInterfacciaUtente().getComandoAttuale());
	}
	
	//scenario2
	@When("^I digit command(\\d+) \"([^\"]*)\" and command(\\d+) \"([^\"]*)\"$")
	public void i_digit_command_and_command(int arg1, String vai, int arg3, String est) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    helper.getMyInterfacciaUtente().costruisciIstruzione(vai,est);
	}
	
	@Then("^I am in the n(\\d+) and i have digitated \"([^\"]*)\"$")
	public void i_am_in_the_n_and_i_have_digitated(int arg1, String comando2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	assertTrue(helper.getMyInterfacciaUtente().getParametroAttuale().equals(comando2));	//ultimo comando deve essere est
	
	//elenco comandi digitati--> vai,est
	comandi.addAll(helper.getMyInterfacciaUtente().getComandiDigitati());
	
	assertTrue(comandi.contains("vai") && comandi.contains(comando2));
	
	
	}


*/
	DominioHelper helper;

	List <String> comandi;
	
	
	
	@Given("^I am in \"([^\"]*)\"$")
	public void i_am_in(String stanzaDiPartenza) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    helper = new DominioHelper();
	    helper.getMyDiaDia();
	    assertEquals(stanzaDiPartenza,helper.getMyStanzaCorrente().getNome());
	}

	@Given("^I start the game$")
	public void i_start_the_game() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
	    comandi = new ArrayList<String>();
	}

	@When("^I digit command(\\d+) \"([^\"]*)\" and command(\\d+)\"([^\"]*)\"$")
	public void i_digit_command_and_command(int arg1, String comandoIniettato, int arg3, String parametroIniettato) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		   
		 // helper.getMyInterfacciaUtente().setNomeIstruzione(comandoIniettato);
		 // helper.getMyInterfacciaUtente().setNomeParametro(parametroIniettato);
		   
		 helper.getMyInterfacciaUtente().setInteraStringa(comandoIniettato+" "+parametroIniettato);
		 
		 //processa in automatico la stringa corretta formata dai domandi in input al test
		 helper.processa(comandoIniettato+" "+parametroIniettato);		//processa qualsiasi comando digitato correttamente
		   
		   
	}
	

	@Then("^I am in the \"([^\"]*)\" and i have digitated \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_am_in_the_and_i_have_digitated_and(String stanzaDiArrivo, String comando, String parametroIniettato) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(stanzaDiArrivo,helper.getMyStanzaCorrente().getNome());
	    
	    //comando e parametro iniettato sono gli ulti comandi inseriti
	    assertEquals(comando,helper.getMyInterfacciaUtente().getNomeIstruzione());
	    assertEquals(parametroIniettato,helper.getMyInterfacciaUtente().getNomeParamaetro());
	    
	   
	    
	    
	}

	
	
}
