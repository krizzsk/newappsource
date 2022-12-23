package com.google.android.gms.internal.mlkit_vision_common;

import java.io.IOException;
import java.util.HashMap;
import p789se.C19448b;
import p789se.C19449c;
import p789se.C19450d;

final class zzef implements C19449c {
    public static final zzef zza = new zzef();
    private static final C19448b zzb;
    private static final C19448b zzc;

    static {
        zzah f = C13555b.m33967f(1);
        HashMap hashMap = new HashMap();
        hashMap.put(f.annotationType(), f);
        zzb = new C19448b("detectorOptions", C16530d.m42017j(hashMap));
        zzah f2 = C13555b.m33967f(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(f2.annotationType(), f2);
        zzc = new C19448b("errorCode", C16530d.m42017j(hashMap2));
    }

    private zzef() {
    }

    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzho zzho = (zzho) obj;
        C19450d dVar = (C19450d) obj2;
        throw null;
    }
}
