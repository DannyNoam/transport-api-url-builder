package com.dannynoam.transportapiurlbuilder.transport.train;

import com.dannynoam.transportapiurlbuilder.transport.Timetable;

public class TrainService {

    public static Builder builder(StringBuilder apiUrl) {
        return new Builder(apiUrl);
    }

    public static class Builder {
        private final StringBuilder apiUrl;

        private Builder(StringBuilder apiUrl) {
            this.apiUrl = apiUrl;
        }

        public Timetable.Builder withTimetable() {
            return new Timetable.Builder(apiUrl);
        }
    }
}
