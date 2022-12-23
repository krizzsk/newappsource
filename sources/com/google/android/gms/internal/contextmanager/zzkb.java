package com.google.android.gms.internal.contextmanager;

public enum zzkb implements zzmh {
    UNKNOWN_METER_TYPE(0),
    METERED(1),
    UNMETERED(2);
    
    private static final zzmi<zzkb> zzd = null;
    private final int zzf;

    /* access modifiers changed from: public */
    static {
        zzd = new zzjz();
    }

    private zzkb(int i) {
        this.zzf = i;
    }

    public static zzkb zzb(int i) {
        if (i == 0) {
            return UNKNOWN_METER_TYPE;
        }
        if (i == 1) {
            return METERED;
        }
        if (i != 2) {
            return null;
        }
        return UNMETERED;
    }

    public static zzmj zzc() {
        return zzka.zza;
    }

    public final String toString() {
        return "<" + zzkb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzf;
    }
}
