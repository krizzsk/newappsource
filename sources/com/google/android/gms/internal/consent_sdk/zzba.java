package com.google.android.gms.internal.consent_sdk;

import java.util.concurrent.atomic.AtomicReference;
import p576jd.C17722g;
import p576jd.C17723h;

public final class zzba {
    private final zzcl<zzas> zza;
    private final AtomicReference<zzbc> zzb = new AtomicReference<>();

    public zzba(zzcl<zzas> zzcl) {
        this.zza = zzcl;
    }

    public final void zza(C17723h hVar, C17722g gVar) {
        zzcd.zza();
        zzbc zzbc = this.zzb.get();
        if (zzbc == null) {
            gVar.onConsentFormLoadFailure(new zzj(3, "No available form can be built.").zza());
            return;
        }
        zzas zzb2 = this.zza.zzb();
        zzb2.zza(zzbc);
        zzb2.zzb().zza().zzb(hVar, gVar);
    }

    public final void zzb(zzbc zzbc) {
        this.zzb.set(zzbc);
    }

    public final boolean zzc() {
        return this.zzb.get() != null;
    }
}
