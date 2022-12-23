package com.google.android.gms.nearby.exposurenotification;

import com.google.android.gms.internal.nearby.zztl;

public enum zzh {
    LOWEST_CONFIDENCE(0),
    LOW_CONFIDENCE(1),
    MEDIUM_CONFIDENCE(2),
    HIGH_CONFIDENCE(3);
    
    private static final zztl zze = null;
    private final int zzg;

    /* access modifiers changed from: public */
    static {
        zze = new zzg();
    }

    private zzh(int i) {
        this.zzg = i;
    }

    public static zzh zza(int i) {
        if (i == 0) {
            return LOWEST_CONFIDENCE;
        }
        if (i == 1) {
            return LOW_CONFIDENCE;
        }
        if (i == 2) {
            return MEDIUM_CONFIDENCE;
        }
        if (i != 3) {
            return null;
        }
        return HIGH_CONFIDENCE;
    }

    public final String toString() {
        return Integer.toString(this.zzg);
    }
}
