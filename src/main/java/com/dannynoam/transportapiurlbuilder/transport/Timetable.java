package com.dannynoam.transportapiurlbuilder.transport;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Timetable {

    public static class Builder {

        private final StringBuilder apiUrl;

        public Builder(StringBuilder apiUrl) {
            this.apiUrl = apiUrl;
        }

        public Date.Builder withDate(LocalDate date) {
            return new Date.Builder(apiUrl.append("/" + date.format(DateTimeFormatter.ISO_DATE)));
        }
    }
}
