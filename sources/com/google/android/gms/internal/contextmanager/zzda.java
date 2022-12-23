package com.google.android.gms.internal.contextmanager;

public final class zzda extends zzmf<zzda, zzcw> implements zzno {
    private static final zzml<Integer, zzjv> zza = new zzcv();
    /* access modifiers changed from: private */
    public static final zzda zze;
    private int zzf;
    private int zzg;
    private long zzh;
    private zzmk zzi = zzmf.zzC();

    static {
        zzda zzda = new zzda();
        zze = zzda;
        zzmf.zzH(zzda.class, zzda);
    }

    private zzda() {
    }

    public static zzcw zza() {
        return (zzcw) zze.zzx();
    }

    public static /* synthetic */ void zzc(zzda zzda, zzcz zzcz) {
        zzda.zzg = zzcz.zza();
        zzda.zzf |= 1;
    }

    public static /* synthetic */ void zzd(zzda zzda, long j) {
        zzda.zzf |= 2;
        zzda.zzh = 3000;
    }

    public static /* synthetic */ void zze(zzda zzda, zzjv zzjv) {
        int i;
        zzjv.getClass();
        zzmk zzmk = zzda.zzi;
        if (!zzmk.zzc()) {
            int size = zzmk.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size + size;
            }
            zzda.zzi = zzmk.zzg(i);
        }
        zzda.zzi.zzh(zzjv.zza());
    }

    public final Object zzf(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmf.zzG(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003\u001e", new Object[]{"zzf", "zzg", zzcz.zzc(), "zzh", "zzi", zzjv.zzc()});
        } else if (i2 == 3) {
            return new zzda();
        } else {
            if (i2 == 4) {
                return new zzcw((zzcv) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zze;
        }
    }
}
