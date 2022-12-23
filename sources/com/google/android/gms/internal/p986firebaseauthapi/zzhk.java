package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhk */
public final class zzhk extends zzgb {
    public zzhk() {
        super(zzip.class, new zzhi(zzbm.class));
    }

    /* access modifiers changed from: private */
    public static void zzi(zziv zziv) throws GeneralSecurityException {
        if (zziv.zza() < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (zziv.zza() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* access modifiers changed from: private */
    public static void zzn(int i) throws GeneralSecurityException {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    public final zzga zza() {
        return new zzhj(this, zzis.class);
    }

    public final zzmt zzb() {
        return zzmt.SYMMETRIC;
    }

    public final /* synthetic */ zzadm zzc(zzabe zzabe) throws zzacp {
        return zzip.zzd(zzabe, zzabu.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzadm zzadm) throws GeneralSecurityException {
        zzip zzip = (zzip) zzadm;
        zzpu.zzc(zzip.zza(), 0);
        zzn(zzip.zzf().zzd());
        zzi(zzip.zze());
    }
}
