package com.booking.model;

import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class StaysData {

    private String place;
    private String checkInDay;
    private String checkInMonthYear;
    private String checkOutDay;
    private String checkOutMonthYear;
    private int adults;
    private int children;
    private int rooms;
    private String[] ageChildren;

    public StaysData(DataTable stayFilters) {
        List<Map<String, String>> stayFilter = stayFilters.asMaps(String.class, String.class);
        this.place = stayFilter.get(0).get("place");
        this.checkInDay = stayFilter.get(0).get("checkInDay");
        this.checkInMonthYear = stayFilter.get(0).get("checkInMonthYear");
        this.checkOutDay = stayFilter.get(0).get("checkOutDay");
        this.checkOutMonthYear = stayFilter.get(0).get("checkOutMonthYear");
        this.adults = Integer.parseInt(stayFilter.get(0).get("adults"));
        this.children = Integer.parseInt(stayFilter.get(0).get("children"));
        this.rooms = Integer.parseInt(stayFilter.get(0).get("rooms"));
        if (stayFilter.get(0).get("ageChildren") != null)
        this.ageChildren = stayFilter.get(0).get("ageChildren").split(",");
    }

    public String getPlace() {
        return place;
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

    public int getAdults() {
        return adults;
    }

    public int getChildren() {
        return children;
    }

    public int getRooms() {
        return rooms;
    }

    public String[] getAgeChildren() {
        return ageChildren;
    }
}