package com.dannynoam.transportapiurlbuilder.transport;

public class Time {

    public static class Builder {

        private final StringBuilder apiUrl;

        public Builder(StringBuilder apiUrl) {
            this.apiUrl = apiUrl;
        }

        public String withTimetable() {
            return apiUrl.append("/timetable.json").toString();
        }
    }
}
