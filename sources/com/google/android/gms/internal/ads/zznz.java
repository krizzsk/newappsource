package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

final class zznz {
    public static void zza(AudioTrack audioTrack, zzmv zzmv) {
        LogSessionId zza = zzmv.zza();
        if (!zza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            audioTrack.setLogSessionId(zza);
        }
    }
}
