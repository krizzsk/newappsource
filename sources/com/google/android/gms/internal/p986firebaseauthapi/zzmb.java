package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmb */
public final class zzmb extends zzach implements zzadn {
    /* access modifiers changed from: private */
    public static final zzmb zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        zzmb zzmb = new zzmb();
        zzb = zzmb;
        zzach.zzE(zzmb.class, zzmb);
    }

    private zzmb() {
    }

    public static zzma zzb() {
        return (zzma) zzb.zzt();
    }

    public static zzmb zzd() {
        return zzb;
    }

    public final int zza() {
        return this.zzf;
    }

    public final int zzf() {
        int zzb2 = zzls.zzb(this.zze);
        if (zzb2 == 0) {
            return 1;
        }
        return zzb2;
    }

    public final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzach.zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzmb();
        } else {
            if (i2 == 4) {
                return new zzma((zzlz) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
