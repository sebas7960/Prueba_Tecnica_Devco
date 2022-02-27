package com.booking.tasks;

import static com.booking.userinterface.FlightPage.*;
import static com.booking.userinterface.HomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.booking.model.FlightsData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SearchFlight implements Task {

    private final FlightsData flightsData;
    private int option;

    public SearchFlight(FlightsData flightsData) {
        this.flightsData = flightsData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(FLIGHTS_MENU),
                Click.on(FLIGHT_TYPE_MENU),
                Click.on(FLIGHT_TYPE_MODE_OPTION.of(flightsData.getFlightType())),
                Click.on(PEOPLE_NUMBER_MENU));

        while (!ADULT_NUMBER.resolveFor(actor).getTextValue().equals(flightsData.getPersonNumber()[0])){
                actor.attemptsTo(Click.on(ADD_ADULT_NUMBER));
        }

        while (!STUDENT_NUMBER.resolveFor(actor).getTextValue().equals(flightsData.getPersonNumber()[1])){
            actor.attemptsTo(Click.on(ADD_STUDENT_NUMBER));
        }

        actor.attemptsTo(Click.on(TITLE_H1),
                Click.on(FLIGHT_MODE_MENU),
                Click.on(FLIGHT_TYPE_MODE_OPTION.of(flightsData.getFlightMode())),
                Click.on(TITLE_H1));

        actor.attemptsTo(Click.on(FROM_PLACE_MENU),
                Enter.theValue(flightsData.getFrom()).into(FROM_PLACE_INPUT),
                Click.on(FROM_PLACE_SELECT),
                Click.on(TITLE_H1),
                Click.on(TO_PLACE_MENU),
                Enter.theValue(flightsData.getTo()).into(TO_PLACE_INPUT),
                Click.on(TO_PLACE_SELECT),
                Click.on(TITLE_H1));
        actor.attemptsTo(
                Click.on(DATE_DEPART_PLACE_MENU));
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (CHECK_IN_MON_YEAR_DIV.resolveFor(actor).getText().equals(flightsData.getCheckInMonthYear()))
            actor.attemptsTo(Click.on(CHECK_IN_DAY_TABLE.of(flightsData.getCheckInDay())));
        else {
            while (!CHECK_IN_MON_YEAR_DIV.resolveFor(actor).getText().equals(flightsData.getCheckInMonthYear()) && option !=1) {
                if (NEXT_MONTH_DIV.resolveFor(actor).isCurrentlyVisible())
                    actor.attemptsTo(Click.on(NEXT_MONTH_DIV));
                else {
                    actor.attemptsTo(Click.on(CHECK_OUT_DAY_TABLE.of(flightsData.getCheckInDay())),
                            Click.on(CHECK_OUT_DAY_TABLE.of(flightsData.getCheckOutDay())));
                    option = 1;
                }
            }
        }
        while (option!=1){
            actor.attemptsTo(Click.on(CHECK_IN_DAY_TABLE.of(flightsData.getCheckInDay())));
            if (flightsData.getCheckInMonthYear().equals(flightsData.getCheckOutMonthYear())) {
                actor.attemptsTo(Click.on(CHECK_IN_DAY_TABLE.of(flightsData.getCheckOutDay())));
                option = 1;
            }
            else if (CHECK_OUT_MON_YEAR_DIV.resolveFor(actor).getText().equals(flightsData.getCheckOutMonthYear())) {
                actor.attemptsTo(Click.on(CHECK_OUT_DAY_TABLE.of(flightsData.getCheckOutDay())));
                option = 1;
            }
            else{
                while (!CHECK_OUT_MON_YEAR_DIV.resolveFor(actor).getText().equals(flightsData.getCheckOutMonthYear())) {
                    actor.attemptsTo(Click.on(NEXT_MONTH_DIV));
                }
                actor.attemptsTo(Click.on(CHECK_OUT_DAY_TABLE.of(flightsData.getCheckOutDay())));
                option = 1;
            }
        }
        actor.attemptsTo(Click.on(CONTINUE_BTN));
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static SearchFlight with(FlightsData flightsData) {
        return instrumented(SearchFlight.class, flightsData);
    }
}
