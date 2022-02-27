package com.booking.model;

import io.cucumber.datatable.DataTable;
import java.util.List;
import java.util.Map;

public class TravelCommunityData {

    private String country;
    private String search;

    public TravelCommunityData(DataTable travelCommunityFilters) {
        List<Map<String, String>> travelCommunityFilter = travelCommunityFilters.asMaps(String.class, String.class);
        this.country = travelCommunityFilter.get(0).get("country");
        this.search = travelCommunityFilter.get(0).get("search");
    }

    public String getCountry() {
        return country;
    }

    public String getSearch() {
        return search;
    }
}
