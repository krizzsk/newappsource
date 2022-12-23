package com.google.android.gms.internal.ads;

public final class zznq extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzad zzc;

    public zznq(int i, zzad zzad, boolean z) {
        super(C16759e.m42349e("AudioTrack write failed: ", i));
        this.zzb = z;
        this.zza = i;
        this.zzc = zzad;
    }
}
