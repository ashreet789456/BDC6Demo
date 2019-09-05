package bdcstepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Demo_01_02_definiions {
	@Given("user acess the sign-up page")
	public void user_acess_the_sign_up_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("user acess the sign-up page");
	}

	@Given("gets the credentials")
	public void gets_the_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("gets the credentials");
	}

	@Given("user has valid account creds for DemoWebshop")
	public void user_has_valid_account_creds_for_DemoWebshop() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("user has valid account creds for DemoWebshop");
	}

	@Given("provide the valid creds")
	public void provide_the_valid_creds() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("provide the valid creds");
	}

	@Then("verifies the state for the login status")
	public void verifies_the_state_for_the_login_status() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("verifies the state for the login status");
	}

}
