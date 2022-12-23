package com.google.android.gms.internal.contextmanager;

public final class zzht extends zzmf<zzht, zzhp> implements zzno {
    /* access modifiers changed from: private */
    public static final zzht zza;
    private int zze;
    private int zzf = 3;
    private long zzg;
    private long zzh;

    static {
        zzht zzht = new zzht();
        zza = zzht;
        zzmf.zzH(zzht.class, zzht);
    }

    private zzht() {
    }

    public final Object zzf(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmf.zzG(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"zze", "zzf", zzhs.zzc(), "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzht();
        } else {
            if (i2 == 4) {
                return new zzhp((zzho) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
