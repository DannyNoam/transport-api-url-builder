package com.dannynoam.transportapiurlbuilder;

import com.dannynoam.transportapiurlbuilder.transport.train.OptionalTrainParameters;

public interface AppKey {
    OptionalTrainParameters usingAppKey(String appKey);
}
