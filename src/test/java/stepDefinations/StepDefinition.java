package stepDefinations;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

import org.junit.runner.RunWith;


import io.cucumber.java.en.And;



@RunWith(Cucumber.class)
public class StepDefinition {

	@Given("^User is on Landing Page$")
	public void user_is_on_Landing_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user open the login page");
	    
	}

	 @When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_login_into_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
		System.out.println(strArg1);
		System.out.println(strArg2);
	    
	}

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user successfuly open the home page");
	   
	}


    @And("^Cards are Displayed are \"([^\"]*)\"$")
    public void cards_are_displayed_are_something(String strArg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(strArg1);
	    
	}
    @And("^Cards are Displayed \"([^\"]*)\"$")
    public void cards_are_displayed_something(String strArg1) throws Throwable {
    	System.out.println(strArg1);
    }



}