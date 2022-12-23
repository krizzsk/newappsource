package com.google.android.gms.nearby.uwb;

public class RangingCapabilities {
    private final boolean zza;
    private final boolean zzb;
    private final boolean zzc;

    public RangingCapabilities(boolean z, boolean z2, boolean z3, int i) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = z3;
    }

    public boolean supportsAzimuthalAngle() {
        return this.zzb;
    }

    public boolean supportsDistance() {
        return this.zza;
    }

    public boolean supportsElevationAngle() {
        return this.zzc;
    }
}
