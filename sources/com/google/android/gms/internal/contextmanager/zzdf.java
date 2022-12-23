package com.google.android.gms.internal.contextmanager;

public enum zzdf implements zzmh {
    UNKNOWN_AUDIO_STATE_FENCE_TRIGGER_TYPE(0),
    HEADPHONE_DURING(1),
    HEADPHONE_PLUGGING(2),
    HEADPHONE_UNPLUGGING(3),
    BLUETOOTH_A2DP_DURING(4),
    BLUETOOTH_A2DP_TURNING_ON(5),
    BLUETOOTH_A2DP_TURNING_OFF(6),
    BLUETOOTH_SCO_DURING(7),
    BLUETOOTH_SCO_TURNING_ON(8),
    BLUETOOTH_SCO_TURNING_OFF(9),
    MICROPHONE_DURING(10),
    MICROPHONE_MUTING(11),
    MICROPHONE_UNMUTING(12),
    MUSIC_DURING(13),
    MUSIC_ACTIVATING(14),
    MUSIC_DEACTIVATING(15),
    SPEAKER_PHONE_DURING(16),
    SPEAKER_PHONE_TURNING_ON(17),
    SPEAKER_PHONE_TURNING_OFF(18);
    
    private static final zzmi<zzdf> zzt = null;
    private final int zzv;

    /* access modifiers changed from: public */
    static {
        zzt = new zzdd();
    }

    private zzdf(int i) {
        this.zzv = i;
    }

    public static zzdf zzb(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_AUDIO_STATE_FENCE_TRIGGER_TYPE;
            case 1:
                return HEADPHONE_DURING;
            case 2:
                return HEADPHONE_PLUGGING;
            case 3:
                return HEADPHONE_UNPLUGGING;
            case 4:
                return BLUETOOTH_A2DP_DURING;
            case 5:
                return BLUETOOTH_A2DP_TURNING_ON;
            case 6:
                return BLUETOOTH_A2DP_TURNING_OFF;
            case 7:
                return BLUETOOTH_SCO_DURING;
            case 8:
                return BLUETOOTH_SCO_TURNING_ON;
            case 9:
                return BLUETOOTH_SCO_TURNING_OFF;
            case 10:
                return MICROPHONE_DURING;
            case 11:
                return MICROPHONE_MUTING;
            case 12:
                return MICROPHONE_UNMUTING;
            case 13:
                return MUSIC_DURING;
            case 14:
                return MUSIC_ACTIVATING;
            case 15:
                return MUSIC_DEACTIVATING;
            case 16:
                return SPEAKER_PHONE_DURING;
            case 17:
                return SPEAKER_PHONE_TURNING_ON;
            case 18:
                return SPEAKER_PHONE_TURNING_OFF;
            default:
                return null;
        }
    }

    public static zzmj zzc() {
        return zzde.zza;
    }

    public final String toString() {
        return "<" + zzdf.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzv + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzv;
    }
}
