package com.booking.exceptions;

import net.serenitybdd.core.exceptions.SerenityManagedException;

public class FailedStopProjectException extends SerenityManagedException {

    public static final String MESSAGE_FAILED_TO_STOP_AUTOMATION = "Fail to stop the automation exception";

    public FailedStopProjectException(String message, Throwable errorException) {
        super(message, errorException);
    }
}
