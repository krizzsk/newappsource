package com.google.android.gms.internal.ads;

import android.content.Context;

public final /* synthetic */ class zzeis implements zzdlf {
    public final /* synthetic */ zzefb zza;

    public /* synthetic */ zzeis(zzefb zzefb) {
        this.zza = zzefb;
    }

    public final void zza(boolean z, Context context, zzdcf zzdcf) {
        zzefb zzefb = this.zza;
        try {
            ((zzfct) zzefb.zzb).zzu(z);
            ((zzfct) zzefb.zzb).zzx(context);
        } catch (zzfcd e) {
            throw new zzdle(e.getCause());
        }
    }
}
