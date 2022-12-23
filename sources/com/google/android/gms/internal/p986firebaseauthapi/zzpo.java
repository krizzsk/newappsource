package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpo */
final class zzpo extends ThreadLocal {
    public final /* synthetic */ zzpp zza;

    public zzpo(zzpp zzpp) {
        this.zza = zzpp;
    }

    /* renamed from: zza */
    public final Mac initialValue() {
        try {
            Mac mac = (Mac) zzpb.zzb.zza(this.zza.zzb);
            mac.init(this.zza.zzc);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
