package com.google.android.gms.internal.p986firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxe */
public final /* synthetic */ class zzxe implements Runnable {
    public final /* synthetic */ zzxg zza;
    public final /* synthetic */ zzxf zzb;
    public final /* synthetic */ TaskCompletionSource zzc;

    public /* synthetic */ zzxe(zzxg zzxg, zzxf zzxf, TaskCompletionSource taskCompletionSource) {
        this.zza = zzxg;
        this.zzb = zzxf;
        this.zzc = taskCompletionSource;
    }

    public final void run() {
        this.zzb.zzc(this.zzc, this.zza.zza);
    }
}
