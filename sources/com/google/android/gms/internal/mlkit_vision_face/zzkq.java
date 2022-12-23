package com.google.android.gms.internal.mlkit_vision_face;

import android.content.Context;
import com.google.android.gms.clearcut.ClearcutLogger;
import com.google.android.gms.common.internal.GmsLogger;

public final class zzkq implements zzkn {
    private static final GmsLogger zza = new GmsLogger("ClearcutTransport", "");
    private final ClearcutLogger zzb;

    public zzkq(Context context) {
        this.zzb = ClearcutLogger.anonymousLogger(context, "FIREBASE_ML_SDK");
    }

    public final void zza(zzkp zzkp) {
        GmsLogger gmsLogger = zza;
        String valueOf = String.valueOf(zzkp);
        StringBuilder sb = new StringBuilder(valueOf.length() + 30);
        sb.append("Logging FirebaseMlSdkLogEvent ");
        sb.append(valueOf);
        gmsLogger.mo65686d("ClearcutTransport", sb.toString());
        try {
            this.zzb.newEvent(zzkp.zza(1, true)).log();
        } catch (SecurityException e) {
            zza.mo65689e("ClearcutTransport", "Exception thrown from the logging side", e);
        }
    }
}
