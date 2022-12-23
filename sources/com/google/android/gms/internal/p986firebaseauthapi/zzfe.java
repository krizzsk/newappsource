package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfe */
public final class zzfe extends zzgb {
    public zzfe() {
        super(zzmp.class, new zzfd(zzav.class));
    }

    public final zzmt zzb() {
        return zzmt.ASYMMETRIC_PUBLIC;
    }

    public final /* synthetic */ zzadm zzc(zzabe zzabe) throws zzacp {
        return zzmp.zzf(zzabe, zzabu.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.HpkePublicKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzadm zzadm) throws GeneralSecurityException {
        zzmp zzmp = (zzmp) zzadm;
        zzpu.zzc(zzmp.zza(), 0);
        if (zzmp.zzl()) {
            zzff.zza(zzmp.zzb());
            return;
        }
        throw new GeneralSecurityException("Missing HPKE key params.");
    }
}
