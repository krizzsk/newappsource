package com.google.android.gms.nearby.uwb;

import java.util.Locale;

public class RangingPosition {
    private final RangingMeasurement zza;
    private final RangingMeasurement zzb;
    private final RangingMeasurement zzc;
    private final long zzd;

    public RangingPosition(RangingMeasurement rangingMeasurement, RangingMeasurement rangingMeasurement2, RangingMeasurement rangingMeasurement3, long j) {
        this.zza = rangingMeasurement;
        this.zzb = rangingMeasurement2;
        this.zzc = rangingMeasurement3;
        this.zzd = j;
    }

    public RangingMeasurement getAzimuth() {
        return this.zzb;
    }

    public RangingMeasurement getDistance() {
        return this.zza;
    }

    public long getElapsedRealtimeNanos() {
        return this.zzd;
    }

    public RangingMeasurement getElevation() {
        return this.zzc;
    }

    public String toString() {
        Locale locale = Locale.US;
        String format = String.format(locale, "elapsedRealtime (ms) %d | distance (m) %f", new Object[]{Long.valueOf(this.zzd / 1000000), Float.valueOf(this.zza.getValue())});
        RangingMeasurement rangingMeasurement = this.zzb;
        if (rangingMeasurement != null) {
            format = String.valueOf(format).concat(String.valueOf(String.format(locale, " | azimuth: %f", new Object[]{Float.valueOf(rangingMeasurement.getValue())})));
        }
        RangingMeasurement rangingMeasurement2 = this.zzc;
        if (rangingMeasurement2 == null) {
            return format;
        }
        return String.valueOf(format).concat(String.valueOf(String.format(locale, " | elevation: %f", new Object[]{Float.valueOf(rangingMeasurement2.getValue())})));
    }
}
