package com.google.android.gms.internal.contextmanager;

public enum zzdn implements zzmh {
    UNKNOWN_BEACON_FENCE_TRIGGER_TYPE(0),
    FOUND(1),
    LOST(2),
    NEAR(3);
    
    private static final zzmi<zzdn> zze = null;
    private final int zzg;

    /* access modifiers changed from: public */
    static {
        zze = new zzdl();
    }

    private zzdn(int i) {
        this.zzg = i;
    }

    public static zzdn zzb(int i) {
        if (i == 0) {
            return UNKNOWN_BEACON_FENCE_TRIGGER_TYPE;
        }
        if (i == 1) {
            return FOUND;
        }
        if (i == 2) {
            return LOST;
        }
        if (i != 3) {
            return null;
        }
        return NEAR;
    }

    public static zzmj zzc() {
        return zzdm.zza;
    }

    public final String toString() {
        return "<" + zzdn.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzg;
    }
}
