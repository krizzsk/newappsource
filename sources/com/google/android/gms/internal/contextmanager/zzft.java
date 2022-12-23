package com.google.android.gms.internal.contextmanager;

public enum zzft implements zzmh {
    UNKNOWN_PHONE_CALL_TRIGGER_TYPE(0),
    IN_CALL(1),
    NOT_IN_CALL(2);
    
    private static final zzmi<zzft> zzd = null;
    private final int zzf;

    /* access modifiers changed from: public */
    static {
        zzd = new zzfr();
    }

    private zzft(int i) {
        this.zzf = i;
    }

    public static zzft zzb(int i) {
        if (i == 0) {
            return UNKNOWN_PHONE_CALL_TRIGGER_TYPE;
        }
        if (i == 1) {
            return IN_CALL;
        }
        if (i != 2) {
            return null;
        }
        return NOT_IN_CALL;
    }

    public static zzmj zzc() {
        return zzfs.zza;
    }

    public final String toString() {
        return "<" + zzft.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzf;
    }
}
