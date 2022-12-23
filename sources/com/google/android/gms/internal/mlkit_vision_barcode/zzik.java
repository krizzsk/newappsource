package com.google.android.gms.internal.mlkit_vision_barcode;

import com.appsflyer.ServerParameters;
import java.io.IOException;
import java.util.HashMap;
import p789se.C19448b;
import p789se.C19449c;
import p789se.C19450d;

final class zzik implements C19449c {
    public static final zzik zza = new zzik();
    private static final C19448b zzb;
    private static final C19448b zzc;

    static {
        zzdj d = C25541a.m63874d(1);
        HashMap hashMap = new HashMap();
        hashMap.put(d.annotationType(), d);
        zzb = new C19448b("stageId", C16530d.m42017j(hashMap));
        zzdj d2 = C25541a.m63874d(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(d2.annotationType(), d2);
        zzc = new C19448b(ServerParameters.DEVICE_KEY, C16530d.m42017j(hashMap2));
    }

    private zzik() {
    }

    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzmr zzmr = (zzmr) obj;
        C19450d dVar = (C19450d) obj2;
        throw null;
    }
}
