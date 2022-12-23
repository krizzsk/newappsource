package com.google.android.gms.internal.ads;

import android.content.Context;

@Deprecated
public final class zzjy {
    private final zzhe zza;

    @Deprecated
    public zzjy(Context context, zzckr zzckr, byte[] bArr) {
        this.zza = new zzhe(context, zzckr, (byte[]) null);
    }

    @Deprecated
    public final zzjy zza(zzjb zzjb) {
        zzhe zzhe = this.zza;
        zzcw.zzf(!zzhe.zzl);
        zzhe.zzf = new zzgw(zzjb);
        return this;
    }

    @Deprecated
    public final zzjy zzb(zzvn zzvn) {
        zzhe zzhe = this.zza;
        zzcw.zzf(!zzhe.zzl);
        zzhe.zze = new zzgx(zzvn);
        return this;
    }

    @Deprecated
    public final zzjz zzc() {
        zzhe zzhe = this.zza;
        zzcw.zzf(!zzhe.zzl);
        zzhe.zzl = true;
        return new zzjz(zzhe);
    }
}
