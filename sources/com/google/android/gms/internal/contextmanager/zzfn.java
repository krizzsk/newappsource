package com.google.android.gms.internal.contextmanager;

public enum zzfn implements zzmh {
    UNKNOWN_NETWORK_STATE_FENCE_TRIGGER_TYPE(0),
    CONNECTION_DURING(1),
    CONNECTION_STARTING(2),
    CONNECTION_STOPPING(3),
    METER_DURING(4),
    METER_STARTING(5),
    METER_STOPPING(6);
    
    private static final zzmi<zzfn> zzh = null;
    private final int zzj;

    /* access modifiers changed from: public */
    static {
        zzh = new zzfl();
    }

    private zzfn(int i) {
        this.zzj = i;
    }

    public static zzfn zzb(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_NETWORK_STATE_FENCE_TRIGGER_TYPE;
            case 1:
                return CONNECTION_DURING;
            case 2:
                return CONNECTION_STARTING;
            case 3:
                return CONNECTION_STOPPING;
            case 4:
                return METER_DURING;
            case 5:
                return METER_STARTING;
            case 6:
                return METER_STOPPING;
            default:
                return null;
        }
    }

    public static zzmj zzc() {
        return zzfm.zza;
    }

    public final String toString() {
        return "<" + zzfn.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzj + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzj;
    }
}
