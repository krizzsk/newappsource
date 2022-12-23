package com.google.android.gms.internal.contextmanager;

public final class zzgm extends zzmf<zzgm, zzgi> implements zzno {
    private static final zzml<Integer, zzkh> zza = new zzgh();
    /* access modifiers changed from: private */
    public static final zzgm zze;
    private int zzf;
    private int zzg;
    private double zzh;
    private double zzi;
    private long zzj;
    private zzmk zzk = zzmf.zzC();

    static {
        zzgm zzgm = new zzgm();
        zze = zzgm;
        zzmf.zzH(zzgm.class, zzgm);
    }

    private zzgm() {
    }

    public final Object zzf(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmf.zzG(zze, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဌ\u0000\u0002က\u0001\u0003က\u0002\u0004ဂ\u0003\u0005\u001e", new Object[]{"zzf", "zzg", zzgl.zzc(), "zzh", "zzi", "zzj", "zzk", zzkh.zzc()});
        } else if (i2 == 3) {
            return new zzgm();
        } else {
            if (i2 == 4) {
                return new zzgi((zzgh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zze;
        }
    }
}
