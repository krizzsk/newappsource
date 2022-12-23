package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdb */
public final class zzdb extends zzgb {
    public zzdb() {
        super(zznp.class, new zzcz(zzap.class));
    }

    public final zzga zza() {
        return new zzda(this, zzns.class);
    }

    public final zzmt zzb() {
        return zzmt.REMOTE;
    }

    public final /* synthetic */ zzadm zzc(zzabe zzabe) throws zzacp {
        return zznp.zzd(zzabe, zzabu.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzadm zzadm) throws GeneralSecurityException {
        zzpu.zzc(((zznp) zzadm).zza(), 0);
    }
}
