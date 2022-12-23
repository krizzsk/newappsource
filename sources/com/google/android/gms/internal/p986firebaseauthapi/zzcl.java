package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcl */
final class zzcl extends zzga {
    public final /* synthetic */ zzcm zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzcl(zzcm zzcm, Class cls) {
        super(cls);
        this.zza = zzcm;
    }

    public static final zzje zzf(zzjh zzjh) throws GeneralSecurityException {
        zzjd zzb = zzje.zzb();
        zzb.zzb(zzjh.zzf());
        zzb.zza(zzabe.zzn(zzps.zza(zzjh.zza())));
        zzb.zzc(0);
        return (zzje) zzb.zzk();
    }

    public final /* bridge */ /* synthetic */ zzadm zza(zzadm zzadm) throws GeneralSecurityException {
        return zzf((zzjh) zzadm);
    }

    public final /* synthetic */ zzadm zzb(zzabe zzabe) throws zzacp {
        return zzjh.zze(zzabe, zzabu.zza());
    }

    /* renamed from: zze */
    public final void zzd(zzjh zzjh) throws GeneralSecurityException {
        zzpu.zzb(zzjh.zza());
        zzcm.zzi(zzjh.zzf());
    }
}
