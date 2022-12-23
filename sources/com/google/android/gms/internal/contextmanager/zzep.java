package com.google.android.gms.internal.contextmanager;

public final class zzep extends zzmf<zzep, zzeo> implements zzno {
    /* access modifiers changed from: private */
    public static final zzep zza;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    static {
        zzep zzep = new zzep();
        zza = zzep;
        zzmf.zzH(zzep.class, zzep);
    }

    private zzep() {
    }

    public final Object zzf(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmf.zzG(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i2 == 3) {
            return new zzep();
        } else {
            if (i2 == 4) {
                return new zzeo((zzen) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
