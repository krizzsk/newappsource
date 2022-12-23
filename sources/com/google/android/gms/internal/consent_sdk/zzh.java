package com.google.android.gms.internal.consent_sdk;

import java.util.concurrent.Executor;

public final class zzh {
    private final Executor zza;

    public zzh(Executor executor) {
        this.zza = executor;
    }

    public final Executor zza() {
        return this.zza;
    }

    public final void zzb(String str, String str2, zzg... zzgArr) {
        this.zza.execute(new zze(str, str2, zzgArr));
    }
}
