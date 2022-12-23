package com.google.android.gms.internal.contextmanager;

public enum zzjj implements zzmh {
    UNKNOWN_MICROPHONE_STATE(0),
    MICROPHONE_MUTE_ON(1),
    MICROPHONE_MUTE_OFF(2);
    
    private static final zzmi<zzjj> zzd = null;
    private final int zzf;

    /* access modifiers changed from: public */
    static {
        zzd = new zzjh();
    }

    private zzjj(int i) {
        this.zzf = i;
    }

    public static zzjj zzb(int i) {
        if (i == 0) {
            return UNKNOWN_MICROPHONE_STATE;
        }
        if (i == 1) {
            return MICROPHONE_MUTE_ON;
        }
        if (i != 2) {
            return null;
        }
        return MICROPHONE_MUTE_OFF;
    }

    public static zzmj zzc() {
        return zzji.zza;
    }

    public final String toString() {
        return "<" + zzjj.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzf;
    }
}
