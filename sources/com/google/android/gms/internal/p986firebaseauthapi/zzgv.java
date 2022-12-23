package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgv */
public final class zzgv implements zzgx {
    private final String zza;
    private final zzpx zzb;
    private final zzabe zzc;
    private final zzmt zzd;
    private final zzoa zze;
    private final Integer zzf;

    private zzgv(String str, zzabe zzabe, zzmt zzmt, zzoa zzoa, Integer num) {
        this.zza = str;
        this.zzb = zzhg.zzb(str);
        this.zzc = zzabe;
        this.zzd = zzmt;
        this.zze = zzoa;
        this.zzf = num;
    }

    public static zzgv zza(String str, zzabe zzabe, zzmt zzmt, zzoa zzoa, Integer num) throws GeneralSecurityException {
        if (zzoa == zzoa.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new zzgv(str, zzabe, zzmt, zzoa, num);
    }

    public final zzmt zzb() {
        return this.zzd;
    }

    public final zzoa zzc() {
        return this.zze;
    }

    public final zzpx zzd() {
        return this.zzb;
    }

    public final zzabe zze() {
        return this.zzc;
    }

    public final Integer zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zza;
    }
}
