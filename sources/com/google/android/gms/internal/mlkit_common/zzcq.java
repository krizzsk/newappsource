package com.google.android.gms.internal.mlkit_common;

import java.io.IOException;
import java.util.HashMap;
import p001a0.C0017h;
import p789se.C19448b;
import p789se.C19449c;
import p789se.C19450d;

final class zzcq implements C19449c {
    public static final zzcq zza = new zzcq();
    private static final C19448b zzb;
    private static final C19448b zzc;
    private static final C19448b zzd;

    static {
        zzbi L = C0017h.m55L(1);
        HashMap hashMap = new HashMap();
        hashMap.put(L.annotationType(), L);
        zzb = new C19448b("logEventKey", C16530d.m42017j(hashMap));
        zzbi L2 = C0017h.m55L(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(L2.annotationType(), L2);
        zzc = new C19448b("eventCount", C16530d.m42017j(hashMap2));
        zzbi L3 = C0017h.m55L(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(L3.annotationType(), L3);
        zzd = new C19448b("inferenceDurationStats", C16530d.m42017j(hashMap3));
    }

    private zzcq() {
    }

    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzbv zzbv = (zzbv) obj;
        C19450d dVar = (C19450d) obj2;
        throw null;
    }
}
