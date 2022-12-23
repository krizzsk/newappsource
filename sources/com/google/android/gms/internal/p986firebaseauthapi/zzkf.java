package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkf */
public final class zzkf extends zzach implements zzadn {
    /* access modifiers changed from: private */
    public static final zzkf zzb;
    /* access modifiers changed from: private */
    public int zze;
    private int zzf;

    static {
        zzkf zzkf = new zzkf();
        zzb = zzkf;
        zzach.zzE(zzkf.class, zzkf);
    }

    private zzkf() {
    }

    public static zzke zzb() {
        return (zzke) zzb.zzt();
    }

    public static zzkf zzd(zzabe zzabe, zzabu zzabu) throws zzacp {
        return (zzkf) zzach.zzw(zzb, zzabe, zzabu);
    }

    public final int zza() {
        return this.zze;
    }

    public final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzach.zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzf", "zze"});
        } else if (i2 == 3) {
            return new zzkf();
        } else {
            if (i2 == 4) {
                return new zzke((zzkd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
