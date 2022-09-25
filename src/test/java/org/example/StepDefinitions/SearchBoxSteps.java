package org.example.StepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.HomePage;

public class SearchBoxSteps {

    HomePage hp = new HomePage();

    @When("^User types Biscuit in searchbox and clicks magnifyingglass$")
    public void user_types_Biscuit_in_searchbox_and_clicks_magnifyingglass()  {

        hp.searchBoxType();

    }


    @Then("^User should be able to get all the biscuit products$")
    public void user_should_be_able_to_get_all_the_biscuit_products()  {


    }

}
