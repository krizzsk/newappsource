package com.google.android.gms.internal.contextmanager;

public final class zzhb extends zzmf<zzhb, zzgx> implements zzno {
    /* access modifiers changed from: private */
    public static final zzhb zza;
    private int zze;
    private int zzf;
    private long zzg;
    private int zzh;

    static {
        zzhb zzhb = new zzhb();
        zza = zzhb;
        zzmf.zzH(zzhb.class, zzhb);
    }

    private zzhb() {
    }

    public final Object zzf(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmf.zzG(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဌ\u0002", new Object[]{"zze", "zzf", zzha.zzc(), "zzg", "zzh", zzkk.zzc()});
        } else if (i2 == 3) {
            return new zzhb();
        } else {
            if (i2 == 4) {
                return new zzgx((zzgw) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
