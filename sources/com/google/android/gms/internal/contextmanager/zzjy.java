package com.google.android.gms.internal.contextmanager;

public enum zzjy implements zzmh {
    UNKNOWN_STATE(0),
    DISCONNECTED(1),
    ON_WIFI(2),
    ON_CELLULAR(3);
    
    private static final zzmi<zzjy> zze = null;
    private final int zzg;

    /* access modifiers changed from: public */
    static {
        zze = new zzjw();
    }

    private zzjy(int i) {
        this.zzg = i;
    }

    public static zzjy zzb(int i) {
        if (i == 0) {
            return UNKNOWN_STATE;
        }
        if (i == 1) {
            return DISCONNECTED;
        }
        if (i == 2) {
            return ON_WIFI;
        }
        if (i != 3) {
            return null;
        }
        return ON_CELLULAR;
    }

    public static zzmj zzc() {
        return zzjx.zza;
    }

    public final String toString() {
        return "<" + zzjy.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzg;
    }
}
