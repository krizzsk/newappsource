package com.google.android.gms.internal.contextmanager;

public enum zzjm implements zzmh {
    UNKNOWN_MUSIC_STATE(0),
    MUSIC_ACTIVE(1),
    MUSIC_INACTIVE(2);
    
    private static final zzmi<zzjm> zzd = null;
    private final int zzf;

    /* access modifiers changed from: public */
    static {
        zzd = new zzjk();
    }

    private zzjm(int i) {
        this.zzf = i;
    }

    public static zzjm zzb(int i) {
        if (i == 0) {
            return UNKNOWN_MUSIC_STATE;
        }
        if (i == 1) {
            return MUSIC_ACTIVE;
        }
        if (i != 2) {
            return null;
        }
        return MUSIC_INACTIVE;
    }

    public static zzmj zzc() {
        return zzjl.zza;
    }

    public final String toString() {
        return "<" + zzjm.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzf;
    }
}
