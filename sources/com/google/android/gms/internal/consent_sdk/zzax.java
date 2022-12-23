package com.google.android.gms.internal.consent_sdk;

import p576jd.C17716b;
import p576jd.C17721f;
import p576jd.C17722g;
import p576jd.C17723h;

final class zzax implements C17723h, C17722g {
    private final C17723h zza;
    private final C17722g zzb;

    public /* synthetic */ zzax(C17723h hVar, C17722g gVar, zzav zzav) {
        this.zza = hVar;
        this.zzb = gVar;
    }

    public final void onConsentFormLoadFailure(C17721f fVar) {
        this.zzb.onConsentFormLoadFailure(fVar);
    }

    public final void onConsentFormLoadSuccess(C17716b bVar) {
        this.zza.onConsentFormLoadSuccess(bVar);
    }
}
