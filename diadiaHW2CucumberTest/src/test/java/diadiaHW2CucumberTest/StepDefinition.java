package diadiaHW2CucumberTest;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	@Given("^I am in atrio$")
	public void i_am_in_atrio() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.print("atrio");
	}

	@Given("^I start the game$")
	public void i_start_the_game() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.print("atrio");
	}

	@When("^digit command(\\d+)\"([^\"]*)\" and command(\\d+)\"([^\"]*)\"$")
	public void digit_command_and_command(int arg1, String arg2, int arg3, String arg4) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.print("atrio");
	}

	@Then("^I am in the Winner Room$")
	public void i_am_in_the_Winner_Room() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.print("atrio");
	}

	@Then("^I win the game$")
	public void i_win_the_game() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.print("atrio");
	}


}
