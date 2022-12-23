package com.google.android.gms.internal.contextmanager;

import com.google.android.gms.awareness.snapshot.HeadphoneStateResult;
import com.google.android.gms.awareness.state.HeadphoneState;
import com.google.android.gms.common.api.Status;

final class zzaf implements HeadphoneStateResult {
    public final /* synthetic */ zzaq zza;

    public zzaf(zzag zzag, zzaq zzaq) {
        this.zza = zzaq;
    }

    public final HeadphoneState getHeadphoneState() {
        zzz zza2 = this.zza.zza();
        if (zza2 == null) {
            return null;
        }
        return zza2.zzc();
    }

    public final Status getStatus() {
        return this.zza.getStatus();
    }
}
