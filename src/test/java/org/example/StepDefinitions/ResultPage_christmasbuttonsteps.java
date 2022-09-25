package org.example.StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.ResultPage;

public class ResultPage_christmasbuttonsteps {

    ResultPage rp = new ResultPage();

    @Given("^User is on the result page$")
    public void user_is_on_the_result_page()  {
    }

    @When("^User clicks on christmas button$")
    public void user_clicks_on_christmas_button()  {

        rp.clickchristmasbutton();
    }

    @Then("^User should be able to see all the christmas products$")
    public void user_should_be_able_to_see_all_the_christmas_products()  {
    }


}
