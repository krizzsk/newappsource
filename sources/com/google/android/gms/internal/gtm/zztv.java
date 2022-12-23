package com.google.android.gms.internal.gtm;

public final class zztv extends zzuz<zztv, zztu> implements zzwl {
    /* access modifiers changed from: private */
    public static final zztv zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        zztv zztv = new zztv();
        zza = zztv;
        zzuz.zzak(zztv.class, zztv);
    }

    private zztv() {
    }

    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzwv(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zztv();
        } else {
            if (i2 == 4) {
                return new zztu((zztq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
