package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

public final class zzdzw implements zzgpu {
    private final zzgqh zza;

    public zzdzw(zzgqh zzgqh) {
        this.zza = zzgqh;
    }

    /* renamed from: zza */
    public final ApplicationInfo zzb() {
        ApplicationInfo applicationInfo = ((Context) this.zza.zzb()).getApplicationInfo();
        zzgqc.zzb(applicationInfo);
        return applicationInfo;
    }
}
