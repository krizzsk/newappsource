package com.google.android.gms.nearby.uwb;

public class RangingMeasurement {
    private final float zza;

    public RangingMeasurement(int i, float f) {
        this.zza = f;
    }

    public float getValue() {
        return this.zza;
    }
}
