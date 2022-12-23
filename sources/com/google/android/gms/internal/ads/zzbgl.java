package com.google.android.gms.internal.ads;

public final class zzbgl extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzbgl zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzbgl zzbgl = new zzbgl();
        zzb = zzbgl;
        zzgko.zzaN(zzbgl.class, zzbgl);
    }

    private zzbgl() {
    }

    public static zzbgk zza() {
        return (zzbgk) zzb.zzaw();
    }

    public static /* synthetic */ void zzd(zzbgl zzbgl, int i) {
        zzbgl.zze |= 1;
        zzbgl.zzf = i;
    }

    public static /* synthetic */ void zze(zzbgl zzbgl, int i) {
        zzbgl.zze |= 2;
        zzbgl.zzg = i;
    }

    public static /* synthetic */ void zzf(zzbgl zzbgl, int i) {
        zzbgl.zze |= 4;
        zzbgl.zzh = i;
    }

    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgko.zzaM(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzbgl();
        } else {
            if (i2 == 4) {
                return new zzbgk((zzbds) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
