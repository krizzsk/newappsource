package com.google.android.gms.internal.contextmanager;

public enum zzjp implements zzmh {
    UNKNOWN_SPEAKERPHONE_STATE(0),
    SPEAKER_PHONE_ON(1),
    SPEAKER_PHONE_OFF(2);
    
    private static final zzmi<zzjp> zzd = null;
    private final int zzf;

    /* access modifiers changed from: public */
    static {
        zzd = new zzjn();
    }

    private zzjp(int i) {
        this.zzf = i;
    }

    public static zzjp zzb(int i) {
        if (i == 0) {
            return UNKNOWN_SPEAKERPHONE_STATE;
        }
        if (i == 1) {
            return SPEAKER_PHONE_ON;
        }
        if (i != 2) {
            return null;
        }
        return SPEAKER_PHONE_OFF;
    }

    public static zzmj zzc() {
        return zzjo.zza;
    }

    public final String toString() {
        return "<" + zzjp.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzf;
    }
}
