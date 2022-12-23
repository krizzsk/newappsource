package com.google.android.gms.internal.contextmanager;

public enum zzjd implements zzmh {
    UNKNOWN_BLUETOOTH_SCO_STATE(0),
    BLUETOOTH_SCO_ON(1),
    BLUETOOTH_SCO_OFF(2);
    
    private static final zzmi<zzjd> zzd = null;
    private final int zzf;

    /* access modifiers changed from: public */
    static {
        zzd = new zzjb();
    }

    private zzjd(int i) {
        this.zzf = i;
    }

    public static zzjd zzb(int i) {
        if (i == 0) {
            return UNKNOWN_BLUETOOTH_SCO_STATE;
        }
        if (i == 1) {
            return BLUETOOTH_SCO_ON;
        }
        if (i != 2) {
            return null;
        }
        return BLUETOOTH_SCO_OFF;
    }

    public static zzmj zzc() {
        return zzjc.zza;
    }

    public final String toString() {
        return "<" + zzjd.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzf;
    }
}
