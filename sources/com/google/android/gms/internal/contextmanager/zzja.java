package com.google.android.gms.internal.contextmanager;

public enum zzja implements zzmh {
    UNKNOWN_BLUETOOTH_A2DP_STATE(0),
    BLUETOOTH_A2DP_ON(1),
    BLUETOOTH_A2DP_OFF(2);
    
    private static final zzmi<zzja> zzd = null;
    private final int zzf;

    /* access modifiers changed from: public */
    static {
        zzd = new zziy();
    }

    private zzja(int i) {
        this.zzf = i;
    }

    public static zzja zzb(int i) {
        if (i == 0) {
            return UNKNOWN_BLUETOOTH_A2DP_STATE;
        }
        if (i == 1) {
            return BLUETOOTH_A2DP_ON;
        }
        if (i != 2) {
            return null;
        }
        return BLUETOOTH_A2DP_OFF;
    }

    public static zzmj zzc() {
        return zziz.zza;
    }

    public final String toString() {
        return "<" + zzja.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzf;
    }
}
