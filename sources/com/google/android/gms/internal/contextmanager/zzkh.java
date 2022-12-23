package com.google.android.gms.internal.contextmanager;

public enum zzkh implements zzmh {
    UNKNOWN(0),
    DISCONNECTED(1),
    CONNECTED_USB(2),
    CONNECTED_AC(3),
    CONNECTED_WIRELESS(4);
    
    private static final zzmi<zzkh> zzf = null;
    private final int zzh;

    /* access modifiers changed from: public */
    static {
        zzf = new zzkf();
    }

    private zzkh(int i) {
        this.zzh = i;
    }

    public static zzkh zzb(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return DISCONNECTED;
        }
        if (i == 2) {
            return CONNECTED_USB;
        }
        if (i == 3) {
            return CONNECTED_AC;
        }
        if (i != 4) {
            return null;
        }
        return CONNECTED_WIRELESS;
    }

    public static zzmj zzc() {
        return zzkg.zza;
    }

    public final String toString() {
        return "<" + zzkh.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzh + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzh;
    }
}
