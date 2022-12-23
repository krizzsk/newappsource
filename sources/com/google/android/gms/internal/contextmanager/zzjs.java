package com.google.android.gms.internal.contextmanager;

public enum zzjs implements zzmh {
    UNKNOWN(0),
    WEEKDAY(1),
    WEEKEND(2),
    HOLIDAY(3),
    MORNING(4),
    AFTERNOON(5),
    EVENING(6),
    NIGHT(7);
    
    private static final zzmi<zzjs> zzi = null;
    private final int zzk;

    /* access modifiers changed from: public */
    static {
        zzi = new zzjq();
    }

    private zzjs(int i) {
        this.zzk = i;
    }

    public static zzjs zzb(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return WEEKDAY;
            case 2:
                return WEEKEND;
            case 3:
                return HOLIDAY;
            case 4:
                return MORNING;
            case 5:
                return AFTERNOON;
            case 6:
                return EVENING;
            case 7:
                return NIGHT;
            default:
                return null;
        }
    }

    public static zzmj zzc() {
        return zzjr.zza;
    }

    public final String toString() {
        return "<" + zzjs.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzk + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzk;
    }
}
