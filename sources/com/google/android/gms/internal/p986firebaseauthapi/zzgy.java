package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgy */
public final class zzgy {
    /* access modifiers changed from: private */
    public final Map zza;
    /* access modifiers changed from: private */
    public final Map zzb;
    /* access modifiers changed from: private */
    public final Map zzc;
    /* access modifiers changed from: private */
    public final Map zzd;

    public zzgy() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
    }

    public final zzgy zza(zzfv zzfv) throws GeneralSecurityException {
        zzha zzha = new zzha(zzfv.zzd(), zzfv.zzc(), (zzgz) null);
        if (this.zzb.containsKey(zzha)) {
            zzfv zzfv2 = (zzfv) this.zzb.get(zzha);
            if (!zzfv2.equals(zzfv) || !zzfv.equals(zzfv2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzha.toString()));
            }
        } else {
            this.zzb.put(zzha, zzfv);
        }
        return this;
    }

    public final zzgy zzb(zzfy zzfy) throws GeneralSecurityException {
        zzhc zzhc = new zzhc(zzfy.zza(), zzfy.zzb(), (zzhb) null);
        if (this.zza.containsKey(zzhc)) {
            zzfy zzfy2 = (zzfy) this.zza.get(zzhc);
            if (!zzfy2.equals(zzfy) || !zzfy.equals(zzfy2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzhc.toString()));
            }
        } else {
            this.zza.put(zzhc, zzfy);
        }
        return this;
    }

    public final zzgy zzc(zzgp zzgp) throws GeneralSecurityException {
        zzha zzha = new zzha(zzgp.zzb(), zzgp.zza(), (zzgz) null);
        if (this.zzd.containsKey(zzha)) {
            zzgp zzgp2 = (zzgp) this.zzd.get(zzha);
            if (!zzgp2.equals(zzgp) || !zzgp.equals(zzgp2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzha.toString()));
            }
        } else {
            this.zzd.put(zzha, zzgp);
        }
        return this;
    }

    public final zzgy zzd(zzgs zzgs) throws GeneralSecurityException {
        zzhc zzhc = new zzhc(zzgs.zza(), zzgs.zzb(), (zzhb) null);
        if (this.zzc.containsKey(zzhc)) {
            zzgs zzgs2 = (zzgs) this.zzc.get(zzhc);
            if (!zzgs2.equals(zzgs) || !zzgs.equals(zzgs2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzhc.toString()));
            }
        } else {
            this.zzc.put(zzhc, zzgs);
        }
        return this;
    }

    public zzgy(zzhe zzhe) {
        this.zza = new HashMap(zzhe.zza);
        this.zzb = new HashMap(zzhe.zzb);
        this.zzc = new HashMap(zzhe.zzc);
        this.zzd = new HashMap(zzhe.zzd);
    }
}
