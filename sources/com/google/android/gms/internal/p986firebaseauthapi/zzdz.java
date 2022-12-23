package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdz */
public final class zzdz extends zzgb {
    public zzdz() {
        super(zzki.class, new zzdx(zzat.class));
    }

    public final zzga zza() {
        return new zzdy(this, zzkl.class);
    }

    public final zzmt zzb() {
        return zzmt.SYMMETRIC;
    }

    public final /* synthetic */ zzadm zzc(zzabe zzabe) throws zzacp {
        return zzki.zzd(zzabe, zzabu.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzadm zzadm) throws GeneralSecurityException {
        zzki zzki = (zzki) zzadm;
        zzpu.zzc(zzki.zza(), 0);
        if (zzki.zze().zzd() != 64) {
            throw new InvalidKeyException(C25541a.m63878h("invalid key size: ", zzki.zze().zzd(), ". Valid keys must have 64 bytes."));
        }
    }
}
