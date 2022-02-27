package com.booking.tasks;

import com.booking.model.StaysData;
import com.booking.userinterface.StayPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Select;

import static com.booking.userinterface.HomePage.CONTINUE_BTN;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchStay implements Task {

    private final StaysData staysData;
    private int option;

    public SearchStay(StaysData staysData) {
        this.staysData = staysData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(staysData.getPlace()).into(StayPage.SEARCH_INPUT),
                Click.on(StayPage.CHECK_IN_OUT_DIV));
        option = 0;
        if (StayPage.CHECK_IN_MON_YEAR_DIV.resolveFor(actor).getText().equals(staysData.getCheckInMonthYear()))
            actor.attemptsTo(Click.on(StayPage.CHECK_IN_DAY_TABLE.of(staysData.getCheckInDay())));
        else {
            while (!StayPage.CHECK_IN_MON_YEAR_DIV.resolveFor(actor).getText().equals(staysData.getCheckInMonthYear()) && option !=1) {
                if (StayPage.NEXT_MONTH_DIV.resolveFor(actor).isCurrentlyVisible())
                    actor.attemptsTo(Click.on(StayPage.NEXT_MONTH_DIV));
                else {
                    actor.attemptsTo(Click.on(StayPage.CHECK_OUT_DAY_TABLE.of(staysData.getCheckInDay())),
                            Click.on(StayPage.CHECK_OUT_DAY_TABLE.of(staysData.getCheckOutDay())));
                    option = 1;
                }
            }
        }
        while (option!=1){
            actor.attemptsTo(Click.on(StayPage.CHECK_IN_DAY_TABLE.of(staysData.getCheckInDay())));
            if (staysData.getCheckInMonthYear().equals(staysData.getCheckOutMonthYear())) {
                actor.attemptsTo(Click.on(StayPage.CHECK_IN_DAY_TABLE.of(staysData.getCheckOutDay())));
                option = 1;
            }
            else if (StayPage.CHECK_OUT_MON_YEAR_DIV.resolveFor(actor).getText().equals(staysData.getCheckOutMonthYear())) {
                actor.attemptsTo(Click.on(StayPage.CHECK_OUT_DAY_TABLE.of(staysData.getCheckOutDay())));
                option = 1;
            }
            else{
                while (!StayPage.CHECK_OUT_MON_YEAR_DIV.resolveFor(actor).getText().equals(staysData.getCheckOutMonthYear())) {
                    actor.attemptsTo(Click.on(StayPage.NEXT_MONTH_DIV));
                }
                actor.attemptsTo(Click.on(StayPage.CHECK_OUT_DAY_TABLE.of(staysData.getCheckOutDay())));
                option = 1;
            }
        }
        actor.attemptsTo(Click.on(StayPage.PEOPLE_ROOM_LABEL));
        while (!StayPage.ADULTS_NUMBER_SPAN.resolveFor(actor).getText().equals(Integer.toString(staysData.getAdults()))){
            if (Integer.parseInt(StayPage.ADULTS_NUMBER_SPAN.resolveFor(actor).getText()) < staysData.getAdults())
                actor.attemptsTo(Click.on(StayPage.ADD_ADULTS_BUTTON));
            else
                actor.attemptsTo(Click.on(StayPage.SUBTRACT_ADULTS_BUTTON));
        }

        while (!StayPage.CHILDREN_NUMBER_SPAN.resolveFor(actor).getText().equals(Integer.toString(staysData.getChildren()))){
            if (Integer.parseInt(StayPage.CHILDREN_NUMBER_SPAN.resolveFor(actor).getText()) < staysData.getChildren()){
                actor.attemptsTo(Click.on(StayPage.ADD_CHILDREN_BUTTON));}
            else
                actor.attemptsTo(Click.on(StayPage.SUBTRACT_CHILDREN_BUTTON));
        }

        option = 1;
        if (staysData.getAgeChildren() != null && staysData.getAgeChildren().length != 0)
        for (String ageChildren: staysData.getAgeChildren()) {
            actor.attemptsTo(Select.values(ageChildren).from(StayPage.AGE_CHILDREN_SLT.of(Integer.toString(option))));
            option++;
        }

        while (!StayPage.ROOMS_NUMBER_SPAN.resolveFor(actor).getText().equals(Integer.toString(staysData.getRooms()))){
            if (Integer.parseInt(StayPage.ROOMS_NUMBER_SPAN.resolveFor(actor).getText()) < staysData.getRooms())
                actor.attemptsTo(Click.on(StayPage.ADD_ROOM_BUTTON));
            else
                actor.attemptsTo(Click.on(StayPage.SUBTRACT_ROOM_BUTTON));
        }
        actor.attemptsTo(Click.on(CONTINUE_BTN));
    }

    public static SearchStay with(StaysData staysData) {
        return instrumented(SearchStay.class, staysData);
    }
}