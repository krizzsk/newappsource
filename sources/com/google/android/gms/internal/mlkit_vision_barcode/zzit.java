package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.IOException;
import java.util.HashMap;
import p789se.C19448b;
import p789se.C19449c;
import p789se.C19450d;

final class zzit implements C19449c {
    public static final zzit zza = new zzit();
    private static final C19448b zzb;
    private static final C19448b zzc;
    private static final C19448b zzd;

    static {
        zzdj d = C25541a.m63874d(1);
        HashMap hashMap = new HashMap();
        hashMap.put(d.annotationType(), d);
        zzb = new C19448b("numSamples", C16530d.m42017j(hashMap));
        zzdj d2 = C25541a.m63874d(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(d2.annotationType(), d2);
        zzc = new C19448b("errorCode", C16530d.m42017j(hashMap2));
        zzdj d3 = C25541a.m63874d(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(d3.annotationType(), d3);
        zzd = new C19448b("metricResults", C16530d.m42017j(hashMap3));
    }

    private zzit() {
    }

    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzmt zzmt = (zzmt) obj;
        C19450d dVar = (C19450d) obj2;
        throw null;
    }
}
