package com.google.android.gms.internal.contextmanager;

public enum zzjg implements zzmh {
    UNKNOWN_HEADPHONE_STATE(0),
    PLUGGED(1),
    UNPLUGGED(2);
    
    private static final zzmi<zzjg> zzd = null;
    private final int zzf;

    /* access modifiers changed from: public */
    static {
        zzd = new zzje();
    }

    private zzjg(int i) {
        this.zzf = i;
    }

    public static zzjg zzb(int i) {
        if (i == 0) {
            return UNKNOWN_HEADPHONE_STATE;
        }
        if (i == 1) {
            return PLUGGED;
        }
        if (i != 2) {
            return null;
        }
        return UNPLUGGED;
    }

    public static zzmj zzc() {
        return zzjf.zza;
    }

    public final String toString() {
        return "<" + zzjg.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzf;
    }
}
