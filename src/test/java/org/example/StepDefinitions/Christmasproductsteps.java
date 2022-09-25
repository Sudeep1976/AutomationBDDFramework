package org.example.StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.Christmasproductpage;

public class Christmasproductsteps {

    Christmasproductpage cp = new Christmasproductpage();

    @Given("^User is on the webpage where user can see all the christmas products$")
    public void user_is_on_the_webpage_where_user_can_see_all_the_christmas_products()  {
    }

    @When("^User clicks on add to basket button for mince pies$")
    public void user_clicks_on_add_to_basket_button_for_mince_pies() throws InterruptedException {

        cp.clearpopupmsg();
        cp.clickaddTobasket();

    }

    @Then("^User should be able to add the product into the basket$")
    public void user_should_be_able_to_add_the_product_into_the_basket()  {
    }

}
