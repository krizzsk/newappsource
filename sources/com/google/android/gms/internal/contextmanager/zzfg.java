package com.google.android.gms.internal.contextmanager;

public enum zzfg implements zzmh {
    UNKNOWN_LOCATION_FENCE_TRIGGER_TYPE(0),
    IN(1),
    ENTERING(2),
    EXITING(3);
    
    private static final zzmi<zzfg> zze = null;
    private final int zzg;

    /* access modifiers changed from: public */
    static {
        zze = new zzfe();
    }

    private zzfg(int i) {
        this.zzg = i;
    }

    public static zzfg zzb(int i) {
        if (i == 0) {
            return UNKNOWN_LOCATION_FENCE_TRIGGER_TYPE;
        }
        if (i == 1) {
            return IN;
        }
        if (i == 2) {
            return ENTERING;
        }
        if (i != 3) {
            return null;
        }
        return EXITING;
    }

    public static zzmj zzc() {
        return zzff.zza;
    }

    public final String toString() {
        return "<" + zzfg.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzg;
    }
}
