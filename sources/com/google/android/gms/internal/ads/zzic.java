package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;

final class zzic {
    public static zzmv zza(Context context, zzin zzin, boolean z) {
        zzmr zzb = zzmr.zzb(context);
        if (zzb == null) {
            return new zzmv(LogSessionId.LOG_SESSION_ID_NONE);
        }
        if (z) {
            zzin.zzR(zzb);
        }
        return new zzmv(zzb.zza());
    }
}
