package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzac implements RemoteCall {
    public final /* synthetic */ zzax zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzac(zzax zzax, String str) {
        this.zza = zzax;
        this.zzb = str;
    }

    public final void accept(Object obj, Object obj2) {
        zzax zzax = this.zza;
        String str = this.zzb;
        zzau zzau = new zzau(zzax, (TaskCompletionSource) obj2);
        zzbs zzbs = new zzbs();
        zzbs.zza(zzau);
        zzbs.zzb(str);
        ((zzdr) ((zzn) obj).getService()).zzi(zzbs.zzc());
    }
}
