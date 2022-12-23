package com.google.android.gms.internal.contextmanager;

public enum zzgf implements zzmh {
    UNKNOWN_PLACE_FENCE_TRIGGER_TYPE(0),
    IN(1),
    ENTERING(2),
    EXITING(3),
    SCREEN_ON_CHANGE(4),
    AT_A_PLACE_CHANGE(5);
    
    private static final zzmi<zzgf> zzg = null;
    private final int zzi;

    /* access modifiers changed from: public */
    static {
        zzg = new zzgd();
    }

    private zzgf(int i) {
        this.zzi = i;
    }

    public static zzgf zzb(int i) {
        if (i == 0) {
            return UNKNOWN_PLACE_FENCE_TRIGGER_TYPE;
        }
        if (i == 1) {
            return IN;
        }
        if (i == 2) {
            return ENTERING;
        }
        if (i == 3) {
            return EXITING;
        }
        if (i == 4) {
            return SCREEN_ON_CHANGE;
        }
        if (i != 5) {
            return null;
        }
        return AT_A_PLACE_CHANGE;
    }

    public static zzmj zzc() {
        return zzge.zza;
    }

    public final String toString() {
        return "<" + zzgf.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzi + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzi;
    }
}
