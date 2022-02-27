package com.booking.stepdefinitions.automated;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import com.booking.model.CarRentalData;
import com.booking.questions.CarRentalResults;
import com.booking.tasks.SearchCarRental;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class CarRentalsStepDefinition {

    @When("the user put car description")
    public void theUserPutCarDescription(DataTable carRentalData) {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchCarRental.with(new CarRentalData(carRentalData)));

    }

    @Then("must visualize cars list result")
    public void mustVisualizeCarsListResult() {
        OnStage.theActorInTheSpotlight().should(seeThat(CarRentalResults.list()));
    }

}