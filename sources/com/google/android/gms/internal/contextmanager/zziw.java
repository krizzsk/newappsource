package com.google.android.gms.internal.contextmanager;

public enum zziw implements zzmh {
    UNKNOWN_WIFI_FENCE_TRIGGER_TYPE(0),
    CONNECTED(1),
    FOUND(2);
    
    private static final zzmi<zziw> zzd = null;
    private final int zzf;

    /* access modifiers changed from: public */
    static {
        zzd = new zziu();
    }

    private zziw(int i) {
        this.zzf = i;
    }

    public static zziw zzb(int i) {
        if (i == 0) {
            return UNKNOWN_WIFI_FENCE_TRIGGER_TYPE;
        }
        if (i == 1) {
            return CONNECTED;
        }
        if (i != 2) {
            return null;
        }
        return FOUND;
    }

    public static zzmj zzc() {
        return zziv.zza;
    }

    public final String toString() {
        return "<" + zziw.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzf;
    }
}
