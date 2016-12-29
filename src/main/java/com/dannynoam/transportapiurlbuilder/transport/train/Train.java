package com.dannynoam.transportapiurlbuilder.transport.train;

public class Train {

    public static Builder builder(StringBuilder apiUrl) {
        return new Builder(apiUrl);
    }

    public static class Builder {
        private final StringBuilder apiUrl;

        private Builder(StringBuilder apiUrl) {
            this.apiUrl = apiUrl;
        }

        public Station.Builder withStation(String stationCode) {
            return Station.builder(apiUrl.append("/station/" + stationCode));
        }

        public Service.Builder withService(String service) {
            return Service.builder(apiUrl.append("/service/" + service));
        }

        public String withStations(Station.Type stationType) {
            return apiUrl.append(stationType.toString()).toString();
        }
    }
}
