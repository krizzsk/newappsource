package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcj */
public final class zzcj extends zzgb {
    public zzcj() {
        super(zziy.class, new zzch(zzap.class));
    }

    public static /* bridge */ /* synthetic */ zzfz zzg(int i, int i2, int i3, int i4, int i5, int i6) {
        zzjg zzb = zzjh.zzb();
        zzjj zzb2 = zzjk.zzb();
        zzb2.zza(16);
        zzb.zzb((zzjk) zzb2.zzk());
        zzb.zza(i);
        zzlx zzb3 = zzly.zzb();
        zzma zzb4 = zzmb.zzb();
        zzb4.zzb(5);
        zzb4.zza(i4);
        zzb3.zzb((zzmb) zzb4.zzk());
        zzb3.zza(32);
        zzja zza = zzjb.zza();
        zza.zza((zzjh) zzb.zzk());
        zza.zzb((zzly) zzb3.zzk());
        return new zzfz((zzjb) zza.zzk(), i6);
    }

    public final zzga zza() {
        return new zzci(this, zzjb.class);
    }

    public final zzmt zzb() {
        return zzmt.SYMMETRIC;
    }

    public final /* synthetic */ zzadm zzc(zzabe zzabe) throws zzacp {
        return zziy.zzd(zzabe, zzabu.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzadm zzadm) throws GeneralSecurityException {
        zziy zziy = (zziy) zzadm;
        zzpu.zzc(zziy.zza(), 0);
        new zzcm();
        zzcm.zzh(zziy.zze());
        new zzhu();
        zzhu.zzh(zziy.zzf());
    }

    public final int zzf() {
        return 2;
    }
}
