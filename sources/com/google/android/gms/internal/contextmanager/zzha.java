package com.google.android.gms.internal.contextmanager;

public enum zzha implements zzmh {
    UNKNOWN_SCREEN_FENCE_TRIGGER_TYPE(0),
    DURING(1),
    TURNING_ON(2),
    TURNING_OFF(3);
    
    private static final zzmi<zzha> zze = null;
    private final int zzg;

    /* access modifiers changed from: public */
    static {
        zze = new zzgy();
    }

    private zzha(int i) {
        this.zzg = i;
    }

    public static zzha zzb(int i) {
        if (i == 0) {
            return UNKNOWN_SCREEN_FENCE_TRIGGER_TYPE;
        }
        if (i == 1) {
            return DURING;
        }
        if (i == 2) {
            return TURNING_ON;
        }
        if (i != 3) {
            return null;
        }
        return TURNING_OFF;
    }

    public static zzmj zzc() {
        return zzgz.zza;
    }

    public final String toString() {
        return "<" + zzha.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzg;
    }
}
