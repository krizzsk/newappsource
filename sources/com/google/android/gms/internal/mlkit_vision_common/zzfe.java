package com.google.android.gms.internal.mlkit_vision_common;

import com.appsflyer.ServerParameters;
import java.io.IOException;
import java.util.HashMap;
import p789se.C19448b;
import p789se.C19449c;
import p789se.C19450d;

final class zzfe implements C19449c {
    public static final zzfe zza = new zzfe();
    private static final C19448b zzb;
    private static final C19448b zzc;

    static {
        zzah f = C13555b.m33967f(1);
        HashMap hashMap = new HashMap();
        hashMap.put(f.annotationType(), f);
        zzb = new C19448b("stageId", C16530d.m42017j(hashMap));
        zzah f2 = C13555b.m33967f(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(f2.annotationType(), f2);
        zzc = new C19448b(ServerParameters.DEVICE_KEY, C16530d.m42017j(hashMap2));
    }

    private zzfe() {
    }

    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzja zzja = (zzja) obj;
        C19450d dVar = (C19450d) obj2;
        throw null;
    }
}
