package com.google.android.gms.internal.ads;

public final class zzbgj extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzbgj zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzbgj zzbgj = new zzbgj();
        zzb = zzbgj;
        zzgko.zzaN(zzbgj.class, zzbgj);
    }

    private zzbgj() {
    }

    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgko.zzaM(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzbgj();
        } else {
            if (i2 == 4) {
                return new zzbgi((zzbds) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
