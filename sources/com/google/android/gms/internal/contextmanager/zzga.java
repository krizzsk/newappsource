package com.google.android.gms.internal.contextmanager;

public final class zzga extends zzmf<zzga, zzfw> implements zzno {
    /* access modifiers changed from: private */
    public static final zzga zza;
    private int zze;
    private int zzf;
    private long zzg;
    private int zzh;

    static {
        zzga zzga = new zzga();
        zza = zzga;
        zzmf.zzH(zzga.class, zzga);
    }

    private zzga() {
    }

    public final Object zzf(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmf.zzG(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဌ\u0002", new Object[]{"zze", "zzf", zzfz.zzc(), "zzg", "zzh", zzke.zzc()});
        } else if (i2 == 3) {
            return new zzga();
        } else {
            if (i2 == 4) {
                return new zzfw((zzfv) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
