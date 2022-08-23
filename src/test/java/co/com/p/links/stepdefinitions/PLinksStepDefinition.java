package co.com.p.links.stepdefinitions;

import co.com.p.links.tasks.SelectLinks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class PLinksStepDefinition {

    @Given("that {string} opens the browser and enter the page {string}")
    public void that_opens_the_browser_and_enter_the_page(String nameactor, String url) {
        setTheStage(new OnlineCast());
        theActorCalled(nameactor).wasAbleTo(Open.url(url));
    }

    @When("she selects the element option and the category Links with the links")
    public void she_selects_the_element_option_and_the_category_links_with_the_links(Map<String,String> mapSelectLinks) {
        theActorInTheSpotlight().attemptsTo(SelectLinks.inThePage(mapSelectLinks));
    }
    @Then("she should see the new tab or text in the screen")
    public void she_should_see_the_new_tab_or_text_in_the_screen(Map<String,String> mapSelectLinks) {

    }
    }
