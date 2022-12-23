package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.exposurenotification.ExposureConfiguration;
import java.util.List;

@SafeParcelable.Reserved({1000})
public final class zzed {
    private final zzef zza = new zzef((zzee) null);

    public final zzed zza(zzcv zzcv) {
        this.zza.zzf = zzcv;
        return this;
    }

    public final zzed zzb(ExposureConfiguration exposureConfiguration) {
        this.zza.zzd = exposureConfiguration;
        return this;
    }

    public final zzed zzc(List list) {
        this.zza.zzc = list;
        return this;
    }

    public final zzed zzd(IStatusCallback iStatusCallback) {
        this.zza.zzb = iStatusCallback;
        return this;
    }

    public final zzed zze(String str) {
        this.zza.zze = str;
        return this;
    }

    public final zzef zzf() {
        return this.zza;
    }
}
