package com.google.android.gms.internal.mlkit_common;

import com.appsflyer.ServerParameters;
import java.io.IOException;
import java.util.HashMap;
import p001a0.C0017h;
import p789se.C19448b;
import p789se.C19449c;
import p789se.C19450d;

final class zzgf implements C19449c {
    public static final zzgf zza = new zzgf();
    private static final C19448b zzb;
    private static final C19448b zzc;

    static {
        zzbi L = C0017h.m55L(1);
        HashMap hashMap = new HashMap();
        hashMap.put(L.annotationType(), L);
        zzb = new C19448b("stageId", C16530d.m42017j(hashMap));
        zzbi L2 = C0017h.m55L(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(L2.annotationType(), L2);
        zzc = new C19448b(ServerParameters.DEVICE_KEY, C16530d.m42017j(hashMap2));
    }

    private zzgf() {
    }

    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzko zzko = (zzko) obj;
        C19450d dVar = (C19450d) obj2;
        throw null;
    }
}
