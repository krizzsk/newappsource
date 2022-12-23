package com.google.android.gms.internal.ads;

public final class zzod {
    private final zzmz[] zza;
    private final zzov zzb;
    private final zzox zzc;

    public zzod(zzmz... zzmzArr) {
        zzov zzov = new zzov();
        zzox zzox = new zzox();
        zzmz[] zzmzArr2 = new zzmz[2];
        this.zza = zzmzArr2;
        System.arraycopy(zzmzArr, 0, zzmzArr2, 0, 0);
        this.zzb = zzov;
        this.zzc = zzox;
        zzmzArr2[0] = zzov;
        zzmzArr2[1] = zzox;
    }

    public final long zza(long j) {
        return this.zzc.zzi(j);
    }

    public final long zzb() {
        return this.zzb.zzo();
    }

    public final zzbt zzc(zzbt zzbt) {
        this.zzc.zzk(zzbt.zzc);
        this.zzc.zzj(zzbt.zzd);
        return zzbt;
    }

    public final boolean zzd(boolean z) {
        this.zzb.zzp(z);
        return z;
    }

    public final zzmz[] zze() {
        return this.zza;
    }
}
