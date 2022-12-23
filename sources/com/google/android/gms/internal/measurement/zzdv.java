package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzgz;

final class zzdv extends zzch {
    private final zzgz zza;

    public zzdv(zzgz zzgz) {
        this.zza = zzgz;
    }

    public final int zzd() {
        return System.identityHashCode(this.zza);
    }

    public final void zze(String str, String str2, Bundle bundle, long j) {
        this.zza.onEvent(str, str2, bundle, j);
    }
}
