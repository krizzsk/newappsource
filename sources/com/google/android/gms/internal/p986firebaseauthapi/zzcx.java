package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcx */
final class zzcx extends zzga {
    public final /* synthetic */ zzcy zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzcx(zzcy zzcy, Class cls) {
        super(cls);
        this.zza = zzcy;
    }

    public final /* bridge */ /* synthetic */ zzadm zza(zzadm zzadm) throws GeneralSecurityException {
        zzkr zzkr = (zzkr) zzadm;
        zzkn zzb = zzko.zzb();
        zzb.zzb(0);
        zzb.zza(zzabe.zzn(zzps.zza(32)));
        return (zzko) zzb.zzk();
    }

    public final /* synthetic */ zzadm zzb(zzabe zzabe) throws zzacp {
        return zzkr.zzc(zzabe, zzabu.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", new zzfz(zzkr.zzb(), 1));
        hashMap.put("CHACHA20_POLY1305_RAW", new zzfz(zzkr.zzb(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzadm zzadm) throws GeneralSecurityException {
        zzkr zzkr = (zzkr) zzadm;
    }
}
