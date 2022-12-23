package com.google.android.gms.internal.contextmanager;

public enum zzhs implements zzmh {
    INSTANTANEOUS(1),
    ONGOING(2),
    INTERVAL(3);
    
    private static final zzmi<zzhs> zzd = null;
    private final int zzf;

    /* access modifiers changed from: public */
    static {
        zzd = new zzhq();
    }

    private zzhs(int i) {
        this.zzf = i;
    }

    public static zzhs zzb(int i) {
        if (i == 1) {
            return INSTANTANEOUS;
        }
        if (i == 2) {
            return ONGOING;
        }
        if (i != 3) {
            return null;
        }
        return INTERVAL;
    }

    public static zzmj zzc() {
        return zzhr.zza;
    }

    public final String toString() {
        return "<" + zzhs.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzf;
    }
}
