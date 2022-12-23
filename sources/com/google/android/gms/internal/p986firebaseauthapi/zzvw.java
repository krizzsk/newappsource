package com.google.android.gms.internal.p986firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.UserProfileChangeRequest;
import p382be.C13616x;

@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvw */
final class zzvw extends zzxd {
    private final UserProfileChangeRequest zza;

    public zzvw(UserProfileChangeRequest userProfileChangeRequest) {
        super(2);
        this.zza = (UserProfileChangeRequest) Preconditions.checkNotNull(userProfileChangeRequest, "request cannot be null");
    }

    public final String zza() {
        return "updateProfile";
    }

    public final void zzb() {
        ((C13616x) this.zzf).mo40304a(this.zzj, zzwa.zzN(this.zzd, this.zzk));
        zzm((Object) null);
    }

    public final void zzc(TaskCompletionSource taskCompletionSource, zzwd zzwd) {
        this.zzv = new zzxc(this, taskCompletionSource);
        zzwd.zzE(new zzsi(this.zza, this.zze.zzf()), this.zzc);
    }
}
