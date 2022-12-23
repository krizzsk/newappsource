package com.google.android.gms.internal.p986firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzx;
import p382be.C13616x;

@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvd */
final class zzvd extends zzxd {
    private final zzrw zza;

    public zzvd(PhoneAuthCredential phoneAuthCredential, String str) {
        super(2);
        Preconditions.checkNotNull(phoneAuthCredential, "credential cannot be null");
        phoneAuthCredential.f36402f = false;
        this.zza = new zzrw(phoneAuthCredential, str);
    }

    public final String zza() {
        return "reauthenticateWithPhoneCredentialWithData";
    }

    public final void zzb() {
        zzx zzN = zzwa.zzN(this.zzd, this.zzk);
        if (this.zze.mo43282l2().equalsIgnoreCase(zzN.f36451c.f36442b)) {
            ((C13616x) this.zzf).mo40304a(this.zzj, zzN);
            zzm(new zzr(zzN));
            return;
        }
        zzl(new Status(17024));
    }

    public final void zzc(TaskCompletionSource taskCompletionSource, zzwd zzwd) {
        this.zzv = new zzxc(this, taskCompletionSource);
        zzwd.zzy(this.zza, this.zzc);
    }
}
