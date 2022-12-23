package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Reserved({1000})
public final class zzqo {
    private final zzqq zza = new zzqq((zzqp) null);

    public final zzqo zza(byte[] bArr) {
        this.zza.zza = bArr;
        return this;
    }

    public final zzqq zzb() {
        return this.zza;
    }
}
