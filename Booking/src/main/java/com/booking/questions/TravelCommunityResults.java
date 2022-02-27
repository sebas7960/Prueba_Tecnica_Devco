package com.booking.questions;

import net.serenitybdd.screenplay.Question;

import static com.booking.userinterface.TravelCommunityPage.DESCRIPTION_SELECTED_POST;

public class TravelCommunityResults {

    public static Question<Boolean> list() {
        return (actor) -> DESCRIPTION_SELECTED_POST.resolveFor(actor).isCurrentlyVisible();
    }
}