package com.google.android.gms.nearby.exposurenotification;

import com.google.android.gms.internal.nearby.zztl;

public enum zzj {
    INFECTIOUSNESS_NONE(0),
    INFECTIOUSNESS_STANDARD(1),
    INFECTIOUSNESS_HIGH(2);
    
    private static final zztl zzd = null;
    private final int zzf;

    /* access modifiers changed from: public */
    static {
        zzd = new zzi();
    }

    private zzj(int i) {
        this.zzf = i;
    }

    public static zzj zza(int i) {
        if (i == 0) {
            return INFECTIOUSNESS_NONE;
        }
        if (i == 1) {
            return INFECTIOUSNESS_STANDARD;
        }
        if (i != 2) {
            return null;
        }
        return INFECTIOUSNESS_HIGH;
    }

    public final String toString() {
        return Integer.toString(this.zzf);
    }
}
