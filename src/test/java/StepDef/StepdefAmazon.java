package StepDef;

import BaseClass.BaseClassAmazon;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepdefAmazon extends BaseClassAmazon {
	@Given("User Launch URL")
	public void user_launch_url() {
		getURL("https://www.amazon.in/"); 
	}
	@When("User Sing in the account Valid Email and Password")
	public void user_sing_in_the_account_valid_email_and_password() {    
	}

	@Then("User Click the Sign in Button")
	public void user_click_the_sign_in_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User click on Women dress and select the tops option and select the jackets option")
	public void user_click_on_women_dress_and_select_the_tops_option_and_select_the_jackets_option() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
}
