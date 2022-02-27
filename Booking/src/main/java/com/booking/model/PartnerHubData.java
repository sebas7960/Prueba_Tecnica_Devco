package com.booking.model;

import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class PartnerHubData {

    private String searchDoubt;
    private String descriptionPost;

    public PartnerHubData(DataTable stayFilters) {
        List<Map<String, String>> stayFilter = stayFilters.asMaps(String.class, String.class);
        this.searchDoubt = stayFilter.get(0).get("searchDoubt");
        this.descriptionPost = stayFilter.get(0).get("descriptionPost");
    }

    public String getSearchDoubt() {
        return searchDoubt;
    }

    public String getDescriptionPost() {
        return descriptionPost;
    }
}
