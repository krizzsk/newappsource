package com.google.android.gms.internal.nearby;

import android.os.Parcel;

final class zzlu extends zzly {
    /* renamed from: zza */
    public final zzlx createFromParcel(Parcel parcel) {
        zzlx zza = super.createFromParcel(parcel);
        if (zza.zzb != null) {
            zza.zza = zzlx.zzd(zza.zzb);
        }
        return zza;
    }
}
