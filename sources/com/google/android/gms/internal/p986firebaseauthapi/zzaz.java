package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaz */
class zzaz implements zzax {
    private final zzgb zza;
    private final Class zzb;

    public zzaz(zzgb zzgb, Class cls) {
        if (zzgb.zzm().contains(cls) || Void.class.equals(cls)) {
            this.zza = zzgb;
            this.zzb = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", new Object[]{zzgb.toString(), cls.getName()}));
    }

    private final zzay zzf() {
        return new zzay(this.zza.zza());
    }

    private final Object zzg(zzadm zzadm) throws GeneralSecurityException {
        if (!Void.class.equals(this.zzb)) {
            this.zza.zze(zzadm);
            return this.zza.zzl(zzadm, this.zzb);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    public final zzmu zza(zzabe zzabe) throws GeneralSecurityException {
        try {
            zzadm zza2 = zzf().zza(zzabe);
            zzmr zza3 = zzmu.zza();
            zza3.zzb(this.zza.zzd());
            zza3.zzc(zza2.zzo());
            zza3.zza(this.zza.zzb());
            return (zzmu) zza3.zzk();
        } catch (zzacp e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    public final zzadm zzb(zzabe zzabe) throws GeneralSecurityException {
        try {
            return zzf().zza(zzabe);
        } catch (zzacp e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.zza.zza().zzg().getName()), e);
        }
    }

    public final Object zzc(zzabe zzabe) throws GeneralSecurityException {
        try {
            return zzg(this.zza.zzc(zzabe));
        } catch (zzacp e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.zza.zzk().getName()), e);
        }
    }

    public final Object zzd(zzadm zzadm) throws GeneralSecurityException {
        String concat = "Expected proto of type ".concat(this.zza.zzk().getName());
        if (this.zza.zzk().isInstance(zzadm)) {
            return zzg(zzadm);
        }
        throw new GeneralSecurityException(concat);
    }

    public final String zze() {
        return this.zza.zzd();
    }
}
