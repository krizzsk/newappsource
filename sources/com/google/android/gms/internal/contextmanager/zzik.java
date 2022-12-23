package com.google.android.gms.internal.contextmanager;

public enum zzik implements zzmh {
    UNKNOWN_WANDER_STATE_FENCE_TRIGGER_TYPE(0),
    IS_WANDERING(1),
    STARTING_WANDER(2),
    STOPPING_WANDER(3);
    
    private static final zzmi<zzik> zze = null;
    private final int zzg;

    /* access modifiers changed from: public */
    static {
        zze = new zzii();
    }

    private zzik(int i) {
        this.zzg = i;
    }

    public static zzik zzb(int i) {
        if (i == 0) {
            return UNKNOWN_WANDER_STATE_FENCE_TRIGGER_TYPE;
        }
        if (i == 1) {
            return IS_WANDERING;
        }
        if (i == 2) {
            return STARTING_WANDER;
        }
        if (i != 3) {
            return null;
        }
        return STOPPING_WANDER;
    }

    public static zzmj zzc() {
        return zzij.zza;
    }

    public final String toString() {
        return "<" + zzik.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzg;
    }
}
