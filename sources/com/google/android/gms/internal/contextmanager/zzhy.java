package com.google.android.gms.internal.contextmanager;

public enum zzhy implements zzmh {
    UNKNOWN_TIME_FENCE_TRIGGER_TYPE(0),
    ABSOLUTE_INTERVAL(1),
    DAILY_INTERVAL(2),
    WEEKEND_INTERVAL(3),
    WEEKDAY_INTERVAL(4),
    SUNDAY_INTERVAL(5),
    MONDAY_INTERVAL(6),
    TUESDAY_INTERVAL(7),
    WEDNESDAY_INTERVAL(8),
    THURSDAY_INTERVAL(9),
    FRIDAY_INTERVAL(10),
    SATURDAY_INTERVAL(11),
    AFTER_LOCAL_TIME(12);
    
    private static final zzmi<zzhy> zzn = null;
    private final int zzp;

    /* access modifiers changed from: public */
    static {
        zzn = new zzhw();
    }

    private zzhy(int i) {
        this.zzp = i;
    }

    public static zzhy zzb(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_TIME_FENCE_TRIGGER_TYPE;
            case 1:
                return ABSOLUTE_INTERVAL;
            case 2:
                return DAILY_INTERVAL;
            case 3:
                return WEEKEND_INTERVAL;
            case 4:
                return WEEKDAY_INTERVAL;
            case 5:
                return SUNDAY_INTERVAL;
            case 6:
                return MONDAY_INTERVAL;
            case 7:
                return TUESDAY_INTERVAL;
            case 8:
                return WEDNESDAY_INTERVAL;
            case 9:
                return THURSDAY_INTERVAL;
            case 10:
                return FRIDAY_INTERVAL;
            case 11:
                return SATURDAY_INTERVAL;
            case 12:
                return AFTER_LOCAL_TIME;
            default:
                return null;
        }
    }

    public static zzmj zzc() {
        return zzhx.zza;
    }

    public final String toString() {
        return "<" + zzhy.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzp + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzp;
    }
}
