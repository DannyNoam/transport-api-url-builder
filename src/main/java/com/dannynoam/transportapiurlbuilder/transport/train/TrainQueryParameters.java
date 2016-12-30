package com.dannynoam.transportapiurlbuilder.transport.train;

import com.dannynoam.transportapiurlbuilder.AppId;
import com.dannynoam.transportapiurlbuilder.AppKey;

public class TrainQueryParameters {

    public static AppId builder(StringBuilder apiUrl) {
        return new TrainQueryParameters.Builder(apiUrl);
    }

    public static class Builder implements AppId, AppKey, OptionalTrainParameters {
        private StringBuilder apiUrl;

        private Builder(StringBuilder apiUrl) {
            this.apiUrl = apiUrl;
        }

        public AppKey usingAppId(String appId) {
            apiUrl = apiUrl.append("?app_id=" + appId);
            return this;
        }

        public OptionalTrainParameters usingAppKey(String appKey) {
            apiUrl = apiUrl.append("&?app_key=" + appKey);
            return this;
        }

        public OptionalTrainParameters calledAt(String station) {
            apiUrl = apiUrl.append("&?called_at=" + station);
            return this;
        }

        public OptionalTrainParameters callingAt(String station) {
            apiUrl = apiUrl.append("&?calling_at=" + station);
            return this;
        }

        public OptionalTrainParameters withDestination(String station) {
            apiUrl = apiUrl.append("&?destination=" + station);
            return this;
        }

        public OptionalTrainParameters fromOffset(String offset) {
            apiUrl = apiUrl.append("&?from_offset=" + offset);
            return this;
        }

        public OptionalTrainParameters withOperator(String operator) {
            apiUrl = apiUrl.append("&?operator=" + operator);
            return this;
        }

        public OptionalTrainParameters fromOrigin(String origin) {
            apiUrl = apiUrl.append("&?origin=" + origin);
            return this;
        }

        public OptionalTrainParameters withService(String service) {
            apiUrl = apiUrl.append("&?service=" + service);
            return this;
        }

        public OptionalTrainParameters withStationDetail(String stationDetail) {
            apiUrl = apiUrl.append("&?station_detail=" + stationDetail);
            return this;
        }

        public OptionalTrainParameters toOffset(String offset) {
            apiUrl = apiUrl.append("&?to_offset=" + offset);
            return this;
        }

        public OptionalTrainParameters withTrainStatus(TrainStatus trainStatus) {
            apiUrl = apiUrl.append("&?train_status=" + trainStatus);
            return this;
        }

        public OptionalTrainParameters withType(String type) {
            apiUrl = apiUrl.append("&?type=" + type);
            return this;
        }

        public String build() {
            return apiUrl.toString();
        }
    }
}
