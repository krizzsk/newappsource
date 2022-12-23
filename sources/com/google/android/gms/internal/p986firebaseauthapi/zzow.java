package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzow */
public final class zzow implements zzav {
    private final zzoy zza;
    private final String zzb;
    private final byte[] zzc;
    private final zzou zzd;

    public zzow(ECPublicKey eCPublicKey, byte[] bArr, String str, int i, zzou zzou) throws GeneralSecurityException {
        zzoz.zzd(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.zza = new zzoy(eCPublicKey);
        this.zzc = bArr;
        this.zzb = str;
        this.zzd = zzou;
    }
}
