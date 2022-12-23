package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbx */
final class zzbx extends zzaz implements zzbw {
    private final zzgu zza;
    private final zzgb zzb;

    public zzbx(zzgu zzgu, zzgb zzgb, Class cls) {
        super(zzgu, cls);
        this.zza = zzgu;
        this.zzb = zzgb;
    }

    public final zzmu zzf(zzabe zzabe) throws GeneralSecurityException {
        try {
            zzadm zzc = this.zza.zzc(zzabe);
            this.zza.zze(zzc);
            zzadm zzg = this.zza.zzg(zzc);
            this.zzb.zze(zzg);
            zzmr zza2 = zzmu.zza();
            zza2.zzb(this.zzb.zzd());
            zza2.zzc(zzg.zzo());
            zza2.zza(this.zzb.zzb());
            return (zzmu) zza2.zzk();
        } catch (zzacp e) {
            throw new GeneralSecurityException("expected serialized proto of type ", e);
        }
    }
}
