package com.google.android.gms.internal.contextmanager;

public final class zzdo extends zzmf<zzdo, zzdk> implements zzno {
    /* access modifiers changed from: private */
    public static final zzdo zza;
    private int zze;
    private int zzf;
    private long zzg;
    private zzmm<zzdj> zzh = zzmf.zzD();

    static {
        zzdo zzdo = new zzdo();
        zza = zzdo;
        zzmf.zzH(zzdo.class, zzdo);
    }

    private zzdo() {
    }

    public static zzdk zza() {
        return (zzdk) zza.zzx();
    }

    public static /* synthetic */ void zzc(zzdo zzdo, zzdn zzdn) {
        zzdo.zzf = zzdn.zza();
        zzdo.zze |= 1;
    }

    public static /* synthetic */ void zzd(zzdo zzdo, long j) {
        zzdo.zze |= 2;
        zzdo.zzg = 3000;
    }

    public static /* synthetic */ void zze(zzdo zzdo, zzdj zzdj) {
        zzdj.getClass();
        zzmm<zzdj> zzmm = zzdo.zzh;
        if (!zzmm.zzc()) {
            zzdo.zzh = zzmf.zzE(zzmm);
        }
        zzdo.zzh.add(zzdj);
    }

    public final Object zzf(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmf.zzG(zza, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0003ဂ\u0001\u0004\u001b", new Object[]{"zze", "zzf", zzdn.zzc(), "zzg", "zzh", zzdj.class});
        } else if (i2 == 3) {
            return new zzdo();
        } else {
            if (i2 == 4) {
                return new zzdk((zzdh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
