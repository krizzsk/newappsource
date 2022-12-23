package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzad implements RemoteCall {
    public final /* synthetic */ zzax zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzad(zzax zzax, String str) {
        this.zza = zzax;
        this.zzb = str;
    }

    public final void accept(Object obj, Object obj2) {
        zzax zzax = this.zza;
        String str = this.zzb;
        zzav zzav = new zzav(zzax, (TaskCompletionSource) obj2);
        zzbo zzbo = new zzbo();
        zzbo.zza(zzav);
        zzbo.zzb(str);
        ((zzdr) ((zzn) obj).getService()).zzh(zzbo.zzc());
    }
}
