package com.booking.tasks;

import static com.booking.userinterface.CarRentalPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.booking.interactions.WaitingFor;
import com.booking.model.CarRentalData;
import com.booking.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SearchCarRental implements Task {

    private CarRentalData carRentalData;
    private int option;
    private int count;

    public SearchCarRental(CarRentalData carRentalData) {
        this.carRentalData = carRentalData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.CAR_RENTAL_MENU),
                Enter.theValue(carRentalData.getPickUpLocation()).into(PICKUP_LOCATION_PLACE),
                WaitingFor.aSpecificMilliSeconds(2500),
                Click.on(PICKUP_LOCATION_SELECTED),
                WaitingFor.aSpecificMilliSeconds(2500),
                Click.on(CHECK_IN_DATE_MENU));
        option = 0;
        count = 1;
        if (CHECK_IN_MONTH_YEAR_TEXT.of(Integer.toString(count)).resolveFor(actor).getText().equals(carRentalData.getCheckInMonthYear())) {
            actor.attemptsTo(Click.on(CHECK_IN_DAY_NUMBER.of(Integer.toString(count), carRentalData.getCheckInDay())));
            count = count + 16;
        }
        else {
            while (!CHECK_IN_MONTH_YEAR_TEXT.of(Integer.toString(count)).resolveFor(actor).getText().equals(carRentalData.getCheckInMonthYear()) && option !=1) {
                if (NEXT_MONTH_BTN.resolveFor(actor).isCurrentlyEnabled()){
                    actor.attemptsTo(WaitingFor.aSpecificMilliSeconds(1800),
                            Click.on(NEXT_MONTH_BTN));
                    count++;
                }
                else {
                    actor.attemptsTo(Click.on(CHECK_OUT_DAY_NUMBER.of(carRentalData.getCheckInDay())));
                    count= count + 16;
                    actor.attemptsTo(Click.on(CHECK_OUT_DAY_NUMBER.of(carRentalData.getCheckOutDay())));
                    option = 1;
                }
            }
        }
        while (option!=1){
            actor.attemptsTo(Click.on(CHECK_IN_DAY_NUMBER.of(Integer.toString(count), carRentalData.getCheckInDay())));
            count= count + 16;
            if (carRentalData.getCheckInMonthYear().equals(carRentalData.getCheckOutMonthYear())) {
                actor.attemptsTo(WaitingFor.aSpecificMilliSeconds(1800),
                        Click.on(CHECK_IN_DAY_NUMBER.of(Integer.toString(count), carRentalData.getCheckOutDay())));
                option = 1;
            }
            else if (CHECK_OUT_MONTH_YEAR_TEXT.resolveFor(actor).getText().equals(carRentalData.getCheckOutMonthYear())) {
                actor.attemptsTo(WaitingFor.aSpecificMilliSeconds(1800),
                        Click.on(CHECK_OUT_DAY_NUMBER.of(carRentalData.getCheckOutDay())));
                option = 1;
            }
            else{
                while (!CHECK_OUT_MONTH_YEAR_TEXT.resolveFor(actor).getText().equals(carRentalData.getCheckOutMonthYear())) {
                    actor.attemptsTo(WaitingFor.aSpecificMilliSeconds(1800),
                            Click.on(NEXT_MONTH_BTN));
                }
                actor.attemptsTo(WaitingFor.aSpecificMilliSeconds(1800),
                        Click.on(CHECK_OUT_DAY_NUMBER.of(carRentalData.getCheckOutDay())));
                option = 1;
            }
            actor.attemptsTo(Click.on(HomePage.CONTINUE_BTN),
                    WaitingFor.aSpecificMilliSeconds(10000),
                    Click.on(CAR_SIZE_TEXT.of(carRentalData.getCarSize())));
        }

    }

    public static SearchCarRental with(CarRentalData carRentalData) {
        return instrumented(SearchCarRental.class, carRentalData);
    }

}