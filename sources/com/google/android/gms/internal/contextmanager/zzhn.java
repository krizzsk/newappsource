package com.google.android.gms.internal.contextmanager;

public final class zzhn extends zzmf<zzhn, zzhj> implements zzno {
    /* access modifiers changed from: private */
    public static final zzhn zza;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;

    static {
        zzhn zzhn = new zzhn();
        zza = zzhn;
        zzmf.zzH(zzhn.class, zzhn);
    }

    private zzhn() {
    }

    public static zzhj zza() {
        return (zzhj) zza.zzx();
    }

    public static /* synthetic */ void zzc(zzhn zzhn, zzhm zzhm) {
        zzhn.zzf = zzhm.zza();
        zzhn.zze |= 1;
    }

    public static /* synthetic */ void zzd(zzhn zzhn, long j) {
        zzhn.zze |= 2;
        zzhn.zzg = j;
    }

    public static /* synthetic */ void zze(zzhn zzhn, long j) {
        zzhn.zze |= 4;
        zzhn.zzh = j;
    }

    public final Object zzf(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmf.zzG(zza, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဂ\u0001\u0004ဂ\u0002", new Object[]{"zze", "zzf", zzhm.zzc(), "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzhn();
        } else {
            if (i2 == 4) {
                return new zzhj((zzhi) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
