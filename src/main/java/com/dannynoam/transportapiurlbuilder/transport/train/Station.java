package com.dannynoam.transportapiurlbuilder.transport.train;

import com.dannynoam.transportapiurlbuilder.transport.Timetable;

public class Station {

    public static Builder builder(StringBuilder apiUrl) {
        return new Builder(apiUrl);
    }

    public static class Builder {
        private final StringBuilder apiUrl;

        private Builder(StringBuilder apiUrl) {
            this.apiUrl = apiUrl;
        }

        public String withLiveTimetable() {
            return apiUrl.append("/live.json").toString();
        }

        public Timetable.Builder withTimetable() {
            return new Timetable.Builder(apiUrl);
        }
    }

    public enum Type {
        NEAR("near.json"), BBOX("bbox.json");

        private String uri;

        Type(String uri) {
            this.uri = uri;
        }
    }
}
