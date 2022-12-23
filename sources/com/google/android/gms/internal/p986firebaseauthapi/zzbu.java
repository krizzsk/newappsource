package com.google.android.gms.internal.p986firebaseauthapi;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbu */
public final class zzbu {
    private final ConcurrentMap zza;
    private final zzbq zzb;
    private final Class zzc;
    private final zzie zzd;

    public /* synthetic */ zzbu(ConcurrentMap concurrentMap, zzbq zzbq, zzie zzie, Class cls, zzbt zzbt) {
        this.zza = concurrentMap;
        this.zzb = zzbq;
        this.zzc = cls;
        this.zzd = zzie;
    }

    public final zzbq zza() {
        return this.zzb;
    }

    public final zzie zzb() {
        return this.zzd;
    }

    public final Class zzc() {
        return this.zzc;
    }

    public final Collection zzd() {
        return this.zza.values();
    }

    public final List zze(byte[] bArr) {
        List list = (List) this.zza.get(new zzbs(bArr, (zzbr) null));
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }

    public final boolean zzf() {
        return !this.zzd.zza().isEmpty();
    }
}
