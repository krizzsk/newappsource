package com.google.android.gms.internal.mlkit_vision_face;

import java.util.HashMap;
import java.util.Map;
import p789se.C19449c;
import p789se.C19451e;
import p813te.C19669b;

public final class zzda implements C19669b<zzda> {
    public static final /* synthetic */ int zza = 0;
    private static final C19449c<Object> zzb = zzcz.zza;
    private final Map<Class<?>, C19449c<?>> zzc = new HashMap();
    private final Map<Class<?>, C19451e<?>> zzd = new HashMap();
    private final C19449c<Object> zze = zzb;

    public final /* bridge */ /* synthetic */ C19669b registerEncoder(Class cls, C19449c cVar) {
        this.zzc.put(cls, cVar);
        this.zzd.remove(cls);
        return this;
    }

    public final /* bridge */ /* synthetic */ C19669b registerEncoder(Class cls, C19451e eVar) {
        this.zzd.put(cls, eVar);
        this.zzc.remove(cls);
        return this;
    }

    public final zzdb zza() {
        return new zzdb(new HashMap(this.zzc), new HashMap(this.zzd), this.zze);
    }
}
