package com.booking.questions;

import net.serenitybdd.screenplay.Question;

import static com.booking.userinterface.CarRentalPage.CAR_RESULTS;

public class CarRentalResults {

    public static Question<Boolean> list() {
        return (actor) -> CAR_RESULTS.resolveFor(actor).isCurrentlyVisible();
    }
}
