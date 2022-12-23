package com.google.android.gms.internal.mlkit_vision_common;

import java.util.HashMap;
import java.util.Map;
import p789se.C19449c;
import p789se.C19451e;
import p813te.C19669b;

public final class zzal implements C19669b {
    public static final /* synthetic */ int zza = 0;
    private static final C19449c zzb = zzak.zza;
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private final C19449c zze = zzb;

    public final /* bridge */ /* synthetic */ C19669b registerEncoder(Class cls, C19449c cVar) {
        this.zzc.put(cls, cVar);
        this.zzd.remove(cls);
        return this;
    }

    public final zzam zza() {
        return new zzam(new HashMap(this.zzc), new HashMap(this.zzd), this.zze);
    }

    public final /* bridge */ /* synthetic */ C19669b registerEncoder(Class cls, C19451e eVar) {
        this.zzd.put(cls, eVar);
        this.zzc.remove(cls);
        return this;
    }
}
