package com.dannynoam.transportapiurlbuilder.transport;

import java.time.LocalTime;

public class Date {

    public static class Builder {

        private final StringBuilder apiUrl;

        public Builder(StringBuilder apiUrl) {
            this.apiUrl = apiUrl;
        }

        public Time.Builder withTime(LocalTime time) {
            return new Time.Builder(apiUrl.append("/" + time.toString()));
        }
    }
}
