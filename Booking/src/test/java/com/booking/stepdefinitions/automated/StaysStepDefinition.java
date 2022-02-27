package com.booking.stepdefinitions.automated;

import static com.booking.utils.Urls.BOOKING_PAGE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import com.booking.model.StaysData;
import com.booking.questions.StaysResults;
import com.booking.tasks.SearchStay;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class StaysStepDefinition {

    @Before
    public void before() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Booking tester");
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(BOOKING_PAGE.getUrl()));
    }

    @When("the user put stay option")
    public void theUserPutStayOption(DataTable staysDataFilter) {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchStay.with(new StaysData(staysDataFilter)));
    }

    @Then("must visualize stays list result")
    public void mustVisualizeStaysListResult() {
        OnStage.theActorInTheSpotlight().should(seeThat(StaysResults.list()));
    }
}
