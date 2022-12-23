package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcp */
public final class zzcp extends zzgb {
    public zzcp() {
        super(zzjn.class, new zzcn(zzap.class));
    }

    public static /* bridge */ /* synthetic */ zzfz zzg(int i, int i2, int i3) {
        zzjp zzb = zzjq.zzb();
        zzb.zza(i);
        zzjs zzb2 = zzjt.zzb();
        zzb2.zza(16);
        zzb.zzb((zzjt) zzb2.zzk());
        return new zzfz((zzjq) zzb.zzk(), i3);
    }

    public final zzga zza() {
        return new zzco(this, zzjq.class);
    }

    public final zzmt zzb() {
        return zzmt.SYMMETRIC;
    }

    public final /* synthetic */ zzadm zzc(zzabe zzabe) throws zzacp {
        return zzjn.zzd(zzabe, zzabu.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzadm zzadm) throws GeneralSecurityException {
        zzjn zzjn = (zzjn) zzadm;
        zzpu.zzc(zzjn.zza(), 0);
        zzpu.zzb(zzjn.zzf().zzd());
        if (zzjn.zze().zza() != 12 && zzjn.zze().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
