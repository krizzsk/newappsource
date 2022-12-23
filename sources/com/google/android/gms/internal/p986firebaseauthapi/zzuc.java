package com.google.android.gms.internal.p986firebaseauthapi;

import com.google.firebase.auth.UserProfileChangeRequest;
import p382be.C13597f;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuc */
final class zzuc implements zzxi {
    public final /* synthetic */ UserProfileChangeRequest zza;
    public final /* synthetic */ zzwc zzb;
    public final /* synthetic */ zzuh zzc;

    public zzuc(zzuh zzuh, UserProfileChangeRequest userProfileChangeRequest, zzwc zzwc) {
        this.zzc = zzuh;
        this.zza = userProfileChangeRequest;
        this.zzb = zzwc;
    }

    public final void zza(String str) {
        this.zzb.zzh(C13597f.m34015a(str));
    }

    public final void zzb(Object obj) {
        zzza zzza = (zzza) obj;
        zzzq zzzq = new zzzq();
        zzzq.zze(zzza.zze());
        UserProfileChangeRequest userProfileChangeRequest = this.zza;
        if (userProfileChangeRequest.f36414d || userProfileChangeRequest.f36412b != null) {
            zzzq.zzc(userProfileChangeRequest.f36412b);
        }
        UserProfileChangeRequest userProfileChangeRequest2 = this.zza;
        if (userProfileChangeRequest2.f36415e || userProfileChangeRequest2.f36416f != null) {
            zzzq.zzh(userProfileChangeRequest2.f36413c);
        }
        zzuh.zze(this.zzc, this.zzb, zzza, zzzq, this);
    }
}
