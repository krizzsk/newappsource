package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcs */
public final class zzcs extends zzgb {
    public zzcs() {
        super(zzjw.class, new zzcq(zzap.class));
    }

    public static /* bridge */ /* synthetic */ zzfz zzg(int i, int i2) {
        zzjy zzb = zzjz.zzb();
        zzb.zza(i);
        return new zzfz((zzjz) zzb.zzk(), i2);
    }

    public final zzga zza() {
        return new zzcr(this, zzjz.class);
    }

    public final zzmt zzb() {
        return zzmt.SYMMETRIC;
    }

    public final /* synthetic */ zzadm zzc(zzabe zzabe) throws zzacp {
        return zzjw.zzd(zzabe, zzabu.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzadm zzadm) throws GeneralSecurityException {
        zzjw zzjw = (zzjw) zzadm;
        zzpu.zzc(zzjw.zza(), 0);
        zzpu.zzb(zzjw.zze().zzd());
    }

    public final int zzf() {
        return 2;
    }
}
