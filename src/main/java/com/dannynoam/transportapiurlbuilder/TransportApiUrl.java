package com.dannynoam.transportapiurlbuilder;

import com.dannynoam.transportapiurlbuilder.transport.train.Train;

public class TransportApiUrl {

    private static final String TRANSPORT_API_BASE_URL =  "http://transportapi.com/v3/uk";

    public static Builder builder() {
        return new Builder(new StringBuilder(TRANSPORT_API_BASE_URL));
    }

    public static class Builder {
        private final StringBuilder apiUrl;

        private Builder(StringBuilder apiUrl) {
            this.apiUrl = apiUrl;
        }

        public Train.Builder withTrains() {
            return new Train().builder(apiUrl.append("/train"));
        }
    }
}
