package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Reserved({1000})
public final class zzet {
    private final zzev zza = new zzev((zzeu) null);

    public final zzet zza(IStatusCallback iStatusCallback) {
        this.zza.zza = iStatusCallback;
        return this;
    }

    public final zzev zzb() {
        return this.zza;
    }
}
