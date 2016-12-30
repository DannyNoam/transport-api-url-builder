package com.dannynoam.transportapiurlbuilder.transport;

import com.dannynoam.transportapiurlbuilder.AppId;
import com.dannynoam.transportapiurlbuilder.transport.train.TrainQueryParameters;

public class Time {

    public static class Builder {

        private final StringBuilder apiUrl;

        public Builder(StringBuilder apiUrl) {
            this.apiUrl = apiUrl;
        }

        public AppId withTimetable() {
            return new TrainQueryParameters().builder(apiUrl);
        }
    }
}
