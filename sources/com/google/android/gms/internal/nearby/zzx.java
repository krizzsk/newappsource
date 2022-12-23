package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.nearby.exposurenotification.DiagnosisKeysDataMapping;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzx implements RemoteCall {
    public final /* synthetic */ DiagnosisKeysDataMapping zza;

    public /* synthetic */ zzx(DiagnosisKeysDataMapping diagnosisKeysDataMapping) {
        this.zza = diagnosisKeysDataMapping;
    }

    public final void accept(Object obj, Object obj2) {
        DiagnosisKeysDataMapping diagnosisKeysDataMapping = this.zza;
        int i = zzax.zza;
        zzep zzep = new zzep();
        zzep.zzb(new zzao((TaskCompletionSource) obj2));
        zzep.zza(diagnosisKeysDataMapping);
        ((zzdr) ((zzn) obj).getService()).zzr(zzep.zzc());
    }
}
