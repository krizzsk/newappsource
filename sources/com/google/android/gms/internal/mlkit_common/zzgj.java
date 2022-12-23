package com.google.android.gms.internal.mlkit_common;

import java.io.IOException;
import java.util.HashMap;
import p001a0.C0017h;
import p789se.C19448b;
import p789se.C19449c;
import p789se.C19450d;

final class zzgj implements C19449c {
    public static final zzgj zza = new zzgj();
    private static final C19448b zzb;
    private static final C19448b zzc;

    static {
        zzbi L = C0017h.m55L(1);
        HashMap hashMap = new HashMap();
        hashMap.put(L.annotationType(), L);
        zzb = new C19448b("language", C16530d.m42017j(hashMap));
        zzbi L2 = C0017h.m55L(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(L2.annotationType(), L2);
        zzc = new C19448b("inferenceCommonLogEvent", C16530d.m42017j(hashMap2));
    }

    private zzgj() {
    }

    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzkd zzkd = (zzkd) obj;
        C19450d dVar = (C19450d) obj2;
        throw null;
    }
}
