package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzeh */
final class zzeh extends zzgb {
    public zzeh() {
        super(zzli.class, new zzeg(zzav.class));
    }

    public final zzmt zzb() {
        return zzmt.ASYMMETRIC_PUBLIC;
    }

    public final /* synthetic */ zzadm zzc(zzabe zzabe) throws zzacp {
        return zzli.zzf(zzabe, zzabu.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzadm zzadm) throws GeneralSecurityException {
        zzli zzli = (zzli) zzadm;
        zzpu.zzc(zzli.zza(), 0);
        zzeo.zza(zzli.zzb());
    }
}
