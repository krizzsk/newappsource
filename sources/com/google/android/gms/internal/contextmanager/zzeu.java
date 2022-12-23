package com.google.android.gms.internal.contextmanager;

public enum zzeu implements zzmh {
    UNKNOWN_INSTALLED_APPS_TRIGGER_TYPE(0),
    INSTALLED(1),
    NOT_INSTALLED(2);
    
    private static final zzmi<zzeu> zzd = null;
    private final int zzf;

    /* access modifiers changed from: public */
    static {
        zzd = new zzes();
    }

    private zzeu(int i) {
        this.zzf = i;
    }

    public static zzeu zzb(int i) {
        if (i == 0) {
            return UNKNOWN_INSTALLED_APPS_TRIGGER_TYPE;
        }
        if (i == 1) {
            return INSTALLED;
        }
        if (i != 2) {
            return null;
        }
        return NOT_INSTALLED;
    }

    public static zzmj zzc() {
        return zzet.zza;
    }

    public final String toString() {
        return "<" + zzeu.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzf;
    }
}
