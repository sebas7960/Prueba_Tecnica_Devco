package com.booking.model;

import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class CarRentalData {

    private String pickUpLocation;
    private String checkInMonthYear;
    private String checkInDay;
    private String checkOutMonthYear;
    private String checkOutDay;
    private String carSize;

    public CarRentalData(DataTable carRentalDataFilters) {
        List<Map<String, String>> carRentalDataFilter = carRentalDataFilters.asMaps(String.class, String.class);
        this.pickUpLocation = carRentalDataFilter.get(0).get("pickUpLocation");
        this.checkInMonthYear = carRentalDataFilter.get(0).get("checkInMonthYear");
        this.checkInDay = carRentalDataFilter.get(0).get("checkInDay");
        this.checkOutMonthYear = carRentalDataFilter.get(0).get("checkOutMonthYear");
        this.checkOutDay = carRentalDataFilter.get(0).get("checkOutDay");
        this.carSize = carRentalDataFilter.get(0).get("carSize");
    }

    public String getPickUpLocation() {
        return pickUpLocation;
    }

    public String getCheckInMonthYear() {
        return checkInMonthYear;
    }

    public String getCheckInDay() {
        return checkInDay;
    }

    public String getCheckOutMonthYear() {
        return checkOutMonthYear;
    }

    public String getCheckOutDay() {
        return checkOutDay;
    }

    public String getCarSize() {
        return carSize;
    }
}
