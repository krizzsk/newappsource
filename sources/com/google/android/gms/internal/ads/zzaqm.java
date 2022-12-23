package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

public abstract class zzaqm implements Callable {
    public final String zza = getClass().getSimpleName();
    public final zzapc zzb;
    public final String zzc;
    public final String zzd;
    public final zzali zze;
    public Method zzf;
    public final int zzg;
    public final int zzh;

    public zzaqm(zzapc zzapc, String str, String str2, zzali zzali, int i, int i2) {
        this.zzb = zzapc;
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzali;
        this.zzg = i;
        this.zzh = i2;
    }

    public /* bridge */ /* synthetic */ Object call() throws Exception {
        zzk();
        return null;
    }

    public abstract void zza() throws IllegalAccessException, InvocationTargetException;

    public Void zzk() throws Exception {
        int i;
        try {
            long nanoTime = System.nanoTime();
            Method zzj = this.zzb.zzj(this.zzc, this.zzd);
            this.zzf = zzj;
            if (zzj == null) {
                return null;
            }
            zza();
            zzanx zzd2 = this.zzb.zzd();
            if (!(zzd2 == null || (i = this.zzg) == Integer.MIN_VALUE)) {
                zzd2.zzc(this.zzh, i, (System.nanoTime() - nanoTime) / 1000, (String) null, (Exception) null);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }
}
