package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Reserved({1000})
public final class zzeh {
    private final zzej zza = new zzej((zzei) null);

    public final zzeh zza(boolean z) {
        this.zza.zzb = z;
        return this;
    }

    public final zzeh zzb(IStatusCallback iStatusCallback) {
        this.zza.zza = iStatusCallback;
        return this;
    }

    public final zzej zzc() {
        return this.zza;
    }
}
