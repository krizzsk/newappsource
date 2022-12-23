package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkw */
public final class zzkw extends zzach implements zzadn {
    /* access modifiers changed from: private */
    public static final zzkw zzb;
    private zzmz zze;

    static {
        zzkw zzkw = new zzkw();
        zzb = zzkw;
        zzach.zzE(zzkw.class, zzkw);
    }

    private zzkw() {
    }

    public static zzkv zza() {
        return (zzkv) zzb.zzt();
    }

    public static zzkw zzc() {
        return zzb;
    }

    public static /* synthetic */ void zze(zzkw zzkw, zzmz zzmz) {
        zzmz.getClass();
        zzkw.zze = zzmz;
    }

    public final zzmz zzd() {
        zzmz zzmz = this.zze;
        return zzmz == null ? zzmz.zzc() : zzmz;
    }

    public final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzach.zzD(zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new zzkw();
        } else {
            if (i2 == 4) {
                return new zzkv((zzku) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
