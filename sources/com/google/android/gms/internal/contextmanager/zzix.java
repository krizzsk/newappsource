package com.google.android.gms.internal.contextmanager;

public final class zzix extends zzmf<zzix, zzit> implements zzno {
    /* access modifiers changed from: private */
    public static final zzix zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private String zzh = "";

    static {
        zzix zzix = new zzix();
        zza = zzix;
        zzmf.zzH(zzix.class, zzix);
    }

    private zzix() {
    }

    public final Object zzf(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmf.zzG(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"zze", "zzf", zziw.zzc(), "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzix();
        } else {
            if (i2 == 4) {
                return new zzit((zzis) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
