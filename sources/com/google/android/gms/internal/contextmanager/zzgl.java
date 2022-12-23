package com.google.android.gms.internal.contextmanager;

public enum zzgl implements zzmh {
    UNKNOWN_POWER_CONNECTION_FENCE_TRIGGER_TYPE(0),
    BATTERY_LEVEL_IN(1),
    BATTERY_LEVEL_ENTERING(2),
    BATTERY_LEVEL_EXITING(3),
    PLUGGED_IN_STATE_DURING(4),
    PLUGGED_IN_STATE_STARTING(5),
    PLUGGED_IN_STATE_STOPPING(6);
    
    private static final zzmi<zzgl> zzh = null;
    private final int zzj;

    /* access modifiers changed from: public */
    static {
        zzh = new zzgj();
    }

    private zzgl(int i) {
        this.zzj = i;
    }

    public static zzgl zzb(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_POWER_CONNECTION_FENCE_TRIGGER_TYPE;
            case 1:
                return BATTERY_LEVEL_IN;
            case 2:
                return BATTERY_LEVEL_ENTERING;
            case 3:
                return BATTERY_LEVEL_EXITING;
            case 4:
                return PLUGGED_IN_STATE_DURING;
            case 5:
                return PLUGGED_IN_STATE_STARTING;
            case 6:
                return PLUGGED_IN_STATE_STOPPING;
            default:
                return null;
        }
    }

    public static zzmj zzc() {
        return zzgk.zza;
    }

    public final String toString() {
        return "<" + zzgl.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzj + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzj;
    }
}
