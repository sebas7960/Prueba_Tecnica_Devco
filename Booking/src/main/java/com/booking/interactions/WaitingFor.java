package com.booking.interactions;

import com.booking.exceptions.FailedStopProjectException;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class WaitingFor implements Interaction {

    private int time;

    public WaitingFor(int time) {
        this.time=time;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            throw new FailedStopProjectException(FailedStopProjectException.MESSAGE_FAILED_TO_STOP_AUTOMATION, e);
        }
    }

    public static WaitingFor aSpecificMilliSeconds(int time) {
        return instrumented(WaitingFor.class, time);
    }
}