package com.google.android.gms.internal.contextmanager;

import com.google.android.gms.awareness.snapshot.DetectedActivityResult;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;

final class zzae extends zzi<DetectedActivityResult, zzaq> {
    public zzae(zzam zzam, PendingResult pendingResult) {
        super(pendingResult);
    }

    public final /* bridge */ /* synthetic */ Result zza(Result result) {
        return new zzad(this, (zzaq) result);
    }
}
