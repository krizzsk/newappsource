package com.google.android.gms.internal.p986firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import p357ae.C13417d;
import p382be.C13616x;

@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzup */
final class zzup extends zzxd {
    private final zzqo zza;

    public zzup(C13417d dVar, String str, String str2) {
        super(2);
        Preconditions.checkNotNull(dVar);
        Preconditions.checkNotEmpty(str);
        throw null;
    }

    public final String zza() {
        return "finalizeMfaEnrollment";
    }

    public final void zzb() {
        ((C13616x) this.zzf).mo40304a(this.zzj, zzwa.zzN(this.zzd, this.zzk));
        zzm((Object) null);
    }

    public final void zzc(TaskCompletionSource taskCompletionSource, zzwd zzwd) {
        this.zzv = new zzxc(this, taskCompletionSource);
        zzwd.zzh(this.zza, this.zzc);
    }
}
