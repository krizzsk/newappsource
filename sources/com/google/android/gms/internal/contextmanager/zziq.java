package com.google.android.gms.internal.contextmanager;

public enum zziq implements zzmh {
    UNKNOWN_WEATHER_FENCE_TRIGGER_TYPE(0),
    IN_TEMPERATURE_RANGE(1),
    IN_FEELS_LIKE_TEMPERATURE_RANGE(2),
    IN_DEW_POINT_RANGE(3),
    IN_HUMIDITY_RANGE(4),
    IN_CONDITION(5);
    
    private static final zzmi<zziq> zzg = null;
    private final int zzi;

    /* access modifiers changed from: public */
    static {
        zzg = new zzio();
    }

    private zziq(int i) {
        this.zzi = i;
    }

    public static zziq zzb(int i) {
        if (i == 0) {
            return UNKNOWN_WEATHER_FENCE_TRIGGER_TYPE;
        }
        if (i == 1) {
            return IN_TEMPERATURE_RANGE;
        }
        if (i == 2) {
            return IN_FEELS_LIKE_TEMPERATURE_RANGE;
        }
        if (i == 3) {
            return IN_DEW_POINT_RANGE;
        }
        if (i == 4) {
            return IN_HUMIDITY_RANGE;
        }
        if (i != 5) {
            return null;
        }
        return IN_CONDITION;
    }

    public static zzmj zzc() {
        return zzip.zza;
    }

    public final String toString() {
        return "<" + zziq.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzi + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzi;
    }
}
