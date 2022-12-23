package com.google.android.gms.internal.contextmanager;

public final class zzhh extends zzmf<zzhh, zzhg> implements zzno {
    /* access modifiers changed from: private */
    public static final zzhh zza;
    private int zze;
    private String zzf = "";

    static {
        zzhh zzhh = new zzhh();
        zza = zzhh;
        zzmf.zzH(zzhh.class, zzhh);
    }

    private zzhh() {
    }

    public final Object zzf(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmf.zzG(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzhh();
        } else {
            if (i2 == 4) {
                return new zzhg((zzhf) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
