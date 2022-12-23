package com.google.android.gms.internal.contextmanager;

import com.google.android.gms.awareness.snapshot.LocationResult;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;

final class zzai extends zzi<LocationResult, zzaq> {
    public zzai(zzam zzam, PendingResult pendingResult) {
        super(pendingResult);
    }

    public final /* bridge */ /* synthetic */ Result zza(Result result) {
        return new zzah(this, (zzaq) result);
    }
}
