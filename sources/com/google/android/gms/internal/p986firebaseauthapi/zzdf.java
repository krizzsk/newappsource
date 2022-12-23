package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdf */
public final class zzdf extends zzgb {
    public zzdf() {
        super(zznv.class, new zzdd(zzap.class));
    }

    public final zzga zza() {
        return new zzde(this, zzny.class);
    }

    public final zzmt zzb() {
        return zzmt.REMOTE;
    }

    public final /* synthetic */ zzadm zzc(zzabe zzabe) throws zzacp {
        return zznv.zzd(zzabe, zzabu.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzadm zzadm) throws GeneralSecurityException {
        zzpu.zzc(((zznv) zzadm).zza(), 0);
    }
}
