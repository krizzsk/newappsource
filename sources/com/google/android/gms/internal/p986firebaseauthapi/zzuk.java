package com.google.android.gms.internal.p986firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import p389bl.C13637c;

@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuk */
final class zzuk extends zzxd {
    private final zzqg zza;

    public zzuk(String str, String str2) {
        super(4);
        Preconditions.checkNotEmpty(str, "code cannot be null or empty");
        this.zza = new zzqg(str, str2);
    }

    public final String zza() {
        return "checkActionCode";
    }

    public final void zzb() {
        zzm(new C13637c(this.zzm));
    }

    public final void zzc(TaskCompletionSource taskCompletionSource, zzwd zzwd) {
        this.zzv = new zzxc(this, taskCompletionSource);
        zzwd.zzd(this.zza, this.zzc);
    }
}
