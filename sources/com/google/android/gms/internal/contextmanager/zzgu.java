package com.google.android.gms.internal.contextmanager;

public enum zzgu implements zzmh {
    UNKNOWN_PROXIMITY_DISTANCE_TRIGGER_TYPE(0),
    FAR_AWAY(1),
    NEAR(2);
    
    private static final zzmi<zzgu> zzd = null;
    private final int zzf;

    /* access modifiers changed from: public */
    static {
        zzd = new zzgs();
    }

    private zzgu(int i) {
        this.zzf = i;
    }

    public static zzgu zzb(int i) {
        if (i == 0) {
            return UNKNOWN_PROXIMITY_DISTANCE_TRIGGER_TYPE;
        }
        if (i == 1) {
            return FAR_AWAY;
        }
        if (i != 2) {
            return null;
        }
        return NEAR;
    }

    public static zzmj zzc() {
        return zzgt.zza;
    }

    public final String toString() {
        return "<" + zzgu.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzf;
    }
}
