package com.google.android.gms.internal.contextmanager;

public enum zzkk implements zzmh {
    UNKNOWN(0),
    OFF(1),
    ON(2);
    
    private static final zzmi<zzkk> zzd = null;
    private final int zzf;

    /* access modifiers changed from: public */
    static {
        zzd = new zzki();
    }

    private zzkk(int i) {
        this.zzf = i;
    }

    public static zzkk zzb(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return OFF;
        }
        if (i != 2) {
            return null;
        }
        return ON;
    }

    public static zzmj zzc() {
        return zzkj.zza;
    }

    public final String toString() {
        return "<" + zzkk.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzf;
    }
}
