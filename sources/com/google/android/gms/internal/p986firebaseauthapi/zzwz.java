package com.google.android.gms.internal.p986firebaseauthapi;

import p357ae.C13416c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwz */
final class zzwz implements Runnable {
    public final /* synthetic */ zzxb zza;
    public final /* synthetic */ zzxa zzb;

    public zzwz(zzxa zzxa, zzxb zzxb) {
        this.zzb = zzxa;
        this.zza = zzxb;
    }

    public final void run() {
        synchronized (this.zzb.zza.zzh) {
            if (!this.zzb.zza.zzh.isEmpty()) {
                this.zza.zza((C13416c) this.zzb.zza.zzh.get(0), new Object[0]);
            }
        }
    }
}
