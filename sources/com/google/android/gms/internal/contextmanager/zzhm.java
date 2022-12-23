package com.google.android.gms.internal.contextmanager;

public enum zzhm implements zzmh {
    UNKNOWN_MOMENT_FENCE_TRIGGER_TYPE(0),
    AROUND_SUNRISE(1),
    AROUND_SUNSET(2);
    
    private static final zzmi<zzhm> zzd = null;
    private final int zzf;

    /* access modifiers changed from: public */
    static {
        zzd = new zzhk();
    }

    private zzhm(int i) {
        this.zzf = i;
    }

    public static zzhm zzb(int i) {
        if (i == 0) {
            return UNKNOWN_MOMENT_FENCE_TRIGGER_TYPE;
        }
        if (i == 1) {
            return AROUND_SUNRISE;
        }
        if (i != 2) {
            return null;
        }
        return AROUND_SUNSET;
    }

    public static zzmj zzc() {
        return zzhl.zza;
    }

    public final String toString() {
        return "<" + zzhm.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzf;
    }
}
