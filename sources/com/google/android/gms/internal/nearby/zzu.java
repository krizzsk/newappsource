package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzu implements RemoteCall {
    public final /* synthetic */ zzax zza;

    public /* synthetic */ zzu(zzax zzax) {
        this.zza = zzax;
    }

    public final void accept(Object obj, Object obj2) {
        zzaq zzaq = new zzaq(this.zza, (TaskCompletionSource) obj2);
        zzdz zzdz = new zzdz();
        zzdz.zza(zzaq);
        ((zzdr) ((zzn) obj).getService()).zzn(zzdz.zzb());
    }
}
