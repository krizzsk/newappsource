package com.google.android.gms.internal.contextmanager;

public final class zzil extends zzmf<zzil, zzih> implements zzno {
    /* access modifiers changed from: private */
    public static final zzil zza;
    private int zze;
    private int zzf;
    private long zzg;
    private float zzh;
    private int zzi;

    static {
        zzil zzil = new zzil();
        zza = zzil;
        zzmf.zzH(zzil.class, zzil);
    }

    private zzil() {
    }

    public final Object zzf(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmf.zzG(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ခ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", zzik.zzc(), "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new zzil();
        } else {
            if (i2 == 4) {
                return new zzih((zzig) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
