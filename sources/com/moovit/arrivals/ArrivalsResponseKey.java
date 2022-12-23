package com.moovit.arrivals;

import com.moovit.util.time.Time;

public enum ArrivalsResponseKey {
    TIME_BASED_RESPONSE,
    NOW_BASED_RESPONSE;

    public static ArrivalsResponseKey getKeyType(Time time, boolean z) {
        return (z || time != null) ? TIME_BASED_RESPONSE : NOW_BASED_RESPONSE;
    }
}
