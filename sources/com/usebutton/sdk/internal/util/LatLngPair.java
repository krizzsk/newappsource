package com.usebutton.sdk.internal.util;

import android.location.Location;
import com.usebutton.sdk.internal.functional.Pair;

public class LatLngPair extends Pair<Double, Double> {
    public LatLngPair(Double d, Double d2) {
        super(d, d2);
    }

    public double getLatitude() {
        return ((Double) super.first()).doubleValue();
    }

    public double getLongitude() {
        return ((Double) super.second()).doubleValue();
    }

    public LatLngPair(Location location) {
        this(Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
    }
}
