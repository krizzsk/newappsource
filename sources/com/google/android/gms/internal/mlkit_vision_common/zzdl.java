package com.google.android.gms.internal.mlkit_vision_common;

import java.io.IOException;
import java.util.HashMap;
import p789se.C19448b;
import p789se.C19449c;
import p789se.C19450d;

final class zzdl implements C19449c {
    public static final zzdl zza = new zzdl();
    private static final C19448b zzb;
    private static final C19448b zzc;
    private static final C19448b zzd;

    static {
        zzah f = C13555b.m33967f(1);
        HashMap hashMap = new HashMap();
        hashMap.put(f.annotationType(), f);
        zzb = new C19448b("source", C16530d.m42017j(hashMap));
        zzah f2 = C13555b.m33967f(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(f2.annotationType(), f2);
        zzc = new C19448b("errorCode", C16530d.m42017j(hashMap2));
        zzah f3 = C13555b.m33967f(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(f3.annotationType(), f3);
        zzd = new C19448b("errorMessage", C16530d.m42017j(hashMap3));
    }

    private zzdl() {
    }

    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zziu zziu = (zziu) obj;
        C19450d dVar = (C19450d) obj2;
        throw null;
    }
}
