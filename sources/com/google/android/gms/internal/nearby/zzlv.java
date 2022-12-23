package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Reserved({1000})
public final class zzlv {
    private final zzlx zza = new zzlx((zzlw) null);

    public final zzlv zza(byte[] bArr) {
        this.zza.zza = bArr;
        return this;
    }

    public final zzlx zzb() {
        return this.zza;
    }
}
