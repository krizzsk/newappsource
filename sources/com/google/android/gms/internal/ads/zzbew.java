package com.google.android.gms.internal.ads;

public final class zzbew extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzbew zzb;
    private int zze;
    private int zzf;
    private zzbgl zzg;
    private String zzh = "";
    private String zzi = "";

    static {
        zzbew zzbew = new zzbew();
        zzb = zzbew;
        zzgko.zzaN(zzbew.class, zzbew);
    }

    private zzbew() {
    }

    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgko.zzaM(zzb, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005á\u0000\u0006á\u0001\u0007á\u0002\bá\u0003", new Object[]{"zze", "zzf", zzbev.zza, "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new zzbew();
        } else {
            if (i2 == 4) {
                return new zzbeu((zzbds) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
