package com.booking.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import static com.booking.userinterface.HomePage.TRAVEL_COMMUNITY_MENU;
import static com.booking.userinterface.HomePage.CONTINUE_BTN;
import static com.booking.userinterface.TravelCommunityPage.*;
import com.booking.model.TravelCommunityData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SearchPostCommunity implements Task {

    private TravelCommunityData travelCommunityData;

    public SearchPostCommunity(TravelCommunityData travelCommunityData) {
        this.travelCommunityData = travelCommunityData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(TRAVEL_COMMUNITY_MENU),
                Click.on(SEARCH_FOR_COUNTRY),
                Enter.theValue(travelCommunityData.getCountry()).into(SEARCH_FOR_COUNTRY),
                Click.on(SELECT_COUNTRY.of(travelCommunityData.getCountry())),
                Enter.theValue(travelCommunityData.getSearch()).into(SEARCH_POST),
                Click.on(CONTINUE_BTN),
                Click.on(SELECT_POST.of(travelCommunityData.getSearch())));
    }

    public static SearchPostCommunity with(TravelCommunityData travelCommunityData) {
        return instrumented(SearchPostCommunity.class, travelCommunityData);
    }
}