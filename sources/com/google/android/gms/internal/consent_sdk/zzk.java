package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import p576jd.C17718c;
import p576jd.C17719d;
import p576jd.C17720e;

public final class zzk {
    private final zzam zza;
    private final zzv zzb;
    private final zzba zzc;

    public zzk(zzam zzam, zzv zzv, zzba zzba) {
        this.zza = zzam;
        this.zzb = zzv;
        this.zzc = zzba;
    }

    public final int getConsentStatus() {
        return this.zza.zza();
    }

    public final boolean isConsentFormAvailable() {
        return this.zzc.zzc();
    }

    public final void requestConsentInfoUpdate(Activity activity, C17720e eVar, C17719d dVar, C17718c cVar) {
        this.zzb.zzc(activity, eVar, dVar, cVar);
    }

    public final void reset() {
        this.zzc.zzb((zzbc) null);
        this.zza.zzd();
    }
}
