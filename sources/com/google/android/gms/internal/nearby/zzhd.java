package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzhd implements RemoteCall {
    public final /* synthetic */ zzih zza;
    public final /* synthetic */ byte[] zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ ListenerHolder zzd;

    public /* synthetic */ zzhd(zzih zzih, byte[] bArr, String str, ListenerHolder listenerHolder) {
        this.zza = zzih;
        this.zzb = bArr;
        this.zzc = str;
        this.zzd = listenerHolder;
    }

    public final void accept(Object obj, Object obj2) {
        zzih zzih = this.zza;
        ((zzgy) obj).zzv(new zzif(zzih, (TaskCompletionSource) obj2), this.zzb, this.zzc, this.zzd);
    }
}
