package diadiaHW2CucumberTest;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	DominioHelper helper;
	String comando;
	
	
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
	}

	@When("^digit command(\\d+)\"([^\"]*)\"$")
	public void digit_command(int arg1, String aiuto) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
	comando = aiuto;
	}

	@Then("^I am in the atrio and i have digitated \"([^\"]*)\"$")
	public void i_am_in_the_and_i_have_digitated(String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(comando,helper.getMyDiaDia().getIO().getScrittoreAutomatico().getComandoInserito(0));
	}


}
