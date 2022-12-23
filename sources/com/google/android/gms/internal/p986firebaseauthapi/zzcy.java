package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcy */
public final class zzcy extends zzgb {
    public zzcy() {
        super(zzko.class, new zzcw(zzap.class));
    }

    public final zzga zza() {
        return new zzcx(this, zzkr.class);
    }

    public final zzmt zzb() {
        return zzmt.SYMMETRIC;
    }

    public final /* synthetic */ zzadm zzc(zzabe zzabe) throws zzacp {
        return zzko.zzd(zzabe, zzabu.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    public final /* bridge */ /* synthetic */ void zze(zzadm zzadm) throws GeneralSecurityException {
        zzko zzko = (zzko) zzadm;
        zzpu.zzc(zzko.zza(), 0);
        if (zzko.zze().zzd() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}
