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

        public TrainStation.Builder withStation(String stationCode) {
            return TrainStation.builder(apiUrl.append("/station/" + stationCode));
        }

        public TrainService.Builder withService(String service) {
            return TrainService.builder(apiUrl.append("/service/" + service));
        }

        public String withStations(TrainStationType stationType) {
            return apiUrl.append("/stations/" + stationType.toString()).toString();
        }
    }
}
