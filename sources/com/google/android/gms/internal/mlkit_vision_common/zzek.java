package com.google.android.gms.internal.mlkit_vision_common;

import java.io.IOException;
import java.util.HashMap;
import p789se.C19448b;
import p789se.C19449c;
import p789se.C19450d;

final class zzek implements C19449c {
    public static final zzek zza = new zzek();
    private static final C19448b zzb;
    private static final C19448b zzc;

    static {
        zzah f = C13555b.m33967f(1);
        HashMap hashMap = new HashMap();
        hashMap.put(f.annotationType(), f);
        zzb = new C19448b("confidence", C16530d.m42017j(hashMap));
        zzah f2 = C13555b.m33967f(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(f2.annotationType(), f2);
        zzc = new C19448b("languageCode", C16530d.m42017j(hashMap2));
    }

    private zzek() {
    }

    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzhs zzhs = (zzhs) obj;
        C19450d dVar = (C19450d) obj2;
        throw null;
    }
}
