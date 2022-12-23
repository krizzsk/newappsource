package com.google.android.gms.internal.p986firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.internal.zzx;
import p382be.C13616x;

@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuy */
final class zzuy extends zzxd {
    private final zzru zza;

    public zzuy(EmailAuthCredential emailAuthCredential) {
        super(2);
        Preconditions.checkNotNull(emailAuthCredential, "Credential cannot be null");
        this.zza = new zzru(emailAuthCredential);
    }

    public final String zza() {
        return "reauthenticateWithEmailLink";
    }

    public final void zzb() {
        zzx zzN = zzwa.zzN(this.zzd, this.zzk);
        if (this.zze.mo43282l2().equalsIgnoreCase(zzN.f36451c.f36442b)) {
            ((C13616x) this.zzf).mo40304a(this.zzj, zzN);
            zzm((Object) null);
            return;
        }
        zzl(new Status(17024));
    }

    public final void zzc(TaskCompletionSource taskCompletionSource, zzwd zzwd) {
        this.zzv = new zzxc(this, taskCompletionSource);
        zzwd.zzx(this.zza, this.zzc);
    }
}
