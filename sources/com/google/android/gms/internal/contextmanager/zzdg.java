package com.google.android.gms.internal.contextmanager;

import androidx.recyclerview.widget.RecyclerView;

public final class zzdg extends zzmf<zzdg, zzdc> implements zzno {
    /* access modifiers changed from: private */
    public static final zzdg zza;
    private int zze;
    private int zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;

    static {
        zzdg zzdg = new zzdg();
        zza = zzdg;
        zzmf.zzH(zzdg.class, zzdg);
    }

    private zzdg() {
    }

    public static zzdc zza() {
        return (zzdc) zza.zzx();
    }

    public static /* synthetic */ void zzc(zzdg zzdg, zzdf zzdf) {
        zzdg.zzf = zzdf.zza();
        zzdg.zze |= 1;
    }

    public static /* synthetic */ void zzd(zzdg zzdg, zzjj zzjj) {
        zzdg.zzk = zzjj.zza();
        zzdg.zze |= 32;
    }

    public static /* synthetic */ void zze(zzdg zzdg, zzjm zzjm) {
        zzdg.zzl = zzjm.zza();
        zzdg.zze |= 64;
    }

    public static /* synthetic */ void zzg(zzdg zzdg, zzjp zzjp) {
        zzdg.zzm = zzjp.zza();
        zzdg.zze |= RecyclerView.C1119a0.FLAG_IGNORE;
    }

    public static /* synthetic */ void zzh(zzdg zzdg, long j) {
        zzdg.zze |= 2;
        zzdg.zzg = j;
    }

    public static /* synthetic */ void zzi(zzdg zzdg, zzjg zzjg) {
        zzdg.zzh = zzjg.zza();
        zzdg.zze |= 4;
    }

    public static /* synthetic */ void zzj(zzdg zzdg, zzja zzja) {
        zzdg.zzi = zzja.zza();
        zzdg.zze |= 8;
    }

    public static /* synthetic */ void zzk(zzdg zzdg, zzjd zzjd) {
        zzdg.zzj = zzjd.zza();
        zzdg.zze |= 16;
    }

    public final Object zzf(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmf.zzG(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"zze", "zzf", zzdf.zzc(), "zzg", "zzh", zzjg.zzc(), "zzi", zzja.zzc(), "zzj", zzjd.zzc(), "zzk", zzjj.zzc(), "zzl", zzjm.zzc(), "zzm", zzjp.zzc()});
        } else if (i2 == 3) {
            return new zzdg();
        } else {
            if (i2 == 4) {
                return new zzdc((zzdb) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
