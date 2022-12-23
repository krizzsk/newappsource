package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfc */
public final class zzfc extends zzgu {
    public zzfc() {
        super(zzmm.class, zzmp.class, new zzfa(zzau.class));
    }

    public static /* bridge */ /* synthetic */ zzfz zzh(int i, int i2, int i3, int i4) {
        zzmi zza = zzmj.zza();
        zza.zzc(i);
        zza.zzb(i2);
        zza.zza(i3);
        zzmf zza2 = zzmg.zza();
        zza2.zza((zzmj) zza.zzk());
        return new zzfz((zzmg) zza2.zzk(), i4);
    }

    public final zzga zza() {
        return new zzfb(this, zzmg.class);
    }

    public final zzmt zzb() {
        return zzmt.ASYMMETRIC_PRIVATE;
    }

    public final /* synthetic */ zzadm zzc(zzabe zzabe) throws zzacp {
        return zzmm.zzd(zzabe, zzabu.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzadm zzadm) throws GeneralSecurityException {
        zzmm zzmm = (zzmm) zzadm;
        if (zzmm.zzf().zzs()) {
            throw new GeneralSecurityException("Private key is empty.");
        } else if (zzmm.zzk()) {
            zzpu.zzc(zzmm.zza(), 0);
            zzff.zza(zzmm.zze().zzb());
        } else {
            throw new GeneralSecurityException("Missing public key.");
        }
    }

    public final /* synthetic */ zzadm zzg(zzadm zzadm) throws GeneralSecurityException {
        return ((zzmm) zzadm).zze();
    }
}
