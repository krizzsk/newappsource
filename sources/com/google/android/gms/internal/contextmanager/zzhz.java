package com.google.android.gms.internal.contextmanager;

public final class zzhz extends zzmf<zzhz, zzhv> implements zzno {
    /* access modifiers changed from: private */
    public static final zzhz zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private long zzh;
    private long zzi;
    private zzep zzj;
    private boolean zzk;

    static {
        zzhz zzhz = new zzhz();
        zza = zzhz;
        zzmf.zzH(zzhz.class, zzhz);
    }

    private zzhz() {
    }

    public static zzhv zza() {
        return (zzhv) zza.zzx();
    }

    public static /* synthetic */ void zzc(zzhz zzhz, zzhy zzhy) {
        zzhz.zzf = zzhy.zza();
        zzhz.zze |= 1;
    }

    public static /* synthetic */ void zzd(zzhz zzhz, boolean z) {
        zzhz.zze |= 32;
        zzhz.zzk = z;
    }

    public static /* synthetic */ void zze(zzhz zzhz, String str) {
        str.getClass();
        zzhz.zze |= 2;
        zzhz.zzg = str;
    }

    public static /* synthetic */ void zzg(zzhz zzhz, long j) {
        zzhz.zze |= 4;
        zzhz.zzh = j;
    }

    public static /* synthetic */ void zzh(zzhz zzhz, long j) {
        zzhz.zze |= 8;
        zzhz.zzi = j;
    }

    public final Object zzf(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmf.zzG(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဉ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", zzhy.zzc(), "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i2 == 3) {
            return new zzhz();
        } else {
            if (i2 == 4) {
                return new zzhv((zzhu) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final boolean zzi() {
        return this.zzk;
    }
}
