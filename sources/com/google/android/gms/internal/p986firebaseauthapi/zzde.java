package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzde */
final class zzde extends zzga {
    public final /* synthetic */ zzdf zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzde(zzdf zzdf, Class cls) {
        super(cls);
        this.zza = zzdf;
    }

    public final /* bridge */ /* synthetic */ zzadm zza(zzadm zzadm) throws GeneralSecurityException {
        zznu zzb = zznv.zzb();
        zzb.zza((zzny) zzadm);
        zzb.zzb(0);
        return (zznv) zzb.zzk();
    }

    public final /* synthetic */ zzadm zzb(zzabe zzabe) throws zzacp {
        return zzny.zzd(zzabe, zzabu.zza());
    }

    public final /* bridge */ /* synthetic */ void zzd(zzadm zzadm) throws GeneralSecurityException {
        zzny zzny = (zzny) zzadm;
        if (zzny.zze().isEmpty() || !zzny.zzf()) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }
}
