package com.booking.stepdefinitions.automated;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import com.booking.model.PartnerHubData;
import com.booking.questions.PartnerHubResults;
import com.booking.tasks.SearchPartnerHub;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class PartnerHubStepDefinition {

    @When("the user put the doubt")
    public void theUserPutTheDoubt(DataTable searchPartnerHub) {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchPartnerHub.with(new PartnerHubData(searchPartnerHub)));
    }
    @Then("must visualize the partner result")
    public void mustVisualizeThePartnerResult() {
        OnStage.theActorInTheSpotlight().should(seeThat(PartnerHubResults.description()));
    }
}
