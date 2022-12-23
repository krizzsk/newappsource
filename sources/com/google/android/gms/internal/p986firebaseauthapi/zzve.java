package com.google.android.gms.internal.p986firebaseauthapi;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import p382be.C13616x;

@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzve */
final class zzve extends zzxd {
    public zzve() {
        super(2);
    }

    public final String zza() {
        return "reload";
    }

    public final void zzb() {
        ((C13616x) this.zzf).mo40304a(this.zzj, zzwa.zzN(this.zzd, this.zzk));
        zzm((Object) null);
    }

    public final void zzc(TaskCompletionSource taskCompletionSource, zzwd zzwd) {
        this.zzv = new zzxc(this, taskCompletionSource);
        zzwd.zzo(new zzrc(this.zze.zzf()), this.zzc);
    }
}
