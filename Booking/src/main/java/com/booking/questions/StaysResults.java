package com.booking.questions;

import static com.booking.userinterface.StayPage.RESULTS_LIST;
import net.serenitybdd.screenplay.Question;

public class StaysResults {

    public static Question<Boolean> list() {
        return (actor) -> RESULTS_LIST.resolveFor(actor).isCurrentlyVisible();
    }
}