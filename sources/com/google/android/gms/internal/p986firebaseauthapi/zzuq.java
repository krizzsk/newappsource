package com.google.android.gms.internal.p986firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzx;
import p357ae.C13417d;
import p382be.C13616x;

@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuq */
final class zzuq extends zzxd {
    private final zzqq zza;

    public zzuq(C13417d dVar, String str) {
        super(2);
        Preconditions.checkNotNull(dVar);
        Preconditions.checkNotEmpty(str);
        throw null;
    }

    public final String zza() {
        return "finalizeMfaSignIn";
    }

    public final void zzb() {
        zzx zzN = zzwa.zzN(this.zzd, this.zzk);
        FirebaseUser firebaseUser = this.zze;
        if (firebaseUser == null || firebaseUser.mo43282l2().equalsIgnoreCase(zzN.f36451c.f36442b)) {
            ((C13616x) this.zzf).mo40304a(this.zzj, zzN);
            zzm(new zzr(zzN));
            return;
        }
        zzl(new Status(17024));
    }

    public final void zzc(TaskCompletionSource taskCompletionSource, zzwd zzwd) {
        this.zzv = new zzxc(this, taskCompletionSource);
        zzwd.zzi(this.zza, this.zzc);
    }
}
