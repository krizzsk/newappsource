package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

public final class zzfzg extends zzgar {
    public zzfzg() {
        super(zzgda.class, new zzfze(zzfwj.class));
    }

    public final zzgap zza() {
        return new zzfzf(this, zzgdd.class);
    }

    public final /* synthetic */ zzgly zzb(zzgjg zzgjg) throws zzgla {
        return zzgda.zze(zzgjg, zzgka.zza());
    }

    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgly zzgly) throws GeneralSecurityException {
        zzgda zzgda = (zzgda) zzgly;
        zzgik.zzb(zzgda.zza(), 0);
        if (zzgda.zzf().zzd() != 64) {
            throw new InvalidKeyException(C25541a.m63878h("invalid key size: ", zzgda.zzf().zzd(), ". Valid keys must have 64 bytes."));
        }
    }

    public final int zzf() {
        return 3;
    }
}
