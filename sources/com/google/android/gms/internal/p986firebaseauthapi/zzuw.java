package com.google.android.gms.internal.p986firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.appupdate.C14226d;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.internal.zzx;
import p382be.C13616x;

@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuw */
final class zzuw extends zzxd {
    private final zzro zza;

    public zzuw(AuthCredential authCredential, String str) {
        super(2);
        Preconditions.checkNotNull(authCredential, "credential cannot be null");
        zzaaa J0 = C14226d.m35343J0(authCredential, str);
        J0.zzb(false);
        this.zza = new zzro(J0);
    }

    public final String zza() {
        return "reauthenticateWithCredential";
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
        zzwd.zzu(this.zza, this.zzc);
    }
}
