package step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition {
	@Given("Open the Firefox and launch the application") 
	public void open_the_firefox_and_launch_the_application() {
		System.out.println("This Step open the Firefox and launch the application.");

	}

	@When("Enter the Username and Password")
	public void enter_the_username_and_password() {
		System.out.println("This step enter the Username and Password on the login page.");
		
	}

	@Then("Reset the credential") 
	public void reset_the_credential() {
	    
		System.out.println("This step click on the Reset button.");
		

	}
}
