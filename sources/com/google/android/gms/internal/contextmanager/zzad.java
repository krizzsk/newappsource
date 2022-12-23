package com.google.android.gms.internal.contextmanager;

import com.google.android.gms.awareness.snapshot.DetectedActivityResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.ActivityRecognitionResult;

final class zzad implements DetectedActivityResult {
    public final /* synthetic */ zzaq zza;

    public zzad(zzae zzae, zzaq zzaq) {
        this.zza = zzaq;
    }

    public final ActivityRecognitionResult getActivityRecognitionResult() {
        zzz zza2 = this.zza.zza();
        if (zza2 == null) {
            return null;
        }
        return zza2.zze();
    }

    public final Status getStatus() {
        return this.zza.getStatus();
    }
}
