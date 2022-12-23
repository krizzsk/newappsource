package com.google.android.gms.internal.contextmanager;

public enum zzea implements zzmh {
    UNKNOWN_CONTEXT_FAMILY(0),
    USER_ACTIVITY(1),
    USER_STATE(2),
    zzd(3),
    PLACE(4),
    PROXIMITY(5),
    AMBIENCE(6),
    DEVICE_STATE(7),
    DEVICE_ACTIVITY(8),
    USER_PROFILE(9),
    SEMANTIC_TIME(10),
    TASKS(11),
    SUGGEST_STATE(12);
    
    private static final zzmi<zzea> zzn = null;
    private final int zzp;

    /* access modifiers changed from: public */
    static {
        zzn = new zzdy();
    }

    private zzea(int i) {
        this.zzp = i;
    }

    public static zzea zzb(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_CONTEXT_FAMILY;
            case 1:
                return USER_ACTIVITY;
            case 2:
                return USER_STATE;
            case 3:
                return zzd;
            case 4:
                return PLACE;
            case 5:
                return PROXIMITY;
            case 6:
                return AMBIENCE;
            case 7:
                return DEVICE_STATE;
            case 8:
                return DEVICE_ACTIVITY;
            case 9:
                return USER_PROFILE;
            case 10:
                return SEMANTIC_TIME;
            case 11:
                return TASKS;
            case 12:
                return SUGGEST_STATE;
            default:
                return null;
        }
    }

    public static zzmj zzc() {
        return zzdz.zza;
    }

    public final String toString() {
        return "<" + zzea.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzp + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzp;
    }
}
