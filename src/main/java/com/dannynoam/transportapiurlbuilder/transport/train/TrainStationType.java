package com.dannynoam.transportapiurlbuilder.transport.train;

public enum TrainStationType {
    NEAR("near.json"), BBOX("bbox.json");

    private String uri;

    TrainStationType(String uri) {
        this.uri = uri;
    }
}
