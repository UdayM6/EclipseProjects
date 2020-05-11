package stepdefinitions;

import org.junit.runner.RunWith;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
public class StepDefinition {

	@Given("^User is on Netbanking landing page$")
	public void user_is_on_netbanking_landing_page() {
		System.out.println("User is on Netbanking landing page");
	}
	
	@When("^User login to app with uname and password$")
	public void user_login_to_app_with_uname_and_password() {
		System.out.println("User login to app with uname and password");
	}
	
	@Then("^Home page is populated$")
	public void home_page_is_populated() {
		System.out.println("Home page is populated");
	}
	
	 @And("^cards are displayed$")
	 public void cards_are_displayed() {
		 System.out.println("cards are displayed");
	 }
}
