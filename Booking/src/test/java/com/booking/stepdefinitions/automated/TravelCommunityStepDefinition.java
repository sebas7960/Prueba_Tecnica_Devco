package com.booking.stepdefinitions.automated;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import com.booking.model.TravelCommunityData;
import com.booking.questions.TravelCommunityResults;
import com.booking.tasks.SearchPostCommunity;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class TravelCommunityStepDefinition {

    @When("the user search post opinions for a country")
    public void theUserSearchPostOpinionsForACountry(DataTable postData) {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchPostCommunity.with(new TravelCommunityData(postData)));
    }

    @Then("must visualize post results")
    public void mustVisualizePostResults() {
        OnStage.theActorInTheSpotlight().should(seeThat(TravelCommunityResults.list()));
    }
}
