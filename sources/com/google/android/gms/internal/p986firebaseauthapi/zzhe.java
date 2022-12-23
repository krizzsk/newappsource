package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import p358af.C13437d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhe */
public final class zzhe {
    /* access modifiers changed from: private */
    public final Map zza;
    /* access modifiers changed from: private */
    public final Map zzb;
    /* access modifiers changed from: private */
    public final Map zzc;
    /* access modifiers changed from: private */
    public final Map zzd;

    public /* synthetic */ zzhe(zzgy zzgy, zzhd zzhd) {
        this.zza = new HashMap(zzgy.zza);
        this.zzb = new HashMap(zzgy.zzb);
        this.zzc = new HashMap(zzgy.zzc);
        this.zzd = new HashMap(zzgy.zzd);
    }

    public final zzaw zza(zzgx zzgx, zzca zzca) throws GeneralSecurityException {
        zzha zzha = new zzha(zzgx.getClass(), zzgx.zzd(), (zzgz) null);
        if (this.zzb.containsKey(zzha)) {
            return ((zzfv) this.zzb.get(zzha)).zza(zzgx, zzca);
        }
        throw new GeneralSecurityException(C13437d.m33706k("No Key Parser for requested key type ", zzha.toString(), " available"));
    }
}
