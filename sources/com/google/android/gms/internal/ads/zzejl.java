package com.google.android.gms.internal.ads;

import android.content.Context;

public final /* synthetic */ class zzejl implements zzdlf {
    public final /* synthetic */ zzefb zza;

    public /* synthetic */ zzejl(zzefb zzefb) {
        this.zza = zzefb;
    }

    public final void zza(boolean z, Context context, zzdcf zzdcf) {
        zzefb zzefb = this.zza;
        try {
            ((zzfct) zzefb.zzb).zzu(z);
            ((zzfct) zzefb.zzb).zzy();
        } catch (zzfcd e) {
            zzcfi.zzk("Cannot show rewarded video.", e);
            throw new zzdle(e.getCause());
        }
    }
}
