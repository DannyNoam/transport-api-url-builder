package com.dannynoam.transportapiurlbuilder.transport;

import java.time.LocalDate;

public class Timetable {

    public static class Builder {

        private final StringBuilder apiUrl;

        public Builder(StringBuilder apiUrl) {
            this.apiUrl = apiUrl;
        }

        public Date.Builder withDate(LocalDate date) {
            return new Date.Builder(apiUrl.append("/" + date.toString()));
        }
    }
}
