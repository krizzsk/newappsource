package com.google.android.gms.internal.ads;

public final class zzcxo {
    private final zzdeh zza;
    private final zzdgn zzb;

    public zzcxo(zzdeh zzdeh, zzdgn zzdgn) {
        this.zza = zzdeh;
        this.zzb = zzdgn;
    }

    public final zzdeh zza() {
        return this.zza;
    }

    public final zzdgn zzb() {
        return this.zzb;
    }

    public final zzdiy zzc() {
        zzdgn zzdgn = this.zzb;
        if (zzdgn != null) {
            return new zzdiy(zzdgn, zzcfv.zzf);
        }
        return new zzdiy(new zzcxn(this), zzcfv.zzf);
    }
}
