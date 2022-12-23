package com.google.android.gms.internal.contextmanager;

public enum zzfd implements zzmh {
    UNKNOWN_LOCATION_FENCE_GEOMETRY_TYPE(0),
    CIRCLE(1);
    
    private static final zzmi<zzfd> zzc = null;
    private final int zze;

    /* access modifiers changed from: public */
    static {
        zzc = new zzfb();
    }

    private zzfd(int i) {
        this.zze = i;
    }

    public static zzfd zzb(int i) {
        if (i == 0) {
            return UNKNOWN_LOCATION_FENCE_GEOMETRY_TYPE;
        }
        if (i != 1) {
            return null;
        }
        return CIRCLE;
    }

    public static zzmj zzc() {
        return zzfc.zza;
    }

    public final String toString() {
        return "<" + zzfd.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zze + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zze;
    }
}
