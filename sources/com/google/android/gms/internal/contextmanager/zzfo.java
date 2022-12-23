package com.google.android.gms.internal.contextmanager;

public final class zzfo extends zzmf<zzfo, zzfk> implements zzno {
    private static final zzml<Integer, zzjy> zza = new zzfi();
    private static final zzml<Integer, zzkb> zze = new zzfj();
    /* access modifiers changed from: private */
    public static final zzfo zzf;
    private int zzg;
    private int zzh;
    private long zzi;
    private zzmk zzj = zzmf.zzC();
    private zzmk zzk = zzmf.zzC();

    static {
        zzfo zzfo = new zzfo();
        zzf = zzfo;
        zzmf.zzH(zzfo.class, zzfo);
    }

    private zzfo() {
    }

    public final Object zzf(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmf.zzG(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003\u001e\u0004\u001e", new Object[]{"zzg", "zzh", zzfn.zzc(), "zzi", "zzj", zzjy.zzc(), "zzk", zzkb.zzc()});
        } else if (i2 == 3) {
            return new zzfo();
        } else {
            if (i2 == 4) {
                return new zzfk((zzfi) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzf;
        }
    }
}
