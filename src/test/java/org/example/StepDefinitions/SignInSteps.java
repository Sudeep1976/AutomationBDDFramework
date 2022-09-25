package org.example.StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.HomePage;

public class SignInSteps {

    HomePage hp = new HomePage();


    @Given("^User is on the Homepage$")
    public void user_is_on_the_Homepage()  {
    }

    @When("^User clicks on signin button$")
    public void user_clicks_on_signin_button()  {

        hp.clickSignInButton();

    }

    @Then("^User should be able to divert to signin page$")
    public void user_should_be_able_to_divert_to_signin_page()  {
    }

}
