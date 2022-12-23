package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Reserved({1000})
public final class zzfh {
    private final zzfj zza = new zzfj((zzfi) null);

    public final zzfh zza(zzjs zzjs) {
        this.zza.zzb = zzjs;
        return this;
    }

    public final zzfh zzb(byte[] bArr) {
        this.zza.zzd = bArr;
        return this;
    }

    public final zzfh zzc(zzkg zzkg) {
        this.zza.zze = zzkg;
        return this;
    }

    public final zzfh zzd(String str) {
        this.zza.zzc = str;
        return this;
    }

    public final zzfh zze(zzkj zzkj) {
        this.zza.zza = zzkj;
        return this;
    }

    public final zzfj zzf() {
        return this.zza;
    }
}
