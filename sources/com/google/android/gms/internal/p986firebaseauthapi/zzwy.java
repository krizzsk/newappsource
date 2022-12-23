package com.google.android.gms.internal.p986firebaseauthapi;

import com.google.android.gms.common.api.Status;
import p357ae.C13416c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwy */
final class zzwy implements zzxb {
    public final /* synthetic */ Status zza;

    public zzwy(zzxa zzxa, Status status) {
        this.zza = status;
    }

    public final void zza(C13416c cVar, Object... objArr) {
        cVar.onVerificationFailed(zzwe.zza(this.zza));
    }
}
