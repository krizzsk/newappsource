package com.google.android.gms.internal.ads;

public final class zztg implements zzsn {
    private final zzeq zzc;
    private int zzd = 1048576;
    private final zztf zze;
    private final zzwa zzf;
    private final zzpa zzg;

    public zztg(zzeq zzeq, zztf zztf, byte[] bArr) {
        zzpa zzpa = new zzpa();
        zzwa zzwa = new zzwa(-1);
        this.zzc = zzeq;
        this.zze = zztf;
        this.zzg = zzpa;
        this.zzf = zzwa;
    }

    public final zztg zza(int i) {
        this.zzd = i;
        return this;
    }

    public final zzti zzb(zzbb zzbb) {
        zzbb.zzd.getClass();
        return new zzti(zzbb, this.zzc, this.zze, zzpj.zza, this.zzf, this.zzd, (zzth) null, (byte[]) null);
    }
}
