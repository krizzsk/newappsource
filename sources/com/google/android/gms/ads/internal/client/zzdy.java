package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public final /* synthetic */ class zzdy implements Runnable {
    public final /* synthetic */ zzee zza;
    public final /* synthetic */ Context zzb;
    public final /* synthetic */ OnInitializationCompleteListener zzc;

    public /* synthetic */ zzdy(zzee zzee, Context context, String str, OnInitializationCompleteListener onInitializationCompleteListener) {
        this.zza = zzee;
        this.zzb = context;
        this.zzc = onInitializationCompleteListener;
    }

    public final void run() {
        this.zza.zzo(this.zzb, (String) null, this.zzc);
    }
}
