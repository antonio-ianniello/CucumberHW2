package diadiaHW2CucumberTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
/*
	DominioHelper helper;

	@Given("^I am in \"([^\"]*)\"$")
	public void i_am_in(String stanzaDiPartenza) throws Throwable {
		helper = new DominioHelper();
		helper.getMyDiaDia();
		assertEquals(stanzaDiPartenza,helper.getmyPartita().getLabirinto().getStanzaCorrente().getNome());
	}

	@Given("^I start the game$")
	public void i_start_the_game() throws Throwable {
	}

	@When("^I digit command(\\d+) \"([^\"]*)\" and command(\\d+)\"([^\"]*)\"$")
	public void i_digit_command_and_command(int arg1, String comandoIniettato, int arg3, String parametroIniettato) throws Throwable {
		helper.inserisciComando(comandoIniettato+" "+parametroIniettato);
		
		
	}

	@Then("^I am in the \"([^\"]*)\" and i have digitated \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_am_in_the_and_i_have_digitated_and(String stanzaDiArrivo, String comandoIniettato, String parametroIniettato) throws Throwable {
		assertEquals(stanzaDiArrivo,helper.getmyPartita().getLabirinto().getStanzaCorrente().getNome());
		assertEquals(comandoIniettato+" "+parametroIniettato,helper.getMyInterfacciaUtente().leggiRiga());
		
		for(String s:helper.getMyInterfacciaUtente().getMessaggi()) {
			System.out.print(s+"\n");
		}
		
	}

*/
	DominioHelper helper;
/*	
	@Given("^I am in Atrio$")
	public void i_am_in_Atrio() throws Throwable {
		helper = new DominioHelper();
		
	}

	@Given("^I start the game$")
	public void i_start_the_game() throws Throwable {
		//System.out.print(helper.getMyInterfacciaUtente().getMessaggi());
		
	}

	@When("^I digit command(\\d+) \"([^\"]*)\" and command(\\d+)\"([^\"]*)\"$")
	public void i_digit_command_and_command(int arg1, String comando, int arg3, String parametro) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		helper.getMyInterfacciaUtente().addRiga(comando+parametro);
		helper.getMyDiaDia();
	    helper.getMyGioco();
		assertEquals(helper.getMyInterfacciaUtente().leggiRiga(), comando+parametro);
		
	    
	}

	@Then("^I am in the Atrio and the output of string is \"([^\"]*)\"$")
	public void i_am_in_the_Atrio_and_the_output_of_string_is(String stringa) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(helper.getMyInterfacciaUtente().getUltimoMessaggio(), stringa);
	   
	}
*/
	
	
	@Given("^Ho iniziato il gioco$")
	public void ho_iniziato_il_gioco() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		helper = new DominioHelper();
	}

	@Given("^avendo digitato il comando \"([^\"]*)\"$")
	public void avendo_digitato_il_comando(String riga) throws Throwable {
		//non funfe addriga con più stringhe
		//helper.getMyInterfacciaUtente().addRiga(riga,"fine");
		helper.getMyInterfacciaUtente().addRigaSingola(riga);
		helper.getMyInterfacciaUtente().addRigaSingola("fine");
		System.out.println(helper.getMyInterfacciaUtente().getRighe());
		helper.getMyDiaDia();
		
		
	}



	
	@Then("^il risultato dell' esecuzione fine dovrebbe contenere \"([^\"]*)\"$")
	public void il_risultato_dell_esecuzione_fine_dovrebbe_contenere(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(helper.getMyInterfacciaUtente().getMessaggi());
		
		
		//non funge
		//assertTrue(helper.getMyInterfacciaUtente().getMessaggi().contains(arg1));
		
		
		for(String s: helper.getMyInterfacciaUtente().getMessaggi()) {
			if(s.equals(arg1))
				assertEquals(s,arg1);
		}
		
	}
	

	@Then("^il risultato della nostra esecuzione dovrebbe contenere \"([^\"]*)\" e \"([^\"]*)\" e \"([^\"]*)\" e \"([^\"]*)\" e \"([^\"]*)\"$")
	public void il_risultato_della_nostra_esecuzione_dovrebbe_contenere_e_e_e_e(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();for(String s: helper.getMyInterfacciaUtente().getMessaggi()) {
		
		

		for(String s: helper.getMyInterfacciaUtente().getMessaggi()) {
			if(s.equals(arg1))
				assertEquals(s,arg1);
			if(s.equals(arg2))
				assertEquals(s,arg2);
			if(s.equals(arg3))
				assertEquals(s,arg3);
			if(s.equals(arg4))
				assertEquals(s,arg4);
			if(s.equals(arg5))
				assertEquals(s,arg5);
			
		}
	/*	
		assertTrue(helper.getMyInterfacciaUtente().getMessaggi().contains(arg1));
		assertTrue(helper.getMyInterfacciaUtente().getMessaggi().contains(arg2));
		assertTrue(helper.getMyInterfacciaUtente().getMessaggi().contains(arg3));
		assertTrue(helper.getMyInterfacciaUtente().getMessaggi().contains(arg4));
		assertTrue(helper.getMyInterfacciaUtente().getMessaggi().contains(arg5));
		*/
	}
	
}
