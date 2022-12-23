package com.google.android.gms.internal.p986firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.appupdate.C14226d;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzx;
import p382be.C13616x;

@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzut */
final class zzut extends zzxd {
    private final zzaaa zza;

    public zzut(AuthCredential authCredential) {
        super(2);
        Preconditions.checkNotNull(authCredential, "credential cannot be null");
        this.zza = C14226d.m35343J0(authCredential, (String) null);
    }

    public final String zza() {
        return "linkFederatedCredential";
    }

    public final void zzb() {
        zzx zzN = zzwa.zzN(this.zzd, this.zzk);
        ((C13616x) this.zzf).mo40304a(this.zzj, zzN);
        zzm(new zzr(zzN));
    }

    public final void zzc(TaskCompletionSource taskCompletionSource, zzwd zzwd) {
        this.zzv = new zzxc(this, taskCompletionSource);
        zzwd.zzm(new zzqy(this.zze.zzf(), this.zza), this.zzc);
    }
}
