package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

final class zzgg {
    private final Context zza;
    private final zzge zzb;

    public zzgg(Context context, Handler handler, zzgf zzgf) {
        this.zza = context.getApplicationContext();
        this.zzb = new zzge(this, handler, zzgf);
    }
}
