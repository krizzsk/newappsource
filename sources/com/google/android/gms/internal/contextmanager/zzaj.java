package com.google.android.gms.internal.contextmanager;

import com.google.android.gms.awareness.snapshot.BeaconStateResult;
import com.google.android.gms.awareness.state.BeaconState;
import com.google.android.gms.common.api.Status;

final class zzaj implements BeaconStateResult {
    public final /* synthetic */ zzaq zza;

    public zzaj(zzak zzak, zzaq zzaq) {
        this.zza = zzaq;
    }

    public final BeaconState getBeaconState() {
        zzz zza2 = this.zza.zza();
        if (zza2 == null) {
            return null;
        }
        return zza2.zzb();
    }

    public final Status getStatus() {
        return this.zza.getStatus();
    }
}
