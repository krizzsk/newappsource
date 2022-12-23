package com.google.android.gms.internal.contextmanager;

public enum zzfz implements zzmh {
    UNKNOWN_PHONE_LOCK_FENCE_TRIGGER_TYPE(0),
    DURING(1),
    UNLOCKING(2),
    LOCKING(3);
    
    private static final zzmi<zzfz> zze = null;
    private final int zzg;

    /* access modifiers changed from: public */
    static {
        zze = new zzfx();
    }

    private zzfz(int i) {
        this.zzg = i;
    }

    public static zzfz zzb(int i) {
        if (i == 0) {
            return UNKNOWN_PHONE_LOCK_FENCE_TRIGGER_TYPE;
        }
        if (i == 1) {
            return DURING;
        }
        if (i == 2) {
            return UNLOCKING;
        }
        if (i != 3) {
            return null;
        }
        return LOCKING;
    }

    public static zzmj zzc() {
        return zzfy.zza;
    }

    public final String toString() {
        return "<" + zzfz.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzg;
    }
}
