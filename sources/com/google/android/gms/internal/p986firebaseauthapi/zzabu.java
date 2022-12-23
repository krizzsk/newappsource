package com.google.android.gms.internal.p986firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabu */
public final class zzabu {
    public static final zzabu zza = new zzabu(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private final Map zzd;

    public zzabu() {
        this.zzd = new HashMap();
    }

    public static zzabu zza() {
        return zza;
    }

    public final zzacf zzb(zzadm zzadm, int i) {
        return (zzacf) this.zzd.get(new zzabt(zzadm, i));
    }

    public zzabu(boolean z) {
        this.zzd = Collections.emptyMap();
    }
}
