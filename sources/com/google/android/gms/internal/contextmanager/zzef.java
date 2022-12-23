package com.google.android.gms.internal.contextmanager;

public enum zzef implements zzmh {
    UNKNOWN_CONTEXT_FENCE_TYPE(0),
    AND(1),
    OR(2),
    NOT(3),
    TIME_FENCE(4),
    LOCATION_FENCE(5),
    PLACE_FENCE(6),
    ACTIVITY_FENCE(7),
    SCREEN_FENCE(8),
    POWER_CONNECTION_FENCE(9),
    PHONE_LOCK_FENCE(10),
    AUDIO_STATE_FENCE(11),
    BEACON_FENCE(12),
    NETWORK_STATE_FENCE(13),
    WANDER_STATE_FENCE(14),
    TIME_INTERVAL_FENCE(15),
    INSTALLED_APPS_FENCE(16),
    PHONE_CALL_FENCE(17),
    PROXIMITY_DISTANCE_FENCE(18),
    SUN_STATE_FENCE(19),
    LOCAL_TIME_FENCE(20),
    WEATHER_FENCE(21),
    PREDICTIVE(22),
    SHUSH_STATE_FENCE(23),
    WIFI_STATE_FENCE(24);
    
    private static final zzmi<zzef> zzz = null;
    private final int zzB;

    /* access modifiers changed from: public */
    static {
        zzz = new zzed();
    }

    private zzef(int i) {
        this.zzB = i;
    }

    public static zzef zzb(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_CONTEXT_FENCE_TYPE;
            case 1:
                return AND;
            case 2:
                return OR;
            case 3:
                return NOT;
            case 4:
                return TIME_FENCE;
            case 5:
                return LOCATION_FENCE;
            case 6:
                return PLACE_FENCE;
            case 7:
                return ACTIVITY_FENCE;
            case 8:
                return SCREEN_FENCE;
            case 9:
                return POWER_CONNECTION_FENCE;
            case 10:
                return PHONE_LOCK_FENCE;
            case 11:
                return AUDIO_STATE_FENCE;
            case 12:
                return BEACON_FENCE;
            case 13:
                return NETWORK_STATE_FENCE;
            case 14:
                return WANDER_STATE_FENCE;
            case 15:
                return TIME_INTERVAL_FENCE;
            case 16:
                return INSTALLED_APPS_FENCE;
            case 17:
                return PHONE_CALL_FENCE;
            case 18:
                return PROXIMITY_DISTANCE_FENCE;
            case 19:
                return SUN_STATE_FENCE;
            case 20:
                return LOCAL_TIME_FENCE;
            case 21:
                return WEATHER_FENCE;
            case 22:
                return PREDICTIVE;
            case 23:
                return SHUSH_STATE_FENCE;
            case 24:
                return WIFI_STATE_FENCE;
            default:
                return null;
        }
    }

    public static zzmj zzc() {
        return zzee.zza;
    }

    public final String toString() {
        return "<" + zzef.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzB + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzB;
    }
}
