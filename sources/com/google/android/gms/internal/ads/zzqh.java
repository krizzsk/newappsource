package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;

final class zzqh {
    public static void zza(zzqc zzqc, zzmv zzmv) {
        LogSessionId zza = zzmv.zza();
        if (!zza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            zzqc.zzb.setString("log-session-id", zza.getStringId());
        }
    }
}
