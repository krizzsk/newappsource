package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zzak;

final class zzes {
    private final zzds<zzak> zza;
    private final zzak zzb;

    public zzes(zzds<zzak> zzds, zzak zzak) {
        this.zza = zzds;
        this.zzb = zzak;
    }

    public final int zza() {
        int i;
        int zzX = this.zza.zza().zzX();
        zzak zzak = this.zzb;
        if (zzak == null) {
            i = 0;
        } else {
            i = zzak.zzX();
        }
        return zzX + i;
    }

    public final zzak zzb() {
        return this.zzb;
    }

    public final zzds<zzak> zzc() {
        return this.zza;
    }
}
