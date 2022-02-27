package com.booking.questions;

import static com.booking.userinterface.FlightPage.NO_FOUND_FLIGHT_MESSAGE;
import net.serenitybdd.screenplay.Question;

public class FlightResults {

    public static Question<Boolean> list() {
        return (actor) -> !NO_FOUND_FLIGHT_MESSAGE.resolveFor(actor).isCurrentlyVisible();
    }
}