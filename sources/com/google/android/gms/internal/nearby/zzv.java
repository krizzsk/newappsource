package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.exposurenotification.ExposureConfiguration;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.List;

public final /* synthetic */ class zzv implements Continuation {
    public final /* synthetic */ zzax zza;
    public final /* synthetic */ List zzb;
    public final /* synthetic */ ExposureConfiguration zzc;
    public final /* synthetic */ String zzd;

    public /* synthetic */ zzv(zzax zzax, List list, ExposureConfiguration exposureConfiguration, String str) {
        this.zza = zzax;
        this.zzb = list;
        this.zzc = exposureConfiguration;
        this.zzd = str;
    }

    public final Object then(Task task) {
        return this.zza.zza(this.zzb, this.zzc, this.zzd, task);
    }
}
