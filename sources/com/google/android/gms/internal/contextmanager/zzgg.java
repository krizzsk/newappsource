package com.google.android.gms.internal.contextmanager;

public final class zzgg extends zzmf<zzgg, zzgc> implements zzno {
    /* access modifiers changed from: private */
    public static final zzgg zza;
    private int zze;
    private int zzf;
    private long zzg;
    private zzmk zzh = zzmf.zzC();
    private zzmm<String> zzi = zzmf.zzD();
    private long zzj;
    private zzmm<String> zzk = zzmf.zzD();
    private String zzl = "";
    private long zzm;

    static {
        zzgg zzgg = new zzgg();
        zza = zzgg;
        zzmf.zzH(zzgg.class, zzgg);
    }

    private zzgg() {
    }

    public final Object zzf(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmf.zzG(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0003\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003\u0016\u0004\u001a\u0005ဂ\u0002\u0006\u001a\u0007ဈ\u0003\bဂ\u0004", new Object[]{"zze", "zzf", zzgf.zzc(), "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        } else if (i2 == 3) {
            return new zzgg();
        } else {
            if (i2 == 4) {
                return new zzgc((zzgb) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
