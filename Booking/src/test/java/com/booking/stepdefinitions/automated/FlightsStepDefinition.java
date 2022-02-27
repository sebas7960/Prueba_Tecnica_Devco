package com.booking.stepdefinitions.automated;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import com.booking.model.FlightsData;
import com.booking.tasks.SearchFlight;
import com.booking.questions.FlightResults;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class FlightsStepDefinition {

    @When("the user put flight option")
    public void theUserPutFlightOption(DataTable flightsData) {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchFlight.with(new FlightsData(flightsData)));
    }

    @Then("must visualize flight list result")
    public void mustVisualizeFlightListResult() {
        OnStage.theActorInTheSpotlight().should(seeThat(FlightResults.list()));
    }
}
