package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Reserved({1000})
public final class zzpw {
    private final zzpy zza = new zzpy((zzpx) null);

    public final zzpw zza(zzqv zzqv) {
        this.zza.zzd = zzqv;
        return this;
    }

    public final zzpw zzb(zzrv[] zzrvArr) {
        this.zza.zzf = zzrvArr;
        return this;
    }

    public final zzpw zzc(int i) {
        this.zza.zze = i;
        return this;
    }

    public final zzpw zzd(int i) {
        this.zza.zzb = i;
        return this;
    }

    public final zzpw zze(byte[] bArr) {
        this.zza.zzc = bArr;
        return this;
    }

    public final zzpw zzf(int i) {
        this.zza.zza = i;
        return this;
    }

    public final zzpy zzg() {
        return this.zza;
    }
}
