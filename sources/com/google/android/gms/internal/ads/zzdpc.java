package com.google.android.gms.internal.ads;

import p241s0.C6302b;

public final class zzdpc implements zzdcm {
    private final zzdng zza;
    private final zzdnl zzb;

    public zzdpc(zzdng zzdng, zzdnl zzdnl) {
        this.zza = zzdng;
        this.zzb = zzdnl;
    }

    public final void zzl() {
        zzdng zzdng = this.zza;
        if (zzdng.zzu() != null) {
            zzcli zzq = zzdng.zzq();
            zzcli zzr = zzdng.zzr();
            if (zzq == null) {
                zzq = zzr == null ? null : zzr;
            }
            if (this.zzb.zzd() && zzq != null) {
                zzq.zzd("onSdkImpression", new C6302b());
            }
        }
    }
}
