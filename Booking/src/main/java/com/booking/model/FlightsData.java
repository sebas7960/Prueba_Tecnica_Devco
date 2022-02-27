package com.booking.model;

import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class FlightsData {

    private String flightType;
    private String[] personNumber;
    private String flightMode;
    private String from;
    private String to;
    private String checkInDay;
    private String checkInMonthYear;
    private String checkOutDay;
    private String checkOutMonthYear;

    public FlightsData(DataTable flightFilters) {
        List<Map<String, String>> flightFilter = flightFilters.asMaps(String.class, String.class);
        this.flightType = flightFilter.get(0).get("flightType");
        this.personNumber = flightFilter.get(0).get("personNumber").split(",");
        this.flightMode = flightFilter.get(0).get("flightMode");
        this.from = flightFilter.get(0).get("from");
        this.to = flightFilter.get(0).get("to");
        this.checkInDay = flightFilter.get(0).get("checkInDay");
        this.checkInMonthYear = flightFilter.get(0).get("checkInMonthYear");
        this.checkOutDay = flightFilter.get(0).get("checkOutDay");
        this.checkOutMonthYear = flightFilter.get(0).get("checkOutMonthYear");

    }

    public String getFlightType() {
        return flightType;
    }

    public String[] getPersonNumber() {
        return personNumber;
    }

    public String getFlightMode() {
        return flightMode;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getCheckInDay() {
        return checkInDay;
    }

    public String getCheckInMonthYear() {
        return checkInMonthYear;
    }

    public String getCheckOutDay() {
        return checkOutDay;
    }

    public String getCheckOutMonthYear() {
        return checkOutMonthYear;
    }
}
