package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.nearby.exposurenotification.DailySummariesConfig;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzs implements RemoteCall {
    public final /* synthetic */ zzax zza;
    public final /* synthetic */ DailySummariesConfig zzb;

    public /* synthetic */ zzs(zzax zzax, DailySummariesConfig dailySummariesConfig) {
        this.zza = zzax;
        this.zzb = dailySummariesConfig;
    }

    public final void accept(Object obj, Object obj2) {
        zzax zzax = this.zza;
        DailySummariesConfig dailySummariesConfig = this.zzb;
        zzaj zzaj = new zzaj(zzax, (TaskCompletionSource) obj2);
        zzbc zzbc = new zzbc();
        zzbc.zzb(zzaj);
        zzbc.zza(dailySummariesConfig);
        ((zzdr) ((zzn) obj).getService()).zze(zzbc.zzc());
    }
}
