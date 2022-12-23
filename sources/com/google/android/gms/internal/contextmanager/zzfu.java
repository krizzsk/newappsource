package com.google.android.gms.internal.contextmanager;

public final class zzfu extends zzmf<zzfu, zzfq> implements zzno {
    /* access modifiers changed from: private */
    public static final zzfu zza;
    private int zze;
    private int zzf;

    static {
        zzfu zzfu = new zzfu();
        zza = zzfu;
        zzmf.zzH(zzfu.class, zzfu);
    }

    private zzfu() {
    }

    public final Object zzf(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmf.zzG(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zze", "zzf", zzft.zzc()});
        } else if (i2 == 3) {
            return new zzfu();
        } else {
            if (i2 == 4) {
                return new zzfq((zzfp) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
