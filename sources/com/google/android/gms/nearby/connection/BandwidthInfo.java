package com.google.android.gms.nearby.connection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class BandwidthInfo {
    private final int zza;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Quality {
        public static final int HIGH = 3;
        public static final int LOW = 1;
        public static final int MEDIUM = 2;
        public static final int UNKNOWN = 0;
    }

    public /* synthetic */ BandwidthInfo(int i, int i2, zzf zzf) {
        this.zza = i;
    }

    public int getQuality() {
        return this.zza;
    }
}
