package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcm */
public final class zzcm extends zzgb {
    public zzcm() {
        super(zzje.class, new zzck(zzpm.class));
    }

    public static final void zzh(zzje zzje) throws GeneralSecurityException {
        zzpu.zzc(zzje.zza(), 0);
        zzpu.zzb(zzje.zzg().zzd());
        zzi(zzje.zzf());
    }

    /* access modifiers changed from: private */
    public static final void zzi(zzjk zzjk) throws GeneralSecurityException {
        if (zzjk.zza() < 12 || zzjk.zza() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    public final zzga zza() {
        return new zzcl(this, zzjh.class);
    }

    public final zzmt zzb() {
        return zzmt.SYMMETRIC;
    }

    public final /* synthetic */ zzadm zzc(zzabe zzabe) throws zzacp {
        return zzje.zze(zzabe, zzabu.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzadm zzadm) throws GeneralSecurityException {
        zzh((zzje) zzadm);
    }
}
