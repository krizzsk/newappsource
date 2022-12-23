package com.google.android.gms.internal.p986firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zzag;

@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvo */
final class zzvo extends zzxd {
    private final zzry zza;

    public zzvo(zzag zzag, String str, String str2, long j, boolean z, boolean z2, String str3, String str4, boolean z3) {
        super(8);
        Preconditions.checkNotNull(zzag);
        Preconditions.checkNotEmpty(str);
        this.zza = new zzry(Preconditions.checkNotEmpty(zzag.f36432b), str, str2, j, z, z2, str3, str4, z3);
    }

    public final String zza() {
        return "startMfaEnrollmentWithPhoneNumber";
    }

    public final void zzb() {
    }

    public final void zzc(TaskCompletionSource taskCompletionSource, zzwd zzwd) {
        this.zzv = new zzxc(this, taskCompletionSource);
        zzwd.zzz(this.zza, this.zzc);
    }
}
