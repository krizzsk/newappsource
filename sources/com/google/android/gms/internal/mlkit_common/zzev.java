package com.google.android.gms.internal.mlkit_common;

import java.io.IOException;
import java.util.HashMap;
import p001a0.C0017h;
import p789se.C19448b;
import p789se.C19449c;
import p789se.C19450d;

final class zzev implements C19449c {
    public static final zzev zza = new zzev();
    private static final C19448b zzb;
    private static final C19448b zzc;
    private static final C19448b zzd;
    private static final C19448b zze;

    static {
        zzbi L = C0017h.m55L(1);
        HashMap hashMap = new HashMap();
        hashMap.put(L.annotationType(), L);
        zzb = new C19448b("modelInfo", C16530d.m42017j(hashMap));
        zzbi L2 = C0017h.m55L(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(L2.annotationType(), L2);
        zzc = new C19448b("initialDownloadConditions", C16530d.m42017j(hashMap2));
        zzbi L3 = C0017h.m55L(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(L3.annotationType(), L3);
        zzd = new C19448b("updateDownloadConditions", C16530d.m42017j(hashMap3));
        zzbi L4 = C0017h.m55L(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(L4.annotationType(), L4);
        zze = new C19448b("isModelUpdateEnabled", C16530d.m42017j(hashMap4));
    }

    private zzev() {
    }

    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        C19450d dVar = (C19450d) obj2;
        dVar.add(zzb, (Object) ((zziu) obj).zza());
        dVar.add(zzc, (Object) null);
        dVar.add(zzd, (Object) null);
        dVar.add(zze, (Object) null);
    }
}
