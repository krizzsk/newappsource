package com.google.android.gms.internal.contextmanager;

public final class zzev extends zzmf<zzev, zzer> implements zzno {
    /* access modifiers changed from: private */
    public static final zzev zza;
    private int zze;
    private int zzf;
    private String zzg = "";

    static {
        zzev zzev = new zzev();
        zza = zzev;
        zzmf.zzH(zzev.class, zzev);
    }

    private zzev() {
    }

    public final Object zzf(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmf.zzG(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", zzeu.zzc(), "zzg"});
        } else if (i2 == 3) {
            return new zzev();
        } else {
            if (i2 == 4) {
                return new zzer((zzeq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
