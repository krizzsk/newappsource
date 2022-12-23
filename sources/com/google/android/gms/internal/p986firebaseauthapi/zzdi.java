package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdi */
public final class zzdi extends zzgb {
    public zzdi() {
        super(zzog.class, new zzdg(zzap.class));
    }

    public final zzga zza() {
        return new zzdh(this, zzoj.class);
    }

    public final zzmt zzb() {
        return zzmt.SYMMETRIC;
    }

    public final /* synthetic */ zzadm zzc(zzabe zzabe) throws zzacp {
        return zzog.zzd(zzabe, zzabu.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    public final /* bridge */ /* synthetic */ void zze(zzadm zzadm) throws GeneralSecurityException {
        zzog zzog = (zzog) zzadm;
        zzpu.zzc(zzog.zza(), 0);
        if (zzog.zze().zzd() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }
}
