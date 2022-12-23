package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

public final class zzhe {
    public final Context zza;
    public final zzcx zzb = zzcx.zza;
    public final zzfph zzc;
    public final zzfph zzd;
    public zzfph zze;
    public zzfph zzf;
    public final zzfph zzg;
    public final zzfoi zzh;
    public final Looper zzi = zzeg.zzD();
    public final zzi zzj = zzi.zza;
    public final zzjx zzk = zzjx.zze;
    public boolean zzl;
    public final zzgp zzm = new zzgp(0.97f, 1.03f, 1000, 1.0E-7f, zzeg.zzv(20), zzeg.zzv(500), 0.999f, (zzgo) null);

    public zzhe(Context context, zzckr zzckr, byte[] bArr) {
        zzgy zzgy = new zzgy(zzckr, (byte[]) null);
        zzgz zzgz = new zzgz(context);
        zzha zzha = new zzha(context);
        zzhb zzhb = zzhb.zza;
        zzhc zzhc = new zzhc(context);
        zzhd zzhd = zzhd.zza;
        this.zza = context;
        this.zzc = zzgy;
        this.zzd = zzgz;
        this.zze = zzha;
        this.zzf = zzhb;
        this.zzg = zzhc;
        this.zzh = zzhd;
    }

    public static /* synthetic */ zzsa zza(Context context) {
        return new zzro(context, new zzyo());
    }
}
