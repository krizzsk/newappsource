package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkl */
public final class zzkl extends zzach implements zzadn {
    /* access modifiers changed from: private */
    public static final zzkl zzb;
    /* access modifiers changed from: private */
    public int zze;
    private int zzf;

    static {
        zzkl zzkl = new zzkl();
        zzb = zzkl;
        zzach.zzE(zzkl.class, zzkl);
    }

    private zzkl() {
    }

    public static zzkk zzb() {
        return (zzkk) zzb.zzt();
    }

    public static zzkl zzd(zzabe zzabe, zzabu zzabu) throws zzacp {
        return (zzkl) zzach.zzw(zzb, zzabe, zzabu);
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
            return zzach.zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzkl();
        } else {
            if (i2 == 4) {
                return new zzkk((zzkj) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
