package com.google.android.gms.internal.ads;

public final class zzdnd {
    private zzbkx zza;

    public zzdnd(zzdms zzdms) {
        this.zza = zzdms;
    }

    public final synchronized zzbkx zza() {
        return this.zza;
    }

    public final synchronized void zzb(zzbkx zzbkx) {
        this.zza = zzbkx;
    }
}
