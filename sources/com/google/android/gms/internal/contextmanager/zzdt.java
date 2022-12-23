package com.google.android.gms.internal.contextmanager;

public enum zzdt implements zzmh {
    UNKNOWN_SIGNAL_TYPE(0),
    OBSERVED(1),
    INFERRED(2),
    MODEL(3),
    REPLAY_INJECTED(4);
    
    private static final zzmi<zzdt> zzf = null;
    private final int zzh;

    /* access modifiers changed from: public */
    static {
        zzf = new zzdr();
    }

    private zzdt(int i) {
        this.zzh = i;
    }

    public static zzdt zzb(int i) {
        if (i == 0) {
            return UNKNOWN_SIGNAL_TYPE;
        }
        if (i == 1) {
            return OBSERVED;
        }
        if (i == 2) {
            return INFERRED;
        }
        if (i == 3) {
            return MODEL;
        }
        if (i != 4) {
            return null;
        }
        return REPLAY_INJECTED;
    }

    public static zzmj zzc() {
        return zzds.zza;
    }

    public final String toString() {
        return "<" + zzdt.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzh + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzh;
    }
}
