package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Reserved({1000})
public final class zzel {
    private final zzen zza = new zzen((zzem) null);

    public final zzel zza(IStatusCallback iStatusCallback) {
        this.zza.zza = iStatusCallback;
        return this;
    }

    public final zzen zzb() {
        return this.zza;
    }
}
