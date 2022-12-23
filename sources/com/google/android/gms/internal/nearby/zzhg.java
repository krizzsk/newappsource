package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzhg implements RemoteCall {
    public final /* synthetic */ zzih zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ ListenerHolder zzd;
    public final /* synthetic */ ConnectionOptions zze;

    public /* synthetic */ zzhg(zzih zzih, String str, String str2, ListenerHolder listenerHolder, ConnectionOptions connectionOptions) {
        this.zza = zzih;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = listenerHolder;
        this.zze = connectionOptions;
    }

    public final void accept(Object obj, Object obj2) {
        zzih zzih = this.zza;
        ((zzgy) obj).zzw(new zzif(zzih, (TaskCompletionSource) obj2), this.zzb, this.zzc, this.zzd, this.zze);
    }
}
