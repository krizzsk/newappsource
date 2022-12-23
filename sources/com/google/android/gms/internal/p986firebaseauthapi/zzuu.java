package com.google.android.gms.internal.p986firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzx;
import p382be.C13616x;

@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuu */
final class zzuu extends zzxd {
    private final PhoneAuthCredential zza;

    public zzuu(PhoneAuthCredential phoneAuthCredential) {
        super(2);
        this.zza = (PhoneAuthCredential) Preconditions.checkNotNull(phoneAuthCredential, "credential cannot be null");
    }

    public final String zza() {
        return "linkPhoneAuthCredential";
    }

    public final void zzb() {
        zzx zzN = zzwa.zzN(this.zzd, this.zzk);
        ((C13616x) this.zzf).mo40304a(this.zzj, zzN);
        zzm(new zzr(zzN));
    }

    public final void zzc(TaskCompletionSource taskCompletionSource, zzwd zzwd) {
        this.zzv = new zzxc(this, taskCompletionSource);
        zzwd.zzn(new zzra(this.zze.zzf(), this.zza), this.zzc);
    }
}
