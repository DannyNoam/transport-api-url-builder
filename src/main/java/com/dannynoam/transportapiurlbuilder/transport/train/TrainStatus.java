package com.dannynoam.transportapiurlbuilder.transport.train;

public enum TrainStatus {
    PASSENGER("passenger"), FREIGHT("freight");

    private String status;

    TrainStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return status;
    }
}
