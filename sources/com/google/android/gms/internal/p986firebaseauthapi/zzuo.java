package com.google.android.gms.internal.p986firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;
import p037c5.C1784e;

@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuo */
final class zzuo extends zzxd {
    private final zzqu zza;

    public zzuo(String str, String str2) {
        super(3);
        Preconditions.checkNotEmpty(str, "email cannot be null or empty");
        this.zza = new zzqu(str, str2);
    }

    public final String zza() {
        return "fetchSignInMethodsForEmail";
    }

    public final void zzb() {
        List list;
        if (this.zzl.zzb() == null) {
            list = zzal.zzg();
        } else {
            list = (List) Preconditions.checkNotNull(this.zzl.zzb());
        }
        zzm(new C1784e(list));
    }

    public final void zzc(TaskCompletionSource taskCompletionSource, zzwd zzwd) {
        this.zzv = new zzxc(this, taskCompletionSource);
        zzwd.zzk(this.zza, this.zzc);
    }
}
