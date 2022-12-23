package com.google.android.gms.tagmanager;

import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
final class zzca {
    private final long zza;
    private final long zzb;
    private String zzc;

    public zzca(long j, long j2, long j3) {
        this.zza = j;
        this.zzb = j3;
    }

    public final long zza() {
        return this.zzb;
    }

    public final long zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final void zzd(String str) {
        if (str != null && !TextUtils.isEmpty(str.trim())) {
            this.zzc = str;
        }
    }
}
