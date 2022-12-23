package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.nearby.exposurenotification.DiagnosisKeyFileProvider;
import com.google.android.gms.nearby.exposurenotification.ExposureConfiguration;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzaf implements RemoteCall {
    public final /* synthetic */ zzax zza;
    public final /* synthetic */ ExposureConfiguration zzb;
    public final /* synthetic */ DiagnosisKeyFileProvider zzc;
    public final /* synthetic */ String zzd;

    public /* synthetic */ zzaf(zzax zzax, ExposureConfiguration exposureConfiguration, DiagnosisKeyFileProvider diagnosisKeyFileProvider, String str) {
        this.zza = zzax;
        this.zzb = exposureConfiguration;
        this.zzc = diagnosisKeyFileProvider;
        this.zzd = str;
    }

    public final void accept(Object obj, Object obj2) {
        zzax zzax = this.zza;
        ExposureConfiguration exposureConfiguration = this.zzb;
        DiagnosisKeyFileProvider diagnosisKeyFileProvider = this.zzc;
        String str = this.zzd;
        zzed zzed = new zzed();
        zzed.zzb(exposureConfiguration);
        zzed.zza(new zzat(zzax, diagnosisKeyFileProvider));
        zzed.zzd(new zzao((TaskCompletionSource) obj2));
        zzed.zze(str);
        ((zzdr) ((zzn) obj).getService()).zzo(zzed.zzf());
    }
}
