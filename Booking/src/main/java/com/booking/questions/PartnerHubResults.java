package com.booking.questions;

import static com.booking.userinterface.PartnerHubPage.DESCRIPTION_OF_POST;
import net.serenitybdd.screenplay.Question;

public class PartnerHubResults {

    public static Question<Boolean> description() {
        return (actor) -> DESCRIPTION_OF_POST.resolveFor(actor).isCurrentlyVisible();
    }
}
