package com.google.android.gms.internal.contextmanager;

public final class zzgp extends zzmf<zzgp, zzgo> implements zzno {
    /* access modifiers changed from: private */
    public static final zzgp zza;
    private int zze;
    private int zzf;
    private long zzg;

    static {
        zzgp zzgp = new zzgp();
        zza = zzgp;
        zzmf.zzH(zzgp.class, zzgp);
    }

    private zzgp() {
    }

    public final Object zzf(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmf.zzG(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzgp();
        } else {
            if (i2 == 4) {
                return new zzgo((zzgn) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
