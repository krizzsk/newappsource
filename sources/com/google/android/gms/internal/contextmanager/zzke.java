package com.google.android.gms.internal.contextmanager;

public enum zzke implements zzmh {
    UNKNOWN(0),
    UNLOCKED(1),
    LOCKED(2);
    
    private static final zzmi<zzke> zzd = null;
    private final int zzf;

    /* access modifiers changed from: public */
    static {
        zzd = new zzkc();
    }

    private zzke(int i) {
        this.zzf = i;
    }

    public static zzke zzb(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return UNLOCKED;
        }
        if (i != 2) {
            return null;
        }
        return LOCKED;
    }

    public static zzmj zzc() {
        return zzkd.zza;
    }

    public final String toString() {
        return "<" + zzke.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzf;
    }
}
