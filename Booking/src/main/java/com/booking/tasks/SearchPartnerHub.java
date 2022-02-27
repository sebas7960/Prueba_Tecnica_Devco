package com.booking.tasks;

import static com.booking.userinterface.HomePage.PARTNER_HELP_MENU;
import static com.booking.userinterface.PartnerHubPage.*;

import com.booking.model.PartnerHubData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchPartnerHub implements Task {

    private PartnerHubData partnerHubData;

    public SearchPartnerHub(PartnerHubData partnerHubData) {
        this.partnerHubData = partnerHubData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PARTNER_HELP_MENU),
                Enter.theValue(partnerHubData.getSearchDoubt().concat("\n")).into(SEARCH_POST),
                Click.on(LIST_POST.of(partnerHubData.getSearchDoubt())));
        actor.remember("Description post", partnerHubData.getDescriptionPost());
    }

    public static SearchPartnerHub with(PartnerHubData partnerHubData) {
        return instrumented(SearchPartnerHub.class, partnerHubData);
    }
}