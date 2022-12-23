package com.google.android.gms.internal.p986firebaseauthapi;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import p382be.C13601i;

@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzun */
final class zzun extends zzxd {
    public zzun() {
        super(5);
    }

    public final String zza() {
        return "delete";
    }

    public final void zzb() {
        ((C13601i) this.zzf).zza();
        zzm((Object) null);
    }

    public final void zzc(TaskCompletionSource taskCompletionSource, zzwd zzwd) {
        this.zzv = new zzxc(this, taskCompletionSource);
        zzwd.zzg(new zzqm(this.zze.zzf()), this.zzc);
    }
}
