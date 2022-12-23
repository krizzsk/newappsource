package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzhb implements RemoteCall {
    public final /* synthetic */ zzih zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ ListenerHolder zzd;
    public final /* synthetic */ AdvertisingOptions zze;

    public /* synthetic */ zzhb(zzih zzih, String str, String str2, ListenerHolder listenerHolder, AdvertisingOptions advertisingOptions) {
        this.zza = zzih;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = listenerHolder;
        this.zze = advertisingOptions;
    }

    public final void accept(Object obj, Object obj2) {
        zzih zzih = this.zza;
        ((zzgy) obj).zzz(new zzif(zzih, (TaskCompletionSource) obj2), this.zzb, this.zzc, this.zzd, this.zze);
    }
}
