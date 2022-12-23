package com.google.android.gms.internal.contextmanager;

public final class zzdj extends zzmf<zzdj, zzdi> implements zzno {
    /* access modifiers changed from: private */
    public static final zzdj zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private zzld zzh = zzld.zzb;

    static {
        zzdj zzdj = new zzdj();
        zza = zzdj;
        zzmf.zzH(zzdj.class, zzdj);
    }

    private zzdj() {
    }

    public static zzdi zza() {
        return (zzdi) zza.zzx();
    }

    public static zzdj zzc(byte[] bArr, zzlp zzlp) throws zzmp {
        return (zzdj) zzmf.zzA(zza, bArr, zzlp);
    }

    public static /* synthetic */ void zzh(zzdj zzdj, String str) {
        str.getClass();
        zzdj.zze |= 1;
        zzdj.zzf = str;
    }

    public static /* synthetic */ void zzi(zzdj zzdj, String str) {
        str.getClass();
        zzdj.zze |= 2;
        zzdj.zzg = str;
    }

    public static /* synthetic */ void zzj(zzdj zzdj, zzld zzld) {
        zzdj.zze |= 4;
        zzdj.zzh = zzld;
    }

    public final zzld zzd() {
        return this.zzh;
    }

    public final String zze() {
        return this.zzf;
    }

    public final Object zzf(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmf.zzG(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzdj();
        } else {
            if (i2 == 4) {
                return new zzdi((zzdh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final String zzg() {
        return this.zzg;
    }
}
