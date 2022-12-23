package com.google.android.gms.internal.contextmanager;

public final class zzem extends zzmf<zzem, zzel> implements zzno {
    /* access modifiers changed from: private */
    public static final zzem zza;
    private int zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private String zzi = "";
    private String zzj = "";

    static {
        zzem zzem = new zzem();
        zza = zzem;
        zzmf.zzH(zzem.class, zzem);
    }

    private zzem() {
    }

    public static zzem zzc() {
        return zza;
    }

    public final int zza() {
        return this.zzh;
    }

    public final Object zzf(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmf.zzG(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new zzem();
        } else {
            if (i2 == 4) {
                return new zzel((zzek) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
