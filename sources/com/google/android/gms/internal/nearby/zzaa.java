package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzaa implements RemoteCall {
    public final /* synthetic */ zzax zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzaa(zzax zzax, String str) {
        this.zza = zzax;
        this.zzb = str;
    }

    public final void accept(Object obj, Object obj2) {
        zzax zzax = this.zza;
        String str = this.zzb;
        zzaw zzaw = new zzaw(zzax, (TaskCompletionSource) obj2);
        zzbk zzbk = new zzbk();
        zzbk.zza(zzaw);
        zzbk.zzb(str);
        ((zzdr) ((zzn) obj).getService()).zzg(zzbk.zzc());
    }
}
