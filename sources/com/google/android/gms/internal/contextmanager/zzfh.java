package com.google.android.gms.internal.contextmanager;

import androidx.recyclerview.widget.RecyclerView;

public final class zzfh extends zzmf<zzfh, zzfa> implements zzno {
    /* access modifiers changed from: private */
    public static final zzfh zza;
    private int zze;
    private int zzf;
    private int zzg;
    private long zzh;
    private int zzi;
    private int zzj;
    private double zzk;
    private double zzl;
    private long zzm;

    static {
        zzfh zzfh = new zzfh();
        zza = zzfh;
        zzmf.zzH(zzfh.class, zzfh);
    }

    private zzfh() {
    }

    public static zzfa zza() {
        return (zzfa) zza.zzx();
    }

    public static /* synthetic */ void zzc(zzfh zzfh, zzfg zzfg) {
        zzfh.zzf = zzfg.zza();
        zzfh.zze |= 1;
    }

    public static /* synthetic */ void zzd(zzfh zzfh, double d) {
        zzfh.zze |= 32;
        zzfh.zzk = d;
    }

    public static /* synthetic */ void zze(zzfh zzfh, double d) {
        zzfh.zze |= 64;
        zzfh.zzl = d;
    }

    public static /* synthetic */ void zzg(zzfh zzfh, long j) {
        zzfh.zze |= RecyclerView.C1119a0.FLAG_IGNORE;
        zzfh.zzm = j;
    }

    public static /* synthetic */ void zzh(zzfh zzfh, zzfd zzfd) {
        zzfh.zzg = zzfd.zza();
        zzfh.zze |= 2;
    }

    public static /* synthetic */ void zzi(zzfh zzfh, long j) {
        zzfh.zze |= 4;
        zzfh.zzh = j;
    }

    public static /* synthetic */ void zzj(zzfh zzfh, int i) {
        zzfh.zze |= 8;
        zzfh.zzi = i;
    }

    public static /* synthetic */ void zzk(zzfh zzfh, int i) {
        zzfh.zze |= 16;
        zzfh.zzj = i;
    }

    public final Object zzf(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmf.zzG(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004င\u0003\u0005င\u0004\u0006က\u0005\u0007က\u0006\bဂ\u0007", new Object[]{"zze", "zzf", zzfg.zzc(), "zzg", zzfd.zzc(), "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        } else if (i2 == 3) {
            return new zzfh();
        } else {
            if (i2 == 4) {
                return new zzfa((zzez) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
