package com.google.android.gms.internal.contextmanager;

public enum zzcz implements zzmh {
    UKNOWN_ACTIVITY_FENCE_TRIGGER_TYPE(0),
    DURING(1),
    STARTING(2),
    STOPPING(3);
    
    private static final zzmi<zzcz> zze = null;
    private final int zzg;

    /* access modifiers changed from: public */
    static {
        zze = new zzcx();
    }

    private zzcz(int i) {
        this.zzg = i;
    }

    public static zzcz zzb(int i) {
        if (i == 0) {
            return UKNOWN_ACTIVITY_FENCE_TRIGGER_TYPE;
        }
        if (i == 1) {
            return DURING;
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
        return zzcy.zza;
    }

    public final String toString() {
        return "<" + zzcz.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzg;
    }
}
