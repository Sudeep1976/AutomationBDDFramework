package org.example.StepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.HomePage;

public class MultipleSearchsteps {

   HomePage hp = new HomePage();

    @When("^User search for \"([^\"]*)\"$")
    public void user_search_for(String item)  {
        hp.multipleSearch(item);

    }


    @Then("^User should be able to see result as per search$")
    public void user_should_be_able_to_see_result_as_per_search()  {
    }


}
