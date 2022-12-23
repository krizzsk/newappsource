package com.google.android.gms.internal.contextmanager;

public enum zzie implements zzmh {
    UNKNOWN_TIME_INTERVAL_FENCE_TRIGGER_TYPE(0),
    IN(1),
    STARTING(2),
    STOPPING(3);
    
    private static final zzmi<zzie> zze = null;
    private final int zzg;

    /* access modifiers changed from: public */
    static {
        zze = new zzic();
    }

    private zzie(int i) {
        this.zzg = i;
    }

    public static zzie zzb(int i) {
        if (i == 0) {
            return UNKNOWN_TIME_INTERVAL_FENCE_TRIGGER_TYPE;
        }
        if (i == 1) {
            return IN;
        }
        if (i == 2) {
            return STARTING;
        }
        if (i != 3) {
            return null;
        }
        return STOPPING;
    }

    public static zzmj zzc() {
        return zzid.zza;
    }

    public final String toString() {
        return "<" + zzie.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzg;
    }
}
