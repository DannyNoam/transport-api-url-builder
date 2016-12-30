package com.dannynoam.transportapiurlbuilder.transport.train;

import com.dannynoam.transportapiurlbuilder.Buildable;

public interface OptionalTrainParameters extends Buildable {
    OptionalTrainParameters calledAt(String station);
    OptionalTrainParameters callingAt(String station);
    OptionalTrainParameters withDestination(String destination);
    OptionalTrainParameters fromOffset(String offset);
    OptionalTrainParameters withOperator(String operator);
    OptionalTrainParameters fromOrigin(String origin);
    OptionalTrainParameters withService(String service);
    OptionalTrainParameters withStationDetail(String stationDetail);
    OptionalTrainParameters toOffset(String offset);
    OptionalTrainParameters withTrainStatus(TrainStatus status);
    OptionalTrainParameters withType(String type);
}
