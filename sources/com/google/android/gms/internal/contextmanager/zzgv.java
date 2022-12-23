package com.google.android.gms.internal.contextmanager;

public final class zzgv extends zzmf<zzgv, zzgr> implements zzno {
    /* access modifiers changed from: private */
    public static final zzgv zza;
    private int zze;
    private int zzf;

    static {
        zzgv zzgv = new zzgv();
        zza = zzgv;
        zzmf.zzH(zzgv.class, zzgv);
    }

    private zzgv() {
    }

    public final Object zzf(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmf.zzG(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zze", "zzf", zzgu.zzc()});
        } else if (i2 == 3) {
            return new zzgv();
        } else {
            if (i2 == 4) {
                return new zzgr((zzgq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
