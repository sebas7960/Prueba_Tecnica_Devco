package com.booking.utils;

public enum Urls {

    BOOKING_PAGE("https://www.booking.com/");

    private String url;

    Urls(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

}
