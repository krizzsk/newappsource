package com.google.android.gms.internal.contextmanager;

public final class zzey extends zzmf<zzey, zzex> implements zzno {
    /* access modifiers changed from: private */
    public static final zzey zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        zzey zzey = new zzey();
        zza = zzey;
        zzmf.zzH(zzey.class, zzey);
    }

    private zzey() {
    }

    public final Object zzf(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmf.zzG(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzey();
        } else {
            if (i2 == 4) {
                return new zzex((zzew) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
